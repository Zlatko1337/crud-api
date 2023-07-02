package com.ingemark.crudapi.task;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Component
@Data
public class CurrencyExchangeResponse {

	@JsonProperty("broj_tecajnice")
	private String brojTecajnice;
	
	@JsonProperty("datum_primjene")
	private String datumPrimjene;
	
	@JsonProperty("drzava")
	private String drzava;
	
	@JsonProperty("drzava_iso")
	private String drzavaIso;
	
	@JsonProperty("sifra_valute")
	private String sifraValute;
	
	@JsonProperty("valuta")
	private String valuta;
	
	@JsonProperty("kupovni_tecaj")
	private String kupovniTecaj;
	
	@JsonProperty("srednji_tecaj")
	private String srednjiTecaj;
	
	@JsonProperty("prodajni_tecaj")
	private String prodajniTecaj;
	
}
