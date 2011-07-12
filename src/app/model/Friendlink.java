package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Friendlink extends Dao<Friendlink> implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String url;
	private String logo;
	private Integer sortOrder;

	// Constructors

	/** default constructor */
	public Friendlink() {
	}

	/** full constructor */
	public Friendlink(String title, String url, String logo, Integer sortOrder) {
		this.title = title;
		this.url = url;
		this.logo = logo;
		this.sortOrder = sortOrder;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}