package framework.dao;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import framework.dao.dialect.SQLDialect;
import framework.dao.mapping.SimpleMapping;

@Repository
public abstract class Dao<T> extends JdbcTemplate {
	
	
	private SQLDialect sqlDialect;


	@Autowired
	public void Dao(@Qualifier("dataSource")DataSource dataSource,SQLDialect sqlDialect){
		super.setDataSource(dataSource);
		setSqlDialect(sqlDialect);
	}
	
	protected Class<T> typeClass() {   
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];   
    }
	
	public int count(){
		String tableName=toDBName(typeClass().getSimpleName());
		String sql="select count(*) from "+tableName;
		return queryForInt(sql);
	}
	
	public int count(String sql){
		String curSql="select count(*) from ("+sql+") t";
		return queryForInt(curSql);
	}
	
	public T unique(String sql){
		List<T> rs=list(sql);
		if(rs!=null && !rs.isEmpty()){
			return rs.get(0);
		}
		return null;
	}
	
	
	public List<T> list(){
		String tableName=toDBName(typeClass().getSimpleName());
		return super.query("SELECT * FROM "+tableName,mapping());
	}
	
	public Page<T> list(int start,int size){
		String tableName=toDBName(typeClass().getSimpleName());
		String sql="SELECT * FROM "+tableName;
		return list(sql, start, size);
		
	}
	
	public List<T> list(String sql){
		return super.query(sql,mapping());
	}
	
	public Page<T> list(String sql,int start,int size){
		Page<T> rst=new Page<T>();
		int total=count(sql);
		String tableName=toDBName(typeClass().getSimpleName());
		String curSql=sqlDialect.getLimitString(sql, start, size);
		rst.setSize(size);
		rst.setStart(start);
		rst.setTotal(total);
		rst.setData(query(curSql, mapping()));
		return rst;		
	}
	
	public SimpleMapping<T> mapping(){
		return new SimpleMapping<T>(typeClass());
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
