package com.customerService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerService.dtos.CustomerDto;
import com.customerService.entities.CustomerEntity;
import com.customerService.entities.CustomerLoginEntity;
import com.customerService.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void saveCustomer(CustomerDto dto) {
		customerRepository.save(convert(dto));

	}

	public CustomerEntity convert(CustomerDto dto) {
		CustomerEntity en = null;
		if (dto != null) {
			en = new CustomerEntity();
			en.setfName(dto.getFname());
			en.setlName(dto.getLname());
			en.setEmail(dto.getEmail());
			en.setPhone(dto.getPhone());

			CustomerLoginEntity login = new CustomerLoginEntity();

		}

		return en;
	}

}
