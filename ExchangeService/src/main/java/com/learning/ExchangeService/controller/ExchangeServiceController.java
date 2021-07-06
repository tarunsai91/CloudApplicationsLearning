package com.learning.ExchangeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ExchangeService.entity.CurrencyExchange;
import com.learning.ExchangeService.repo.CurrencyDataRepo;

@RestController
public class ExchangeServiceController {

	@Autowired
	CurrencyDataRepo currencyDataRepo;

	@Autowired
	Environment env;

	@GetMapping(path = "/exchange-service/{from}/to/{to}")
	public CurrencyExchange getcurrencyValue(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange currencyData = currencyDataRepo.findByFromAndTo(from, to);
		currencyData.setPort(env.getProperty("local.server.port"));
		return currencyData;

	}
}
