package com.nt.Document;

import java.util.UUID;

public class Generator {
	public static String getGenerator()
	{
		System.out.println(UUID.randomUUID());
		return UUID.randomUUID().toString().substring(0,10);
	}

}
