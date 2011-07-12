package test;

import java.sql.*;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import framework.dao.JdbcDao;
import framework.test.BaseSqliteTest;

public class SqliteDaoTest extends BaseSqliteTest{

	@Autowired
	JdbcDao sqliteDao;

	@Test
	public void test(){
		try {
			List<FwQuerys> list=sqliteDao.list(FwQuerys.class);
			for (FwQuerys fwQuerys : list) {
				System.out.println(fwQuerys.getQuerySql());
			}
			System.out.println(sqliteDao.count("select * from FW_QUERYS"));
			Connection conn=sqliteDao.getDataSource().getConnection();
		    ResultSet rs=conn.createStatement().executeQuery("select * from FW_QUERYS");
		    while (rs.next()) {
				System.out.println(rs.getString("QUERY_SQL"));	
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
