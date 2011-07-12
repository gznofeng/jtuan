package app.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import app.model.Team;
import app.model.User;

import framework.test.BaseTest;

public class UserTest extends BaseTest {

	@Autowired
	User userDao;
	
	@Autowired
	Team teamDao;
	
	@Test
	public void test(){
		System.out.println(teamDao.count());
		System.out.println(userDao.count());
	}
}
