package com.nt.Runner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Document.GenerateId;
import com.nt.Document.PersonDetails;
import com.nt.Service.IpersonService;
@Component
public class Runner implements CommandLineRunner {
@Autowired IpersonService service;
	@Override
	public void run(String... args) throws Exception {
		PersonDetails pe1=new PersonDetails();
		pe1.setId(GenerateId.getGeneratedId());
		pe1.setPid(1001);
		pe1.setPname("hussain");
		pe1.setPadress("Chennai");
		pe1.setDob(LocalDateTime.of(1999, 05, 07, 04, 35));
		pe1.setMobilenumbers(Set.of(8523647851L,9874562152L));
		pe1.setNickNames(List.of("hussain","hussain","basha"));
		pe1.setBanksdetails(Map.of("SBI",202770,"icici",256854));
		Properties prop=new Properties();
		prop.setProperty("adhar", "222083416805");
		prop.setProperty("pan", "MIJPs0583H");
		pe1.setProperties(prop);
		//===================================================
		PersonDetails pe11=new PersonDetails();
		pe11.setId(GenerateId.getGeneratedId());
		pe11.setPid(1002);
		pe11.setPname("hussainsa");
		pe11.setPadress("Hyderabad");
		pe11.setDob(LocalDateTime.of(1998, 8, 06, 8, 35));
		pe11.setMobilenumbers(Set.of(15965487822L,9658745215L));
		pe11.setNickNames(List.of("hussainsa","hussainsa","basha1"));
		pe11.setBanksdetails(Map.of("Canara",5895,"Kotak",1564));
		Properties prop11=new Properties();
		prop11.setProperty("adhar1", "2220834168051");
		prop11.setProperty("pan1", "MIJPs0583H1");
		pe11.setProperties(prop11);
		service.insertDetails(List.of(pe1,pe11));//.forEach(info->{System.out.println(info);});;
		service.getAllinfo().forEach(info->{System.out.println(info);});;
	}

}
