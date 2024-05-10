package com.nt.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.Document.CustomerData;
@Repository
public interface ICustomerRepo extends MongoRepository<CustomerData, String> {
	@Query(value = "{Country:?0}")
	List<CustomerData>getCustomerDataByCountry(String country);
	
	@Query(fields = "{cid:1,name:1,salary:1,jobDestination:1,Hike:1}",value = "{Country:?0}")
	List<Object[]>getCustomersByCountry(String country);
	
	@Query(fields = "{cid:1,name:1,salary:1,jobDestination:1,Hike:1,Country:1}",value = "{Country:{$gte:?0,$lte:?1}}")
	List<Object[]>getCustomersBySalary(Integer sa1,Integer sal2);
}
