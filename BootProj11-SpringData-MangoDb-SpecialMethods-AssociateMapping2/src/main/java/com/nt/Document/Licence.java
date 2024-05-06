package com.nt.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Document
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Licence implements Serializable {
	@Id
	private Integer Lid;
	private String type;
	private LocalDateTime experiredate;
	private Person person;

}
