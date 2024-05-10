package com.nt.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nt.Document.Medals;
@Repository
public interface IMedalRepo extends MongoRepository<Medals, String> {

}
