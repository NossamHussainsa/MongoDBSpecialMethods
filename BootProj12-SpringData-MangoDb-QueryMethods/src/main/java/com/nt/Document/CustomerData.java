package com.nt.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class CustomerData {
	@Id
	private String cid;
	private String name;
	private String Country;
	private Integer salary;
	private Double Hike;
	private String jobDestination;
}
