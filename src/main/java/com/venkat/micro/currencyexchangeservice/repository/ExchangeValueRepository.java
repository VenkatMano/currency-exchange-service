package com.venkat.micro.currencyexchangeservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkat.micro.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer>{
	
	public ExchangeValue findByFromAndTo(String from, String to);

}
