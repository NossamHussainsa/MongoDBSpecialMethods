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
	
	@Query(fields = "{cid:1,name:1,salary:1,jobDestination:1,Hike:1,Country:1}",value = "{salary:{$gte:?0,$lte:?1}}")
	List<Object[]>getCustomersBySalary(Integer sa1,Integer sal2);
	
	@Query(fields = "{cid:1,name:1,salary:1,jobDestination:1,Hike:1,Country:1}",value = "{salary:{$gte:?0}}")
	List<Object[]>getCustomersBySalary(Integer sa1);
	
	@Query(value = "{Country:{$regex:?0}}")
	List<CustomerData>getCustomerByCountryRegularExpression(String country);
	
	@Query(value = "{jobDestination:{$regex:?0}}")
	List<CustomerData>getCustomerByJobExpression(String job);
	
	@Query(value = "{Hike:{$gte:?0}",count = true)
	int getCustomerByHike(Double Hike);
	
	
}
