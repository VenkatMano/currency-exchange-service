package com.venkat.micro.currencyexchangeservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.micro.currencyexchangeservice.model.ExchangeValue;
import com.venkat.micro.currencyexchangeservice.repository.ExchangeValueRepository;

@Component
@RestController
@RequestMapping(value="/currency-exchange")
public class CurrencyExchangeResource {
	
	@Autowired
	ExchangeValueRepository exchangeValueRepo;
	
	
	@GetMapping(produces="application/json")
	public String returnHello()
	{
		return "hello";
	}
	
	@GetMapping(value="/from/{from}/to/{to}", produces="application/json")
	public ExchangeValue returnExchangeValueOfTheCurrency(@PathVariable String from, @PathVariable String to)
	{
		return exchangeValueRepo.findByFromAndTo(from, to);
	}

}
