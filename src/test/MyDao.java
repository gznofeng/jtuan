package test;

import org.springframework.stereotype.Repository;

import framework.dao.Dao;

@Repository
public class MyDao extends Dao {

	public void test(){
		String sql="select * from wp_comments ";
		System.out.println(super.queryForInt(sql));
	}
}
