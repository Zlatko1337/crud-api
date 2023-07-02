package com.ingemark.crudapi.dto;

import java.math.BigDecimal;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductRequest {

	@Size(min = 10, max = 10)
	private String code;
	
	private String name;
	
    @DecimalMin(value = "0.0", inclusive = true, message = "price should be greater or equal to 0")
    @Digits(integer = 5, fraction = 2)
	BigDecimal priceEur;
	
    @DecimalMin(value = "0.0", inclusive = true, message = "price should be greater or equal to 0")
    @Digits(integer = 5, fraction = 2)
	BigDecimal priceUsd;
	
	private String description;
	
	private boolean available;
	
}
