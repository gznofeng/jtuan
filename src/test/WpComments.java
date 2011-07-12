package test;

import org.springframework.stereotype.Repository;

import framework.dao.Dao;

@Repository
public class WpComments extends Dao<WpComments> {
	
	private String commentAuthor;

	public String getCommentAuthor() {
		return commentAuthor;
	}

	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	} 

}
