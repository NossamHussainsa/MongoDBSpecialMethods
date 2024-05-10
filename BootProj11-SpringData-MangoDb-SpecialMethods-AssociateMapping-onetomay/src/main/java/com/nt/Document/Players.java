package com.nt.Document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Players {
	@Id
	private Integer pid;
	private String PlayerName;
	private String PlayerCountry;
	private Set<Sports>gamesPlayed;
	private Map<String,Medals>medalsGot;
}
