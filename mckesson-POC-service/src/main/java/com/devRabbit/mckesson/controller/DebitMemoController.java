package com.devRabbit.mckesson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devRabbit.mckesson.entity.DebitMemo;
import com.devRabbit.mckesson.entity.Supplier;
import com.devRabbit.mckesson.service.DebitMemoService;

@RestController
@RequestMapping("/debit")
public class DebitMemoController {

	
	@Autowired
	private DebitMemoService debitMemoService;
	
	
	@GetMapping("/get")
	public List<DebitMemo> getDebitMemos() {
		return debitMemoService.getAllDebitMemo();
	}
	
	@PostMapping("/add")
	public DebitMemo addDebitMemo(@RequestBody final DebitMemo debitMemo) 
	{
		return debitMemoService.addDebitMemo(debitMemo);
		
	}
	
}
