package com.hcl.airport.model;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

public class UserCredential {
	@Id
	@NotEmpty
	private String userId;
	@NotEmpty
	private String password;
	/**
	 * @return the managerId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param managerId the managerId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @param managerId
	 * @param password
	 */
	public UserCredential(@NotEmpty String userId, @NotEmpty String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	/**
	 * 
	 */
	public UserCredential() {
		super();
	}
	
	

}
