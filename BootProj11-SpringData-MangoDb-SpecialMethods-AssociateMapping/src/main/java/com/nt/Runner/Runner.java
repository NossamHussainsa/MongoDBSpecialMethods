package com.nt.Runner;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.Document.Licence;
import com.nt.Document.Person;
import com.nt.Service.Iservice;

public class Runner implements CommandLineRunner {
@Autowired
private Iservice service;
	@Override
	public void run(String... args) throws Exception {
		Person per=new Person();
		per.setPid(1001);
		per.setName("hussain");
		per.setAdress("Hyderbad");
		per.setAdhar(20256484L);
		Licence li=new Licence();
		li.setType("Two_wheler");
		li.setExperiredate(LocalDateTime.of(2040, 05, 07, 05, 20));
		per.setLicence(li);
		System.out.println(service.savepersonWithLicence(per));;

	}

}
