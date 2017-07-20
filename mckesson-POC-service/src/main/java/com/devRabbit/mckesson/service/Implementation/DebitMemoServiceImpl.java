package com.devRabbit.mckesson.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devRabbit.mckesson.entity.DebitMemo;
import com.devRabbit.mckesson.repository.DebitMemoRepository;
import com.devRabbit.mckesson.service.DebitMemoService;

@Service
public class DebitMemoServiceImpl implements DebitMemoService {

	@Autowired
	private DebitMemoRepository debitMemoRepository;

	@Override
	public List<DebitMemo> getAllDebitMemo() {
		
		return debitMemoRepository.findAll();
	}

	@Override
	public DebitMemo addDebitMemo(DebitMemo debitMemo) {
		// TODO Auto-generated method stub
		return debitMemoRepository.save(debitMemo);
	}
	
	
}
