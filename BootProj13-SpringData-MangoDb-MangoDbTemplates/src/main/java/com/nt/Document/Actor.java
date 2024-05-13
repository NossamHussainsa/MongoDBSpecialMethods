package com.nt.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
public class Actor {
	@Id
	private Integer aid;
	private String ActorName;
	private String role;
	private Double remuneration;
	private Integer age;

}
