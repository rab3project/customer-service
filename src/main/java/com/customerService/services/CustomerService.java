package com.customerService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerService.dtos.BillingAddressDto;
import com.customerService.dtos.CustomerDto;
import com.customerService.dtos.CustomerLoginDto;
import com.customerService.entities.BillingAddressEntity;
import com.customerService.entities.CustomerEntity;
import com.customerService.entities.CustomerLoginEntity;
import com.customerService.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerDto getByName(String fName) {
		return convert(customerRepository.findByfName(fName));
	}

	public CustomerDto createCustomer(CustomerDto dto) {
		CustomerEntity entity = new CustomerEntity();
		entity.setfName(dto.getFname());
		entity.setlName(dto.getLname());
		entity.setEmail(dto.getEmail());
		entity.setPhone(dto.getPhone());

		CustomerLoginEntity customer = new CustomerLoginEntity();
		customer.setUserName(dto.getCustomerLogin().getUserName());
		customer.setPassword(dto.getCustomerLogin().getPassword());
//		customer.setCustomer(entity);

		BillingAddressEntity address = new BillingAddressEntity();
		address.setAddress1(dto.getBillingaddress().getAddress1());
		address.setAddress2(dto.getBillingaddress().getAddress2());
		address.setCity(dto.getBillingaddress().getCity());
		address.setState(dto.getBillingaddress().getState());
		address.setZip(dto.getBillingaddress().getZip());
//		address.setCustomer(entity);

		entity.setBillingAddress(address);
		entity.setLogin(customer);

		return convert(customerRepository.save(entity));

	}

	public CustomerDto convert(CustomerEntity ent) {
		CustomerDto dtos = null;
		if (ent != null) {
			dtos = new CustomerDto();
			dtos.setCustomerId(ent.getId());
			dtos.setFname(ent.getfName());
			dtos.setLname(ent.getlName());
			dtos.setEmail(ent.getEmail());
			dtos.setPhone(ent.getPhone());
			dtos.setCreatedAt(ent.getCreatedAt());
			dtos.setUpdatedAt(ent.getUpdatedAt());

			CustomerLoginDto cl = new CustomerLoginDto();
			cl.setId(ent.getLogin().getId());
			cl.setUserName(ent.getLogin().getUserName());
			cl.setPassword(ent.getLogin().getPassword());
			cl.setCreatedAt(ent.getLogin().getCreatedAt());
			cl.setUpatedAt(ent.getLogin().getUpatedAt());

			BillingAddressDto ba = new BillingAddressDto();
			ba.setId(ent.getBillingAddress().getId());
			ba.setAddress1(ent.getBillingAddress().getAddress1());
			ba.setCity(ent.getBillingAddress().getCity());
			ba.setState(ent.getBillingAddress().getState());
			ba.setZip(ent.getBillingAddress().getZip());
			ba.setCreatedAt(ent.getBillingAddress().getCreatedAt());
			ba.setUpdatedAt(ent.getBillingAddress().getUpdatedAt());

			dtos.setCustomerLogin(cl);
			dtos.setBillingaddress(ba);
		}

		return dtos;
	}

}