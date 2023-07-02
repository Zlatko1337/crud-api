package com.ingemark.crudapi.task;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import lombok.Data;

@Component
@Data
@ApplicationScope
public class CurrencyExchange {
	
	private BigDecimal usdSrednjiTecaj;
	
}
