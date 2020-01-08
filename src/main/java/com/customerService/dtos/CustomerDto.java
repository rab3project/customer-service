package com.customerService.dtos;
import java.io.Serializable;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


public class CustomerDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3248917713969658188L;
	private Integer customerId;
	private String fname;
	private String lname;
	
	@Email
	@NotNull(message = "eamil can not be null")
	private String email;
	
	private String phone;
	private Date createdAt;
	private Date updatedAt;
	private BillingAddressDto billingaddress;
	private CustomerLoginDto customerLogin;

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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public BillingAddressDto getBillingaddress() {
		return billingaddress;
	}

	public void setBillingaddress(BillingAddressDto billingaddress) {
		this.billingaddress = billingaddress;
	}

	public CustomerLoginDto getCustomerLogin() {
		return customerLogin;
	}

	public void setCustomerLogin(CustomerLoginDto customerLogin) {
		this.customerLogin = customerLogin;
	}

}
