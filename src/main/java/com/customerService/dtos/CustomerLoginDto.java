package com.customerService.dtos;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerLoginDto {

	private Integer id;

	@NotNull(message = "username can not be null")
	private String userName;

	@NotNull
	@Size(min=8, max=16, message = "password must be equal or greater than 8 characters and less than 16 characters")
	private String password;

	private Date lastSignIn;

	private Date createdAt;

	private Date upatedAt;

	private CustomerDto customerDto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastSignIn() {
		return lastSignIn;
	}

	public void setLastSignIn(Date lastSignIn) {
		this.lastSignIn = lastSignIn;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpatedAt() {
		return upatedAt;
	}

	public void setUpatedAt(Date upatedAt) {
		this.upatedAt = upatedAt;
	}

	public CustomerDto getCustomerDto() {
		return customerDto;
	}

	public void setCustomerDto(CustomerDto customerDto) {
		this.customerDto = customerDto;
	}

}
