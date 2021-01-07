/**
 * 
 */
package com.hcl.airport.model;
/**
 * @author pallavi.alahari
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Hanger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "*")
	private String hangerName;
	private String hangerType;
	private String status;
	
	public Hanger() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setHangerId(int id) {
		this.id = id;
	}

	public String getHangerName() {
		return hangerName;
	}

	public String getStatus() {
		return status;
	}

	public String getHangerType() {
		return hangerType;
	}

	public void setHangerType(String hangerType) {
		this.hangerType = hangerType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setHangerName(String hangerName) {
		this.hangerName = hangerName;
	}
	public Hanger(int id, @NotNull String hangerName, String hangerType, String status) {
		super();
		this.id=id;
		this.hangerName=hangerName;
		this.hangerType=hangerType;
		this.status=status;
	}
}
	
	