package com.ingemark.crudapi.task;

import java.math.BigDecimal;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class CurexListTaskService {
	
	private static final String URL = "https://api.hnb.hr/tecajn-eur/v3?valuta=USD";
	private final CurrencyExchange currencyExchange;
	
	@Scheduled(cron = "1 0 0 * * *", zone = "GMT+1")
	private void getCurrencyExchangeList() {
		currencyExchange.setUsdSrednjiTecaj(new BigDecimal(new RestTemplate().getForEntity(URL, CurrencyExchangeResponse[].class).getBody()[0].getSrednjiTecaj().replace(",", ".")));	//TODO handle this
		log.info("Currency list updated");	
	}
	
	@PostConstruct
    public void init(){
		getCurrencyExchangeList();
    }
	
}
