package com.devRabbit.mckesson.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.entity.Supplier;

@Service
public interface SupplierService {

	Supplier[] getAllSuppliers();

	Supplier AddSupplier(Supplier supplier);

}
