package com.customerService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customerService.dtos.CustomerDto;
import com.customerService.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void saveCustomer(@RequestBody CustomerDto dto) {
		customerService.saveCustomer(dto);
	}

}
