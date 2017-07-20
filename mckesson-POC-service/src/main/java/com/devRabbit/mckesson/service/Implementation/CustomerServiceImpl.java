package com.devRabbit.mckesson.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devRabbit.mckesson.entity.Customer;
import com.devRabbit.mckesson.repository.CustomerRepository;
import com.devRabbit.mckesson.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}
	
}
