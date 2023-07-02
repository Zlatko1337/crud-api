package com.ingemark.crudapi.entity;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Table(name = "PRODUCT")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(unique = true, length = 10)
	private String code;

	private String name;

	@Column(name = "price_eur", nullable = false)
	BigDecimal priceEur;

	@Column(name = "price_usd", nullable = false)
	BigDecimal priceUsd;

	private String description;

	private boolean isAvailable;

}
