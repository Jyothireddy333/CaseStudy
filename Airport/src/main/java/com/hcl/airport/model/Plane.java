/**
 * 
 */
/**
 * 
 */
package com.hcl.airport.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name ="plane")
public class Plane {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "*")
	private String planeName;
	@Column(name= "FromLocation")
	private String travelFrom;
	@Column(name= "ToLocation")
	private String travelTo;
	private String status;

	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public String getTravelFrom() {
		return travelFrom;
	}

	public void setFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}

	public String getTravelTo() {
		return travelTo;
	}

	public void setTravelTo(String travelTo) {
		this.travelTo = travelTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public Plane(int id, @NotNull String planeName, String travelFrom, String travelTo, String status) {
		super();
		this.id=id;
		this.planeName=planeName;
		this.travelFrom=travelFrom;
		this.travelTo=travelTo;
		this.status=status;
		
	}

}