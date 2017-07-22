package com.devRabbit.mckesson.service.Implementation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.config.RestServiceCall;
import com.devRabbit.mckesson.entity.Customer;

import com.devRabbit.mckesson.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private RestServiceCall restServiceCall;
	

	@Override
	public Customer[] getAllCustomers() {
		ResponseEntity<Customer[]>response = restServiceCall.execute("/customer/get", HttpMethod.GET, null, Customer[].class);
		
		return response.getBody();//customerRepository.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		ResponseEntity<Customer> result= restServiceCall.execute("/customer/add", HttpMethod.POST,customer,Customer.class);
		return result.getBody();
		
	}
	
}
