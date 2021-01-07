package com.hcl.airport.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
@Entity
@Table(name="User")
public class User {
	@Id
	private int id;
	@NotEmpty
	private String firstname;
	@NotEmpty
	private String lastname;
	@Range(min=18,max=50)
	private int age;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String contactNumber;
	@NotEmpty
	private String userId;
	@NotEmpty
	private String password;
	private int roleId;
	private String status;

	public User() {
		super();
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}


	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}


	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the phoneNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	/**
	 * @return the vendorId
	 */
	public String getUserId() {
		return userId;
	}


	/**
	 * @param vendorId the vendorId to set
	 */
	public void setuserId(String vendorId) {
		this.userId = vendorId;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}


	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}


	/**
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param gender
	 * @param phoneNumber
	 * @param userId
	 * @param password
	 */
	public User(int id, @NotEmpty String firstname, @NotEmpty String lastname,
			@Range(min = 18, max = 50) int age, @NotEmpty String gender, @NotEmpty String contactNumber,
			@NotEmpty String vendorId, @NotEmpty String password,int roleId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.userId = vendorId;
		this.password = password;
		this.roleId = roleId;
	}


	

	
	

}
