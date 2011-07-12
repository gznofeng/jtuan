package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class UserView implements java.io.Serializable {

	// Fields

	private Long id;
	private String email;
	private String username;
	private String realname;
	private String password;
	private String avatar;
	private String gender;
	private String newbie;
	private String mobile;
	private String qq;
	private Double money;
	private String zipcode;
	private String address;
	private Integer cityId;
	private String enable;
	private String manager;
	private String secret;
	private String recode;
	private String ip;
	private Integer loginTime;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public UserView() {
	}

	/** minimal constructor */
	public UserView(String gender, String newbie, Double money, Integer cityId,
			String enable, String manager, Integer loginTime, Integer createTime) {
		this.gender = gender;
		this.newbie = newbie;
		this.money = money;
		this.cityId = cityId;
		this.enable = enable;
		this.manager = manager;
		this.loginTime = loginTime;
		this.createTime = createTime;
	}

	/** full constructor */
	public UserView(String email, String username, String realname,
			String password, String avatar, String gender, String newbie,
			String mobile, String qq, Double money, String zipcode,
			String address, Integer cityId, String enable, String manager,
			String secret, String recode, String ip, Integer loginTime,
			Integer createTime) {
		this.email = email;
		this.username = username;
		this.realname = realname;
		this.password = password;
		this.avatar = avatar;
		this.gender = gender;
		this.newbie = newbie;
		this.mobile = mobile;
		this.qq = qq;
		this.money = money;
		this.zipcode = zipcode;
		this.address = address;
		this.cityId = cityId;
		this.enable = enable;
		this.manager = manager;
		this.secret = secret;
		this.recode = recode;
		this.ip = ip;
		this.loginTime = loginTime;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNewbie() {
		return this.newbie;
	}

	public void setNewbie(String newbie) {
		this.newbie = newbie;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
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

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getRecode() {
		return this.recode;
	}

	public void setRecode(String recode) {
		this.recode = recode;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Integer loginTime) {
		this.loginTime = loginTime;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}