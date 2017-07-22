package com.devRabbit.mckesson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.devRabbit.mckesson.entity.Customer;

@Service
public interface CustomerService {

	Customer[] getAllCustomers();

	Customer addCustomer(Customer customer);

}
