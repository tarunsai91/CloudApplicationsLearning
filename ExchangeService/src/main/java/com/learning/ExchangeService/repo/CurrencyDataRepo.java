package com.learning.ExchangeService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.ExchangeService.entity.CurrencyExchange;


@Repository
public interface CurrencyDataRepo extends JpaRepository<CurrencyExchange, Integer> {
	
	
	CurrencyExchange findByFromAndTo(String from,String to);

}
