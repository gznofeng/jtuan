package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Invite extends Dao<Invite> implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer userId;
	private Integer adminId;
	private String userIp;
	private Integer otherUserId;
	private String otherUserIp;
	private Integer teamId;
	private String pay;
	private Integer credit;
	private Integer buyTime;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Invite() {
	}

	/** minimal constructor */
	public Invite(Integer userId, Integer adminId, Integer otherUserId,
			Integer teamId, String pay, Integer credit, Integer buyTime,
			Integer createTime) {
		this.userId = userId;
		this.adminId = adminId;
		this.otherUserId = otherUserId;
		this.teamId = teamId;
		this.pay = pay;
		this.credit = credit;
		this.buyTime = buyTime;
		this.createTime = createTime;
	}

	/** full constructor */
	public Invite(Integer userId, Integer adminId, String userIp,
			Integer otherUserId, String otherUserIp, Integer teamId,
			String pay, Integer credit, Integer buyTime, Integer createTime) {
		this.userId = userId;
		this.adminId = adminId;
		this.userIp = userIp;
		this.otherUserId = otherUserId;
		this.otherUserIp = otherUserIp;
		this.teamId = teamId;
		this.pay = pay;
		this.credit = credit;
		this.buyTime = buyTime;
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

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public Integer getOtherUserId() {
		return this.otherUserId;
	}

	public void setOtherUserId(Integer otherUserId) {
		this.otherUserId = otherUserId;
	}

	public String getOtherUserIp() {
		return this.otherUserIp;
	}

	public void setOtherUserIp(String otherUserIp) {
		this.otherUserIp = otherUserIp;
	}

	public Integer getTeamId() {
		return this.teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getPay() {
		return this.pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getBuyTime() {
		return this.buyTime;
	}

	public void setBuyTime(Integer buyTime) {
		this.buyTime = buyTime;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}