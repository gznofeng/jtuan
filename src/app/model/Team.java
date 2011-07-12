package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Team extends Dao<Team> implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer userId;
	private String title;
	private String summary;
	private Integer cityId;
	private Integer groupId;
	private Integer partnerId;
	private String system;
	private Double teamPrice;
	private Double marketPrice;
	private String product;
	private Integer perNumber;
	private Integer minNumber;
	private Integer maxNumber;
	private Integer nowNumber;
	private String image;
	private String image1;
	private String image2;
	private String flv;
	private String mobile;
	private Integer credit;
	private Integer card;
	private Integer fare;
	private String address;
	private String detail;
	private String systemreview;
	private String userreview;
	private String notice;
	private String express;
	private String delivery;
	private String state;
	private String conduser;
	private String buyonce;
	private String teamType;
	private Integer expireTime;
	private Integer beginTime;
	private Integer endTime;
	private Integer closeTime;
	private Integer preNumber;

	// Constructors

	/** default constructor */
	public Team() {
	}

	/** minimal constructor */
	public Team(Integer userId, Integer cityId, Integer groupId,
			Integer partnerId, String system, Double teamPrice,
			Double marketPrice, Integer perNumber, Integer minNumber,
			Integer maxNumber, Integer nowNumber, Integer credit, Integer card,
			Integer fare, String delivery, String state, String conduser,
			String buyonce, Integer expireTime, Integer beginTime,
			Integer endTime, Integer closeTime) {
		this.userId = userId;
		this.cityId = cityId;
		this.groupId = groupId;
		this.partnerId = partnerId;
		this.system = system;
		this.teamPrice = teamPrice;
		this.marketPrice = marketPrice;
		this.perNumber = perNumber;
		this.minNumber = minNumber;
		this.maxNumber = maxNumber;
		this.nowNumber = nowNumber;
		this.credit = credit;
		this.card = card;
		this.fare = fare;
		this.delivery = delivery;
		this.state = state;
		this.conduser = conduser;
		this.buyonce = buyonce;
		this.expireTime = expireTime;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.closeTime = closeTime;
	}

	/** full constructor */
	public Team(Integer userId, String title, String summary, Integer cityId,
			Integer groupId, Integer partnerId, String system,
			Double teamPrice, Double marketPrice, String product,
			Integer perNumber, Integer minNumber, Integer maxNumber,
			Integer nowNumber, String image, String image1, String image2,
			String flv, String mobile, Integer credit, Integer card,
			Integer fare, String address, String detail, String systemreview,
			String userreview, String notice, String express, String delivery,
			String state, String conduser, String buyonce, String teamType,
			Integer expireTime, Integer beginTime, Integer endTime,
			Integer closeTime, Integer preNumber) {
		this.userId = userId;
		this.title = title;
		this.summary = summary;
		this.cityId = cityId;
		this.groupId = groupId;
		this.partnerId = partnerId;
		this.system = system;
		this.teamPrice = teamPrice;
		this.marketPrice = marketPrice;
		this.product = product;
		this.perNumber = perNumber;
		this.minNumber = minNumber;
		this.maxNumber = maxNumber;
		this.nowNumber = nowNumber;
		this.image = image;
		this.image1 = image1;
		this.image2 = image2;
		this.flv = flv;
		this.mobile = mobile;
		this.credit = credit;
		this.card = card;
		this.fare = fare;
		this.address = address;
		this.detail = detail;
		this.systemreview = systemreview;
		this.userreview = userreview;
		this.notice = notice;
		this.express = express;
		this.delivery = delivery;
		this.state = state;
		this.conduser = conduser;
		this.buyonce = buyonce;
		this.teamType = teamType;
		this.expireTime = expireTime;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.closeTime = closeTime;
		this.preNumber = preNumber;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	public String getSystem() {
		return this.system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public Double getTeamPrice() {
		return this.teamPrice;
	}

	public void setTeamPrice(Double teamPrice) {
		this.teamPrice = teamPrice;
	}

	public Double getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getPerNumber() {
		return this.perNumber;
	}

	public void setPerNumber(Integer perNumber) {
		this.perNumber = perNumber;
	}

	public Integer getMinNumber() {
		return this.minNumber;
	}

	public void setMinNumber(Integer minNumber) {
		this.minNumber = minNumber;
	}

	public Integer getMaxNumber() {
		return this.maxNumber;
	}

	public void setMaxNumber(Integer maxNumber) {
		this.maxNumber = maxNumber;
	}

	public Integer getNowNumber() {
		return this.nowNumber;
	}

	public void setNowNumber(Integer nowNumber) {
		this.nowNumber = nowNumber;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage1() {
		return this.image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return this.image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getFlv() {
		return this.flv;
	}

	public void setFlv(String flv) {
		this.flv = flv;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getCard() {
		return this.card;
	}

	public void setCard(Integer card) {
		this.card = card;
	}

	public Integer getFare() {
		return this.fare;
	}

	public void setFare(Integer fare) {
		this.fare = fare;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getSystemreview() {
		return this.systemreview;
	}

	public void setSystemreview(String systemreview) {
		this.systemreview = systemreview;
	}

	public String getUserreview() {
		return this.userreview;
	}

	public void setUserreview(String userreview) {
		this.userreview = userreview;
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getExpress() {
		return this.express;
	}

	public void setExpress(String express) {
		this.express = express;
	}

	public String getDelivery() {
		return this.delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConduser() {
		return this.conduser;
	}

	public void setConduser(String conduser) {
		this.conduser = conduser;
	}

	public String getBuyonce() {
		return this.buyonce;
	}

	public void setBuyonce(String buyonce) {
		this.buyonce = buyonce;
	}

	public String getTeamType() {
		return this.teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public Integer getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
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

	public Integer getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(Integer closeTime) {
		this.closeTime = closeTime;
	}

	public Integer getPreNumber() {
		return this.preNumber;
	}

	public void setPreNumber(Integer preNumber) {
		this.preNumber = preNumber;
	}

}