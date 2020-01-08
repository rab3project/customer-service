package com.customerService.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.customerService.dtos.CustomerDto;
import com.customerService.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveCustomer(@Valid @RequestBody CustomerDto dto) {
		customerService.createCustomer(dto);
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public CustomerDto findById(@RequestParam Integer id) {
		customerService.findById(id);
	}
	

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public CustomerDto getCustomer(@PathVariable String name) {
		return customerService.getByName(name);
	}
}
