package com.nt.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nt.Document.Sports;
@Repository
public interface ISportRepo extends MongoRepository<Sports, String> {

}
