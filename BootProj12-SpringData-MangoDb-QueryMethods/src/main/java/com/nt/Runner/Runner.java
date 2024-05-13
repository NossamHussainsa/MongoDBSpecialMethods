package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Document.CustomerData;
import com.nt.Service.ICustService;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private ICustService service;
	@Override
	public void run(String... args) throws Exception {
		CustomerData cust=new CustomerData();
		cust.setName("hussain");cust.setCountry("India");cust.setSalary(25000);
		cust.setJobDestination("javaDeveloper");cust.setHike(1500.23);
		
		CustomerData cust3=new CustomerData();
		cust3.setName("hussainsaNossam");cust3.setCountry("Iran");cust3.setSalary(75000);
		cust3.setJobDestination("FullStackjavaDeveloper");cust3.setHike(9500.23);
		
		CustomerData cust1=new CustomerData();
		cust1.setName("hussainsa");cust1.setCountry("japan");cust1.setSalary(50000);
		cust1.setJobDestination("backend");cust1.setHike(8500.23);
		
		CustomerData cust2=new CustomerData();
		cust2.setName("hussain");cust2.setCountry("India");cust2.setSalary(25000);
		cust2.setJobDestination("javaDeveloper");cust2.setHike(1500.23);
		//service.insertData(List.of(cust,cust1,cust2,cust3));
		//service.getCustomerByCountry("India").forEach(data->System.out.println(data));
		
		/*
		 * service.getCustomersCountry("Iran").forEach(data->{ for(Object info:data) {
		 * System.out.print(info+" "); } System.out.println(); });
		 */
		 
		/*
		 * service.getCustomersBySlaray(25000).forEach(data->{ for(Object info:data) {
		 * System.out.print(info+" "); } System.out.println(); });
		 */
		  service.getCustomersBySlaray(5000,25000).forEach(data->{ for(Object
				  info:data) { System.out.print(info+" "); } System.out.println(); });
		 
		//service.getCustomerCountryByExpression("^I").forEach(data->System.out.println(data));
		//service.getCustomerJobByExpression("d$").forEach(data->System.out.println(data));
		}

}
