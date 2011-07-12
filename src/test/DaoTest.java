package test;

import java.util.List;

import net.sf.json.JSONObject;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import framework.dao.Page;
import framework.test.BaseTest;


public class DaoTest extends BaseTest{
	
	@Autowired
	private WpComments wpComments;
	
	@Autowired
	private WpPosts posts;
	
	@Test
	public void test(){
		Assert.assertEquals(1,1);
		
		Page<WpComments> rs=wpComments.list(0,10);
		
		Page<WpPosts> prs=posts.list(0,10);
		
		for (WpPosts cprs : prs.getData()) {
			System.out.println(cprs.getPostContent());
			System.out.println(posts.unique("select * from wp_posts").getPostContent());
		}
		
		for (WpComments wpComments : rs.getData()) {
			JSONObject jsonObj=JSONObject.fromObject(wpComments);
			System.out.println(jsonObj.toString());
			System.out.println(wpComments.getCommentAuthor());
		}
	}

}
