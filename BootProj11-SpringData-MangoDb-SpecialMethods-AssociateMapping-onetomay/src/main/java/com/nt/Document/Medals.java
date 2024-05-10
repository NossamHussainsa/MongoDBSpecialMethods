package com.nt.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Medals {
	@Id
	private String mid;
	private MedalType typeOfMedal;
	private Integer priceMoney;
	private String OlympicHeld;

}
