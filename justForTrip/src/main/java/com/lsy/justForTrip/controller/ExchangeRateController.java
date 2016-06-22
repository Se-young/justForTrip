package com.lsy.justForTrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsy.justForTrip.domain.CommonDomain;
import com.lsy.justForTrip.domain.ExchangeRate;
import com.lsy.justForTrip.service.ExchangeRateService;

@RestController
@RequestMapping("/exchangeRates")
public class ExchangeRateController {

	@Autowired private ExchangeRateService exchangeRateService;
	
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<ExchangeRate> getExchangeList (@RequestParam(required=false) CommonDomain domain) {
		return exchangeRateService.getExchangeRates(domain);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ResponseEntity<Object> addExchangeList (@RequestBody ExchangeRate exchangeRate) {
		
		if (exchangeRateService.saveExchangeRate(exchangeRate)) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}
}
