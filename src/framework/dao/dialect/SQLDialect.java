package framework.dao.dialect;

public interface SQLDialect {
	
	public String getLimitString(String sql,int start,int size);

}
