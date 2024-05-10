package com.nt.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nt.Document.Players;
@Repository
public interface IPlayerRepo extends MongoRepository<Players, Integer> {

}
