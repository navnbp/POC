package com.devRabbit.mckesson.service.Implementation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.config.RestServiceCall;
import com.devRabbit.mckesson.entity.DebitMemo;

import com.devRabbit.mckesson.service.DebitMemoService;

@Service
public class DebitMemoServiceImpl implements DebitMemoService {

	@Autowired
	private RestServiceCall restServiceCall;
	
	@Override
	public DebitMemo[] getAllDebitMemo() {
		ResponseEntity<DebitMemo[]>response = restServiceCall.execute("/debit/get", HttpMethod.GET, null, DebitMemo[].class);
		
		return response.getBody();//debitMemoRepository.findAll();
	}

	@Override
	public DebitMemo addDebitMemo(DebitMemo debitMemo) {
		ResponseEntity<DebitMemo> result= restServiceCall.execute("/debit/add", HttpMethod.POST,debitMemo,DebitMemo.class);
		return result.getBody();
		}
	
	
}
