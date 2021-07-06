package com.learning.ExchangeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ExchangeService.beans.ConfigPropsBean;

@RestController
public class TestController {

	@Autowired
	private ConfigPropsBean configPropsBean;

	@GetMapping("/getProperties")
	public String getData() {
		return configPropsBean.getMinimum() + " " + configPropsBean.getMaximum();
	}
}
