package com.customerService.dtos;

public class CustomerDto {

	private Integer customerId;
	private String fname;
	private String lname;
	private String email;
	private String phone;
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
