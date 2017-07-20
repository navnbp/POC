package com.devRabbit.mckesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devRabbit.mckesson.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
