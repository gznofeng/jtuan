package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Category extends Dao<Category> implements java.io.Serializable {

	// Fields

	private Integer id;
	private String zone;
	private String czone;
	private String name;
	private String ename;
	private String letter;
	private Integer sortOrder;

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	/** full constructor */
	public Category(String zone, String czone, String name, String ename,
			String letter, Integer sortOrder) {
		this.zone = zone;
		this.czone = czone;
		this.name = name;
		this.ename = ename;
		this.letter = letter;
		this.sortOrder = sortOrder;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getCzone() {
		return this.czone;
	}

	public void setCzone(String czone) {
		this.czone = czone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getLetter() {
		return this.letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}