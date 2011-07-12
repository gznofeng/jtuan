package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Order extends Dao<Order> implements java.io.Serializable {

	// Fields

	private Long id;
	private String payId;
	private String service;
	private Integer userId;
	private Integer adminId;
	private Integer teamId;
	private Integer cityId;
	private String cardId;
	private String state;
	private Integer quantity;
	private String realname;
	private String mobile;
	private String zipcode;
	private String address;
	private String express;
	private String expressXx;
	private Integer expressId;
	private String expressNo;
	private Double price;
	private Double money;
	private Double origin;
	private Double credit;
	private Double card;
	private Double fare;
	private String remark;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(String service, Integer userId, Integer adminId,
			Integer teamId, Integer cityId, String state, Integer quantity,
			String express, Integer expressId, Double price, Double money,
			Double origin, Double credit, Double card, Double fare,
			Integer createTime) {
		this.service = service;
		this.userId = userId;
		this.adminId = adminId;
		this.teamId = teamId;
		this.cityId = cityId;
		this.state = state;
		this.quantity = quantity;
		this.express = express;
		this.expressId = expressId;
		this.price = price;
		this.money = money;
		this.origin = origin;
		this.credit = credit;
		this.card = card;
		this.fare = fare;
		this.createTime = createTime;
	}

	/** full constructor */
	public Order(String payId, String service, Integer userId, Integer adminId,
			Integer teamId, Integer cityId, String cardId, String state,
			Integer quantity, String realname, String mobile, String zipcode,
			String address, String express, String expressXx,
			Integer expressId, String expressNo, Double price, Double money,
			Double origin, Double credit, Double card, Double fare,
			String remark, Integer createTime) {
		this.payId = payId;
		this.service = service;
		this.userId = userId;
		this.adminId = adminId;
		this.teamId = teamId;
		this.cityId = cityId;
		this.cardId = cardId;
		this.state = state;
		this.quantity = quantity;
		this.realname = realname;
		this.mobile = mobile;
		this.zipcode = zipcode;
		this.address = address;
		this.express = express;
		this.expressXx = expressXx;
		this.expressId = expressId;
		this.expressNo = expressNo;
		this.price = price;
		this.money = money;
		this.origin = origin;
		this.credit = credit;
		this.card = card;
		this.fare = fare;
		this.remark = remark;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPayId() {
		return this.payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
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

	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getExpress() {
		return this.express;
	}

	public void setExpress(String express) {
		this.express = express;
	}

	public String getExpressXx() {
		return this.expressXx;
	}

	public void setExpressXx(String expressXx) {
		this.expressXx = expressXx;
	}

	public Integer getExpressId() {
		return this.expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public String getExpressNo() {
		return this.expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Double getOrigin() {
		return this.origin;
	}

	public void setOrigin(Double origin) {
		this.origin = origin;
	}

	public Double getCredit() {
		return this.credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getCard() {
		return this.card;
	}

	public void setCard(Double card) {
		this.card = card;
	}

	public Double getFare() {
		return this.fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}