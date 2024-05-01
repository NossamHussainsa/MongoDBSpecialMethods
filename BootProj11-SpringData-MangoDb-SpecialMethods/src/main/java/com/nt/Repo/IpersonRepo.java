package com.nt.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Document.PersonDetails;

public interface IpersonRepo extends MongoRepository<PersonDetails, String> {

}
