package com.devRabbit.mckesson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.devRabbit.mckesson.entity.DebitMemo;

@Service
public interface DebitMemoService {

	List<DebitMemo> getAllDebitMemo();

	DebitMemo addDebitMemo(DebitMemo debitMemo);
}
