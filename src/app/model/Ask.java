package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Ask extends Dao<Ask> implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer userId;
	private Integer teamId;
	private Integer cityId;
	private String content;
	private String comment;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Ask() {
	}

	/** minimal constructor */
	public Ask(Integer userId, Integer teamId, Integer cityId,
			Integer createTime) {
		this.userId = userId;
		this.teamId = teamId;
		this.cityId = cityId;
		this.createTime = createTime;
	}

	/** full constructor */
	public Ask(Integer userId, Integer teamId, Integer cityId, String content,
			String comment, Integer createTime) {
		this.userId = userId;
		this.teamId = teamId;
		this.cityId = cityId;
		this.content = content;
		this.comment = comment;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTeamId() {
		return this.teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}