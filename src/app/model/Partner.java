package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Partner extends Dao<Partner> implements java.io.Serializable {

	// Fields

	private Long id;
	private String username;
	private String password;
	private String title;
	private String homepage;
	private Integer cityId;
	private String bankName;
	private String bankNo;
	private String bankUser;
	private String location;
	private String contact;
	private String phone;
	private String address;
	private String addres;
	private String other;
	private String mobile;
	private Integer userId;
	private Integer createTime;

	// Constructors

	/** default constructor */
	public Partner() {
	}

	/** minimal constructor */
	public Partner(Integer cityId, String location, Integer userId,
			Integer createTime) {
		this.cityId = cityId;
		this.location = location;
		this.userId = userId;
		this.createTime = createTime;
	}

	/** full constructor */
	public Partner(String username, String password, String title,
			String homepage, Integer cityId, String bankName, String bankNo,
			String bankUser, String location, String contact, String phone,
			String address, String addres, String other, String mobile,
			Integer userId, Integer createTime) {
		this.username = username;
		this.password = password;
		this.title = title;
		this.homepage = homepage;
		this.cityId = cityId;
		this.bankName = bankName;
		this.bankNo = bankNo;
		this.bankUser = bankUser;
		this.location = location;
		this.contact = contact;
		this.phone = phone;
		this.address = address;
		this.addres = addres;
		this.other = other;
		this.mobile = mobile;
		this.userId = userId;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getBankUser() {
		return this.bankUser;
	}

	public void setBankUser(String bankUser) {
		this.bankUser = bankUser;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddres() {
		return this.addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}