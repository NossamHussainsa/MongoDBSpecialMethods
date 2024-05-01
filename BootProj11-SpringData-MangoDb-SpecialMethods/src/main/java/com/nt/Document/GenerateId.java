package com.nt.Document;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class GenerateId {
	public static String getGeneratedId()
	{
		return UUID.randomUUID().toString().substring(0,10);
	}

}
