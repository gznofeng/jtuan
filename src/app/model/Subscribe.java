package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Subscribe extends Dao<Subscribe> implements java.io.Serializable {

	// Fields

	private Long id;
	private String email;
	private Integer cityId;
	private String secret;

	// Constructors

	/** default constructor */
	public Subscribe() {
	}

	/** minimal constructor */
	public Subscribe(Integer cityId) {
		this.cityId = cityId;
	}

	/** full constructor */
	public Subscribe(String email, Integer cityId, String secret) {
		this.email = email;
		this.cityId = cityId;
		this.secret = secret;
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

}