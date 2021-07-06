package com.example.ExchangeConversionService.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ExchangeConversionService.CurrencyData;

@FeignClient("EXCHANGESERVICEAPPLICATION")
public interface NamingServerPoxy {

	@GetMapping(path = "/exchange-service/{from}/to/{to}")
	public CurrencyData getcurrencyValue(@PathVariable String from, @PathVariable String to);
}
