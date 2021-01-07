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

import org.hibernate.validator.constraints.Range;

@Entity
public class Pilot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull(message = "*")
	private String pilotName;
	@Range(min=18,max=50)
	private int age;
	private String gender;
	private int phoneNumber;
	private String status;
	
	public Pilot() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer pilotId) {
		this.id = pilotId;
	}

	public String getPilotName() {
		return pilotName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Pilot(int id, @NotNull String pilotName, @Range(min=18,max=50) int age, String gender, int phoneNumber,String status) {
		super();
		this.id=id;
		this.pilotName=pilotName;
		this.age=age;
		this.gender=gender;
		this.phoneNumber=phoneNumber;
		this.status=status;
		
	}

}