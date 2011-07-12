package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Topic extends Dao<Topic> implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer parentId;
	private Integer userId;
	private String title;
	private Integer teamId;
	private Integer cityId;
	private Integer publicId;
	private String content;
	private Integer head;
	private Integer replyNumber;
	private Integer viewNumber;
	private Integer lastUserId;
	private Integer lastTime;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Topic() {
	}

	/** minimal constructor */
	public Topic(Integer parentId, Integer userId, Integer teamId,
			Integer cityId, Integer publicId, Integer head,
			Integer replyNumber, Integer viewNumber, Integer lastUserId,
			Integer lastTime, Integer createTime) {
		this.parentId = parentId;
		this.userId = userId;
		this.teamId = teamId;
		this.cityId = cityId;
		this.publicId = publicId;
		this.head = head;
		this.replyNumber = replyNumber;
		this.viewNumber = viewNumber;
		this.lastUserId = lastUserId;
		this.lastTime = lastTime;
		this.createTime = createTime;
	}

	/** full constructor */
	public Topic(Integer parentId, Integer userId, String title,
			Integer teamId, Integer cityId, Integer publicId, String content,
			Integer head, Integer replyNumber, Integer viewNumber,
			Integer lastUserId, Integer lastTime, Integer createTime) {
		this.parentId = parentId;
		this.userId = userId;
		this.title = title;
		this.teamId = teamId;
		this.cityId = cityId;
		this.publicId = publicId;
		this.content = content;
		this.head = head;
		this.replyNumber = replyNumber;
		this.viewNumber = viewNumber;
		this.lastUserId = lastUserId;
		this.lastTime = lastTime;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Integer getPublicId() {
		return this.publicId;
	}

	public void setPublicId(Integer publicId) {
		this.publicId = publicId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getHead() {
		return this.head;
	}

	public void setHead(Integer head) {
		this.head = head;
	}

	public Integer getReplyNumber() {
		return this.replyNumber;
	}

	public void setReplyNumber(Integer replyNumber) {
		this.replyNumber = replyNumber;
	}

	public Integer getViewNumber() {
		return this.viewNumber;
	}

	public void setViewNumber(Integer viewNumber) {
		this.viewNumber = viewNumber;
	}

	public Integer getLastUserId() {
		return this.lastUserId;
	}

	public void setLastUserId(Integer lastUserId) {
		this.lastUserId = lastUserId;
	}

	public Integer getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Integer lastTime) {
		this.lastTime = lastTime;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}