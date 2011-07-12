package framework.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import framework.dao.dialect.SQLDialect;
import framework.dao.mapping.SimpleMapping;

public class SqliteDao extends JdbcTemplate{
	
	private SQLDialect sqlDialect;
	
	public int count(String sql){
		StringBuffer csql=new StringBuffer("SELECT COUNT(*) FROM (")
		.append(sql)
		.append(")");
		return queryForInt(csql.toString());		
	}
	
	public <T>List<T> list(Class<T> clz){
		String tableName=toDBName(clz.getSimpleName());
		return super.query("SELECT * FROM "+tableName,mapping(clz));
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
