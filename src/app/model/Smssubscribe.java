package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Smssubscribe extends Dao<Smssubscribe> implements
		java.io.Serializable {

	// Fields

	private Long id;
	private String mobile;
	private Integer cityId;
	private String secret;
	private String enable;

	// Constructors

	/** default constructor */
	public Smssubscribe() {
	}

	/** minimal constructor */
	public Smssubscribe(Integer cityId, String enable) {
		this.cityId = cityId;
		this.enable = enable;
	}

	/** full constructor */
	public Smssubscribe(String mobile, Integer cityId, String secret,
			String enable) {
		this.mobile = mobile;
		this.cityId = cityId;
		this.secret = secret;
		this.enable = enable;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

}