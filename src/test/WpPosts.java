package test;

import org.springframework.stereotype.Repository;

import framework.dao.Dao;

@Repository
public class WpPosts extends Dao<WpPosts>{
	
	private String postContent;

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	} 

}
