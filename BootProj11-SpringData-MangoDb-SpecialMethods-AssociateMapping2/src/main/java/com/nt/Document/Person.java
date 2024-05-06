package com.nt.Document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Document
@Data
public class Person implements Serializable {
	@Id
	private Integer pid;
	private String name;
	private String adress;
	private Long adhar;
	private Licence licence;	

}
