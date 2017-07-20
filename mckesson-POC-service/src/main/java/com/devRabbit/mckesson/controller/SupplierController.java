package com.devRabbit.mckesson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devRabbit.mckesson.entity.Login;
import com.devRabbit.mckesson.entity.Supplier;
import com.devRabbit.mckesson.service.SupplierService;


@RestController
@RequestMapping("/supplier")
public class SupplierController {

	
	@Autowired
	private SupplierService  supplierService;
	
	@GetMapping("/get")
	public List<Supplier> getSuppliers() {

		return supplierService.getAllSuppliers();
	}
	
	@PostMapping("/add")
	public Supplier addSuppliers(@RequestBody final Supplier supplier) 
	{
		return supplierService.AddSupplier(supplier);
		
	}
	
	
}
