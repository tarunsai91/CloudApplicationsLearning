package com.example.ExchangeConversionService;

import java.math.BigDecimal;

public class CurrencyData {

	private String from;

	private String to;

	BigDecimal CurrencyValue;

	BigDecimal quantity;

	BigDecimal finalValue;

	String port;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public BigDecimal getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(BigDecimal finalValue) {
		this.finalValue = finalValue;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getCurrencyValue() {
		return CurrencyValue;
	}

	public void setCurrencyValue(BigDecimal currencyValue) {
		CurrencyValue = currencyValue;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CurrencyData [from=" + from + ", to=" + to + ", CurrencyValue=" + CurrencyValue + ", quantity="
				+ quantity + "]";
	}

}
