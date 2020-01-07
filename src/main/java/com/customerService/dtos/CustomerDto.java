package com.customerService.dtos;

import java.util.Date;

public class CustomerDto {

	private Integer customerId;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private Date udatedAt;
	private Date createdAt;
	

	public Date getUdatedAt() {
		return udatedAt;
	}

	public void setUdatedAt(Date udatedAt) {
		this.udatedAt = udatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
