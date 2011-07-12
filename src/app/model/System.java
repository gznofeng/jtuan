package app.model;

import framework.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public class System extends Dao<System> implements java.io.Serializable {

	// Fields

	private String id;
	private String value;

	// Constructors

	/** default constructor */
	public System() {
	}

	/** minimal constructor */
	public System(String id) {
		this.id = id;
	}

	/** full constructor */
	public System(String id, String value) {
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