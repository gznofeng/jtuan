package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Card extends Dao<Card> implements java.io.Serializable {

	// Fields

	private String id;
	private String code;
	private Integer partnerId;
	private Integer teamId;
	private Integer orderId;
	private Integer credit;
	private String consume;
	private String ip;
	private Integer beginTime;
	private Integer endTime;

	// Constructors

	/** default constructor */
	public Card() {
	}

	/** minimal constructor */
	public Card(String id, Integer partnerId, Integer teamId, Integer orderId,
			Integer credit, String consume, Integer beginTime, Integer endTime) {
		this.id = id;
		this.partnerId = partnerId;
		this.teamId = teamId;
		this.orderId = orderId;
		this.credit = credit;
		this.consume = consume;
		this.beginTime = beginTime;
		this.endTime = endTime;
	}

	/** full constructor */
	public Card(String id, String code, Integer partnerId, Integer teamId,
			Integer orderId, Integer credit, String consume, String ip,
			Integer beginTime, Integer endTime) {
		this.id = id;
		this.code = code;
		this.partnerId = partnerId;
		this.teamId = teamId;
		this.orderId = orderId;
		this.credit = credit;
		this.consume = consume;
		this.ip = ip;
		this.beginTime = beginTime;
		this.endTime = endTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
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

	public Integer getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Integer beginTime) {
		this.beginTime = beginTime;
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

}