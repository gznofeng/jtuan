package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Coupon extends Dao<Coupon> implements java.io.Serializable {

	// Fields

	private String id;
	private Integer userId;
	private Integer partnerId;
	private Integer teamId;
	private Integer orderId;
	private String type;
	private Integer credit;
	private String secret;
	private String consume;
	private String ip;
	private Integer sms;
	private Integer expireTime;
	private Integer consumeTime;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Coupon() {
	}

	/** minimal constructor */
	public Coupon(String id, Integer userId, Integer partnerId, Integer teamId,
			Integer orderId, String type, Integer credit, String consume,
			Integer sms, Integer expireTime, Integer consumeTime,
			Integer createTime) {
		this.id = id;
		this.userId = userId;
		this.partnerId = partnerId;
		this.teamId = teamId;
		this.orderId = orderId;
		this.type = type;
		this.credit = credit;
		this.consume = consume;
		this.sms = sms;
		this.expireTime = expireTime;
		this.consumeTime = consumeTime;
		this.createTime = createTime;
	}

	/** full constructor */
	public Coupon(String id, Integer userId, Integer partnerId, Integer teamId,
			Integer orderId, String type, Integer credit, String secret,
			String consume, String ip, Integer sms, Integer expireTime,
			Integer consumeTime, Integer createTime) {
		this.id = id;
		this.userId = userId;
		this.partnerId = partnerId;
		this.teamId = teamId;
		this.orderId = orderId;
		this.type = type;
		this.credit = credit;
		this.secret = secret;
		this.consume = consume;
		this.ip = ip;
		this.sms = sms;
		this.expireTime = expireTime;
		this.consumeTime = consumeTime;
		this.createTime = createTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	public Integer getTeamId() {
		return this.teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getConsume() {
		return this.consume;
	}

	public void setConsume(String consume) {
		this.consume = consume;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getSms() {
		return this.sms;
	}

	public void setSms(Integer sms) {
		this.sms = sms;
	}

	public Integer getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getConsumeTime() {
		return this.consumeTime;
	}

	public void setConsumeTime(Integer consumeTime) {
		this.consumeTime = consumeTime;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}