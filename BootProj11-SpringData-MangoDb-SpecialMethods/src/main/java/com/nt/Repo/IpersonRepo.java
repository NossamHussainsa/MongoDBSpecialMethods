package com.nt.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nt.Document.PersonDetails;
@Repository
public interface IpersonRepo extends MongoRepository<PersonDetails, String> {

}
