package framework.dao.dialect;

public class SqliteDialect implements SQLDialect{

	public String getLimitString(String sql, int start, int size) {
		boolean hasOffset=false;
		if(size<1){size=1;}
		if(start>0){
			hasOffset=true;
		}
		return new StringBuffer(sql).append( hasOffset ? " limit "+size+" offset "+start+"" : " limit "+size ).toString();
	}
	
}
