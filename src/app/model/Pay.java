package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Pay extends Dao<Pay> implements java.io.Serializable {

	// Fields

	private String id;
	private Integer orderId;
	private String bank;
	private Double money;
	private String currency;
	private String service;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Pay() {
	}

	/** minimal constructor */
	public Pay(String id, Integer orderId, String currency, String service,
			Integer createTime) {
		this.id = id;
		this.orderId = orderId;
		this.currency = currency;
		this.service = service;
		this.createTime = createTime;
	}

	/** full constructor */
	public Pay(String id, Integer orderId, String bank, Double money,
			String currency, String service, Integer createTime) {
		this.id = id;
		this.orderId = orderId;
		this.bank = bank;
		this.money = money;
		this.currency = currency;
		this.service = service;
		this.createTime = createTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}