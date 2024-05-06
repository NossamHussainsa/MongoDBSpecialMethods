package com.nt.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Document.Person;

public interface IpersonRepo extends MongoRepository<Person,Integer> {

}
