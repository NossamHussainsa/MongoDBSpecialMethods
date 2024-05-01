package com.nt.Document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Document(collection = "cusInfo")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer implements Serializable {
	@Id
	private String id;
	private Integer cid;
	private String cname;
	private String cadress;

}
