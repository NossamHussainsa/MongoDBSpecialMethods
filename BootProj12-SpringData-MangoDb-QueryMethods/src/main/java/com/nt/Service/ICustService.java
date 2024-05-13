package com.nt.Service;

import java.util.List;

import com.nt.Document.CustomerData;

public interface ICustService {
	List<CustomerData>insertData(List<CustomerData> cust);
	List<CustomerData>getCustomerByCountry(String country);
	List<Object[]>getCustomersCountry(String country);
	List<Object[]>getCustomersBySlaray(Integer sa1,Integer sal2);
	List<Object[]>getCustomersBySlaray(Integer sa1);
	List<CustomerData>getCustomerCountryByExpression(String country);
	List<CustomerData>getCustomerJobByExpression(String Job);
	int getCustomerByHikel(Double Hike);
}
