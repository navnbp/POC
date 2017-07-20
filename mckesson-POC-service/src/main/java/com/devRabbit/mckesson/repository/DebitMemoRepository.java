package com.devRabbit.mckesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devRabbit.mckesson.entity.DebitMemo;

public interface DebitMemoRepository extends JpaRepository<DebitMemo, Long> {

}
