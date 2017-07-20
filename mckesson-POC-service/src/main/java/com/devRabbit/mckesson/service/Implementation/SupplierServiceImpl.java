package com.devRabbit.mckesson.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devRabbit.mckesson.entity.Supplier;
import com.devRabbit.mckesson.repository.SupplierRepository;
import com.devRabbit.mckesson.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public List<Supplier> getAllSuppliers() {
		
		return supplierRepository.findAll();
	}

	@Override
	public Supplier AddSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
		
	}
}
