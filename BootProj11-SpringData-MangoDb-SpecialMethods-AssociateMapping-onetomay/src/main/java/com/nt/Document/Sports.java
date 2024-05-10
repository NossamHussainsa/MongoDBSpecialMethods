package com.nt.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Sports {
	@Id
	private String sid;
	private String gamePlayed;
	private Boolean isteamSport;
	private Boolean isSingleSport;
	private String[] kitDetails;
}
