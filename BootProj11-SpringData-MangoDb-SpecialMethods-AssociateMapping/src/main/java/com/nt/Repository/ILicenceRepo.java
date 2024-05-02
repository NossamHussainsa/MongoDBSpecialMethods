package com.nt.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Document.Licence;

public interface ILicenceRepo extends MongoRepository<Licence, Integer> {

}
