package com.customerService.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String fName;

	@Column(name = "last_name")
	private String lName;

	@Column(name = "email")
	@NotNull
	private String email;

	@Column(name = "phone")
	@NotBlank(message="username cannot be blank")
	private String phone;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	@OneToOne(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private BillingAddressEntity billingAddress;

	@OneToOne(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private CustomerLoginEntity login;

	@PrePersist
	public void onPersist() {
		if (this.createdAt == null) {
			this.createdAt = new Date();
		}
	}

	@PreUpdate
	public void onUpdate() {
		if (this.updatedAt == null) {
			this.updatedAt = new Date();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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

	public BillingAddressEntity getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddressEntity billingAddress) {
		this.billingAddress = billingAddress;
	}

	public CustomerLoginEntity getLogin() {
		return login;
	}

	public void setLogin(CustomerLoginEntity login) {
		this.login = login;
	}

}
