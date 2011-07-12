package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class Page extends Dao<Page> implements java.io.Serializable {

	// Fields

	private String id;
	private String value;

	// Constructors

	/** default constructor */
	public Page() {
	}

	/** minimal constructor */
	public Page(String id) {
		this.id = id;
	}

	/** full constructor */
	public Page(String id, String value) {
		this.id = id;
		this.value = value;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}