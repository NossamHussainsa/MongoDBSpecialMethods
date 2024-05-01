package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Document.Customer;
import com.nt.Document.Generator;
import com.nt.Service.ICustomerService;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private ICustomerService service;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Customer cus1=new Customer(); cus1.setId(Generator.getGenerator());
		 * cus1.setCid(1003);cus1.setCname("Mustrafa");cus1.setCadress("Chennai");
		 * System.out.println(service.insertInfo(cus1));
		 * 
		 * 
		 *
		 */
		 
		//System.out.println(service.deleteInfo("00371f43-1"));
		 //service.getAllinfo().forEach(info->{ System.out.println(info); });
		//service.fetchbycounties("Chennai","hyderabad").forEach(info->{System.out.println(info);});
		service.fetchbyId(1001,10013).forEach(info->{System.out.println(info);});
	}

}
