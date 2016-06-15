package com.lsy.justForTrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lsy.justForTrip.domain.CommonDomain;
import com.lsy.justForTrip.domain.ExchangeRate;
import com.lsy.justForTrip.service.ExchangeRateService;

@RestController
@RequestMapping("/exchangeRates")
public class ExchangeRateController {

	private ExchangeRateService exchangeRateService;
	
	@Autowired
    public void setExchangeRateService(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }
	
	@RequestMapping(value="", method=RequestMethod.GET)
	@ResponseBody
	public List<ExchangeRate> getExchangeList (@RequestParam(required=false) CommonDomain domain) {
		return exchangeRateService.getExchangeRates(domain);
	}
}
