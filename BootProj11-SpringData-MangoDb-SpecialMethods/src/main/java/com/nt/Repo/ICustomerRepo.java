package com.nt.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Document.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {
	List<Customer> findByCadressIn(String cadress,String ad1);
	List<Customer> findByCidIn(Integer cid1,Integer cid2);

}
