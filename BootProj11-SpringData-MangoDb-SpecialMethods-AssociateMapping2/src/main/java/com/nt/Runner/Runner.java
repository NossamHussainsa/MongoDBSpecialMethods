package com.nt.Runner;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Document.Licence;
import com.nt.Document.Person;
import com.nt.Service.Iservice;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private Iservice service;
	@Override
	public void run(String... args) throws Exception {
		//parent to child associate mapping
		
		/*
		 * Person per=new Person(); per.setPid(new Random().nextInt(1000));
		 * per.setName("hussain"); per.setAdress("Hyderbad"); per.setAdhar(20256484L);
		 * Licence li=new Licence(); li.setType("Two_wheler");
		 * li.setExperiredate(LocalDateTime.of(2040, 05, 07, 05, 20));
		 * per.setLicence(li);
		 * //System.out.println(service.savepersonWithLicence(per));;
		 * //service.getallinfo().forEach(info->{System.out.println(info);});
		 */
		//child to parent associate  mapping
		Person per=new Person();
		per.setPid(new Random().nextInt(100000));
		per.setName("hussainsa");
		per.setAdress("Hyderbad_chennai");
		per.setAdhar(202565484L);
		Licence li=new Licence();
		li.setLid(new Random().nextInt(100000));
		li.setType("Two_wheler");
		li.setExperiredate(LocalDateTime.of(2040, 05, 07, 05, 20));
	//	per.setLicence(li);
		li.setPerson(per);
		System.out.println(service.saveLicenceWithperson(li));;
	}

}
