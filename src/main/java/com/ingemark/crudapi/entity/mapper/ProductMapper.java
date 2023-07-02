package com.ingemark.crudapi.entity.mapper;

import org.springframework.stereotype.Component;
import com.ingemark.crudapi.dto.ProductRequest;
import com.ingemark.crudapi.entity.Product;
import com.ingemark.crudapi.task.CurrencyExchange;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductMapper {

	private final CurrencyExchange currencyExchange;
	
    public Product mapToEntity(ProductRequest productRequest, Long productId) {    	  	
    	return Product.build(productId == null ? 0 : productId,
				productRequest.getCode(),
				productRequest.getName(),
				productRequest.getPriceEur(),
				productRequest.getPriceEur().multiply(currencyExchange.getUsdSrednjiTecaj()),
				productRequest.getDescription(),
				productRequest.isAvailable());
    }
}
