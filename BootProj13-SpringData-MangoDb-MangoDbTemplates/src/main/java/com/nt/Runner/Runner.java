package com.nt.Runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Document.Actor;
import com.nt.Service.IActorService;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private IActorService service;
	@Override
	public void run(String... args) throws Exception {
		Actor ac=new Actor(new Random().nextInt(10000), "khabib", "hero", 56000.23, 32);
		Actor ac1=new Actor(new Random().nextInt(10000), "shaeenAfridi", "hero", 76000.23, 28);
		Actor ac2=new Actor(new Random().nextInt(10000), "spartnas", "hero", 38000.23, 88);
		//service.insertAllData(List.of(ac,ac1,ac2));
		service.getDetailsByCatagory("hero").forEach(info->System.out.println(info));

	}

}
