package com.devRabbit.mckesson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devRabbit.mckesson.entity.Customer;

import com.devRabbit.mckesson.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/get")
	public List<Customer> getSuppliers() {

		return customerService.getAllCustomers();
	}
	
	@PostMapping("/add")
	public Customer addSuppliers(@RequestBody final Customer customer) 
	{
		return customerService.addCustomer(customer);
		
	}
	
}
