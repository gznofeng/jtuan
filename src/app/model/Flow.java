package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Flow extends Dao<Flow> implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer userId;
	private Integer adminId;
	private String detailId;
	private String direction;
	private Double money;
	private String action;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Flow() {
	}

	/** minimal constructor */
	public Flow(Integer userId, Integer adminId, String direction,
			Double money, String action, Integer createTime) {
		this.userId = userId;
		this.adminId = adminId;
		this.direction = direction;
		this.money = money;
		this.action = action;
		this.createTime = createTime;
	}

	/** full constructor */
	public Flow(Integer userId, Integer adminId, String detailId,
			String direction, Double money, String action, Integer createTime) {
		this.userId = userId;
		this.adminId = adminId;
		this.detailId = detailId;
		this.direction = direction;
		this.money = money;
		this.action = action;
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

	public String getDetailId() {
		return this.detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}