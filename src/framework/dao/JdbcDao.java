package framework.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import framework.dao.dialect.SQLDialect;
import framework.dao.mapping.SimpleMapping;

public class JdbcDao extends JdbcTemplate{
	
	private SQLDialect sqlDialect;
	
	public int count(String sql){
		StringBuffer csql=new StringBuffer("SELECT COUNT(*) FROM (")
		.append(sql)
		.append(")");
		return queryForInt(csql.toString());		
	}
	
	public <T>T unique(Class<T> clz,String sql){
		List<T> rs=list(clz, sql);
		if(rs!=null && !rs.isEmpty()){
			return rs.get(0);
		}
		return null;
	}
	
	public List listByConfig(Object object,String sqlName){
		try {
			String sql=SQLProperties.getExecuteSql(sqlName, object);
			return list(object.getClass(),sql);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public <T>Page<T> list(Class<T> clz,String sql,int start,int limit){
		Page<T> page=new Page<T>();
		page.setStart(start);
		page.setSize(limit);
		int total=count(sql);
		page.setTotal(total);
		String executeSql=sqlDialect.getLimitString(sql, start, limit);
		List<T> data=super.query(executeSql,mapping(clz));
		page.setData(data);
		return page; 
	}
	public <T>List<T> list(Class<T> clz,String sql){
		return super.query(sql,mapping(clz)); 
	}
	
	public <T>List<T> list(Class<T> clz){
		String tableName=toDBName(clz.getSimpleName());
		String sql="SELECT * FROM "+tableName;
		return list(clz, sql);
	}
	
	public <T>Page<T> list(Class<T> clz,int start,int limit){
		String tableName=toDBName(clz.getSimpleName());
		String sql="SELECT * FROM "+tableName;
		return list(clz, sql, start, limit);
	}
	
	public SimpleMapping mapping(Class clz){
		return new SimpleMapping(clz);
	}

	//对像名称格式转换成数据库格式
	public static String toDBName(String objectName){
		try {
			StringBuffer result=new StringBuffer();
			result.append(objectName.charAt(0));
			for (int i = 1; i < objectName.length(); i++) {
				char c=objectName.charAt(i);
				if(Character.isUpperCase(c)){
					result.append("_");
				}
				result.append(objectName.charAt(i));
			}
			return result.toString().toUpperCase();
		} catch (Exception e) {
			return objectName;
		}		
	}

	public void setSqlDialect(SQLDialect sqlDialect) {
		this.sqlDialect = sqlDialect;
	}


	

}
