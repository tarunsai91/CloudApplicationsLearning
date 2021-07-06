package com.example.ExchangeConversionService.Controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ExchangeConversionService.CurrencyData;
import com.example.ExchangeConversionService.proxy.NamingServerPoxy;

@RestController
public class ExchangeConversionController {

	@Autowired
	NamingServerPoxy proxy;

	@GetMapping(path = "/getExchangeValue/{from}/to/{to}/quantity/{quantity}", produces = "application/json")
	public CurrencyData getExchange(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		CurrencyData currencyData = proxy.getcurrencyValue(from, to);
		currencyData.setQuantity(quantity);
		currencyData.setFinalValue(quantity.multiply(currencyData.getCurrencyValue()));

		return currencyData;
	}

	@GetMapping(path = "/getExchangeValue-old/{from}/to/{to}/quantity/{quantity}", produces = "application/json")
	public CurrencyData getExchangeOld(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		ResponseEntity<CurrencyData> responseBody = new RestTemplate().getForEntity(
				"http://localhost:8000/exchange-service/{from}/to/{to}", CurrencyData.class,
				uriVariables);
		CurrencyData currencyData = responseBody.getBody();
		currencyData.setQuantity(quantity);
		currencyData.setFinalValue(quantity.multiply(currencyData.getCurrencyValue()));

		return currencyData;
	}

}
