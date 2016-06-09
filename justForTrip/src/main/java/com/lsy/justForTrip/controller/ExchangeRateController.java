package com.lsy.justForTrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsy.justForTrip.domain.CommonDomain;
import com.lsy.justForTrip.domain.ExchangeRate;
import com.lsy.justForTrip.service.ExchangeRateService;

@Controller
@RequestMapping("/exchangeRates")
public class ExchangeRateController {

	private ExchangeRateService exchangeRateService;
	
	@Autowired
    public void setExchangeRateService(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }
	
	@RequestMapping(value="", method=RequestMethod.GET)
	@ResponseBody
	public List<ExchangeRate> getExchangeList (CommonDomain domain) {
		return exchangeRateService.getExchangeRates(domain);
	}
}
