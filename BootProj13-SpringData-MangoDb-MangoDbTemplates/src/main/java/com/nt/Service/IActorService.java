package com.nt.Service;

import java.util.List;

import com.nt.Document.Actor;

public interface IActorService {
	List<Actor>insertAllData(List<Actor>data);
	List<Actor>getAllData();
	List<Actor> getDetailsByCatagory(String catagory);

}
