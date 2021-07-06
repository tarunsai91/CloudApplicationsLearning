package com.learning.ExchangeService.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("cloud-application")
public class ConfigPropsBean {

	int maximum;

	int minimum;

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "ConfigPropsBean [maximum=" + maximum + ", minimum=" + minimum + "]";
	}

}
