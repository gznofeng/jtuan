package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Feedback extends Dao<Feedback> implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer cityId;
	private Integer userId;
	private String category;
	private String title;
	private String contact;
	private String content;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Feedback() {
	}

	/** minimal constructor */
	public Feedback(Integer cityId, Integer userId, String category,
			Integer createTime) {
		this.cityId = cityId;
		this.userId = userId;
		this.category = category;
		this.createTime = createTime;
	}

	/** full constructor */
	public Feedback(Integer cityId, Integer userId, String category,
			String title, String contact, String content, Integer createTime) {
		this.cityId = cityId;
		this.userId = userId;
		this.category = category;
		this.title = title;
		this.contact = contact;
		this.content = content;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}