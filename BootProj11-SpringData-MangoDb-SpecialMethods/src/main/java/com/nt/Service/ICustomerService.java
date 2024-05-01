package com.nt.Service;

import java.util.List;

import com.nt.Document.Customer;

public interface ICustomerService {
	String insertInfo(Customer cus);
	List<Customer>getAllinfo();
	String deleteInfo(String info);
	List<Customer>fetchbycounties(String ad1,String ad2);
	List<Customer>fetchbyId(Integer value,Integer value1);
}
