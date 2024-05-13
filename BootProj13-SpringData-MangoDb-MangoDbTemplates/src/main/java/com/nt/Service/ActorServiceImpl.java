package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.nt.Document.Actor;

@Service
public class ActorServiceImpl implements IActorService {
@Autowired
private MongoTemplate template;
@Override
	public List<Actor> insertAllData(List<Actor> data) {
		return  (List<Actor>) template.insert(data,Actor.class);
	}
@Override
	public List<Actor> getAllData() {
		return template.findAll(Actor.class);
	}
@Override
	public List<Actor> getDetailsByCatagory(String catagory) {
		return template.find(new Query().query(Criteria.where("role").is(catagory)), Actor.class);
	}
}
