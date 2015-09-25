package com.beans;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User {
	
private int userId;
private String  firstName;
private String lastName;
private String emailId;
private String userDesignation;
private int organizationId;
private String userAccess;
private String rememberMe;
private int active;
private Date  created_on;
private String created_by;
private Date updated_on;
private String updated_by;
private String password;


public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getUserDesignation() {
	return userDesignation;
}

public void setUserDesignation(String userDesignation) {
	this.userDesignation = userDesignation;
}

public int getOrganizationId() {
	return organizationId;
}

public void setOrganizationId(int organizationId) {
	this.organizationId = organizationId;
}

public String getUserAccess() {
	return userAccess;
}

public void setUserAccess(String userAccess) {
	this.userAccess = userAccess;
}

public String getRememberMe() {
	return rememberMe;
}

public void setRememberMe(String rememberMe) {
	this.rememberMe = rememberMe;
}

public int getActive() {
	return active;
}

public void setActive(int active) {
	this.active = active;
}

public Date getCreated_on() {
	return created_on;
}

public void setCreated_on(Date created_on) {
	this.created_on = created_on;
}

public String getCreated_by() {
	return created_by;
}

public void setCreated_by(String created_by) {
	this.created_by = created_by;
}

public Date getUpdated_on() {
	return updated_on;
}

public void setUpdated_on(Date updated_on) {
	this.updated_on = updated_on;
}

public String getUpdated_by() {
	return updated_by;
}

public void setUpdated_by(String updated_by) {
	this.updated_by = updated_by;
}



	
	public String toString()
	{
		return "User (Name:"+this.firstName + ")";
	}
	
	
	public String getPassword() {
		return password;
	}


	
}
