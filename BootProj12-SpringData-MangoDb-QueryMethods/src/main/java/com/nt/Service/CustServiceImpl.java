package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Document.CustomerData;
import com.nt.Repository.ICustomerRepo;

@Service("CustServiceImpl")
public class CustServiceImpl implements ICustService {
@Autowired
private ICustomerRepo repo;	

	@Override
	public List<CustomerData> insertData(List<CustomerData> cust) {
		return repo.saveAll(cust);
	}

	@Override
	public List<CustomerData> getCustomerByCountry(String country) {
		return repo.getCustomerDataByCountry(country);
	}

	@Override
	public List<Object[]> getCustomersCountry(String country) {
		return repo.getCustomersByCountry(country);
	}

	@Override
	public List<Object[]> getCustomersBySlaray(Integer sa1, Integer sal2) {
		return repo.getCustomersBySalary(sa1, sal2);
	}

	@Override
	public List<CustomerData> getCustomerCountryByExpression(String country) {
		return repo.getCustomerByCountryRegularExpression(country);
	}

	@Override
	public List<CustomerData> getCustomerJobByExpression(String Job) {
		return repo.getCustomerByJobExpression(Job);
	}
	@Override
	public int getCustomerByHikel(Double Hike) {
		// TODO Auto-generated method stub
		return repo.getCustomerByHike(Hike);
	}

	@Override
	public List<Object[]> getCustomersBySlaray(Integer sa1) {
		return repo.getCustomersBySalary(sa1);
	}
}
