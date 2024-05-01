package com.nt.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Document
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonDetails {
	@Id
	private String id;
	private Integer pid;
	private String pname;
	private String padress;
	private Set<Long>mobilenumbers;
	private List<String>nickNames;
	private LocalDateTime dob;
	private Map<String,Integer>banksdetails;
	private Properties properties;
}
