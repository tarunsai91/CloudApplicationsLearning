package com.learning.ExchangeService.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CurrencyExchange{

	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	Long id;

	@Column(name = "CURRENCY_FROM")
	String from;

	@Column(name = "CURRENCY_TO")
	String to;

	BigDecimal CurrencyValue;
	
	String port ;
	
	

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "CurrencyDataEntity [id=" + id + ", from=" + from + ", to=" + to + ", CurrencyValue=" + CurrencyValue
				+ "]";
	}

}
