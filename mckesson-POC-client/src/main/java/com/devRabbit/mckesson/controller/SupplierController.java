package com.devRabbit.mckesson.controller;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devRabbit.mckesson.entity.Supplier;
import com.devRabbit.mckesson.service.SupplierService;



@Controller
public class SupplierController {

	
	@Autowired
	private SupplierService  supplierService;
	
	
	private List<Supplier> supplierList=null;
	
	@RequestMapping(value="/supplier/get",method=RequestMethod.GET)
	@ResponseBody
	public List<Supplier> getSuppliers() {
	return	Collections.unmodifiableList(Arrays.asList(supplierService.getAllSuppliers()));
		
	
	
	}
	
	@RequestMapping(value="/supplier/add",method=RequestMethod.GET)
	public String addSuppliers(Model model) {
		model.addAttribute("supplier",new Supplier());
		return "supplier/addSupplier";
	}
	
	@RequestMapping(value="/supplier/add",method=RequestMethod.POST)
	public String addSuppliers(final Supplier supplier) 
	{
		 supplierService.AddSupplier(supplier);
		 return "redirect:/supplier/get";
		
	}
	
	@RequestMapping(value="/supplier/getByNames", method = RequestMethod.GET)
	@ResponseBody
	public List<String> simulateSearchResult(String name) {
		
		

		if (supplierList == null || supplierList.size() == 0)
			this.getSuppliers();
		List<String> result = null;
		if (name == null || name.length() == 0) {
			result = this.supplierList.stream()
					.map(c -> c.getName())
					.sorted()
					.collect(Collectors.toList());
		} else {
			result = this.supplierList.stream()
					.map(c -> c.getName())
					.filter(c -> c.toLowerCase().contains(name.toLowerCase()))
					.sorted().collect(Collectors.toList());
		}

	

		return result;
		
	
	}
	

	
	
}
