package com.customerService.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.customerService.dtos.CustomerDto;
import com.customerService.entities.CustomerEntity;
import com.customerService.repositories.CustomerRepository;

public class CustomerService {
	
	@Autowired
	private CustomerRepository cr;
	
	public void saveCustomer(CustomerDto dto) {
		cr.save(convert(dto));
		
	}
	
	public CustomerEntity convert(CustomerDto dto) {
		CustomerEntity en = null;
		if(dto!=null) {
			en = new CustomerEntity();
			en.setfName(dto.getFname());
			en.setlName(dto.getLname());
			en.setEmail(dto.getEmail());
			en.setPhone(dto.getPhone());
		}
		
		return en;
	}

}
