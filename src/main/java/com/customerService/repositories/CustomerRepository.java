package com.customerService.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customerService.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
	public CustomerEntity  findByfName(String fName);
	
	

}
