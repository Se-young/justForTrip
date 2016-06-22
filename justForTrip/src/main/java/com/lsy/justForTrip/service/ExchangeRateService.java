package com.lsy.justForTrip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsy.justForTrip.domain.CommonDomain;
import com.lsy.justForTrip.domain.ExchangeRate;
import com.lsy.justForTrip.repository.ExchangeRateRepository;

@Service
public class ExchangeRateService {
 
	private ExchangeRateRepository exchangeRateRepository;
	
	@Autowired
	public void setExchangeRateRepository (ExchangeRateRepository exchangeRateRepository) {
		this.exchangeRateRepository = exchangeRateRepository;
	}
	
	public boolean saveExchangeRate(ExchangeRate exchangeRate) {
		
		if (exchangeRateRepository.save(exchangeRate) == null) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public List<ExchangeRate> getExchangeRates(CommonDomain domain) {
		return (List<ExchangeRate>) exchangeRateRepository.findAll();
	}

}
