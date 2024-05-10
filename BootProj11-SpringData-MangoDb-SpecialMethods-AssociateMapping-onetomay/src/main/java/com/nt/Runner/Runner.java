package com.nt.Runner;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Document.MedalType;
import com.nt.Document.Medals;
import com.nt.Document.Players;
import com.nt.Document.Sports;
import com.nt.Service.IPlayerService;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private IPlayerService service;
	@Override
	public void run(String... args) throws Exception {
		//Player ===>p1  Start
		Players p1=new Players();
		p1.setPid(new Random().nextInt(100000));
		p1.setPlayerName("Khalid");
		p1.setPlayerCountry("India");
		
		//Creating ChildClass for p1
		//sporsts payed
		Sports s1=new Sports();
		s1.setSid(UUID.randomUUID().toString().replaceAll("-", "").substring(0,10));
		s1.setGamePlayed("Kabbaddi");
		s1.setIsSingleSport(false);
		s1.setIsteamSport(true);
		s1.setKitDetails(new String[] {"pads","gloves","drinks","spayers","medicines"});
		Sports s2=new Sports();
		s2.setSid(UUID.randomUUID().toString().replaceAll("-", "").substring(0,10));
		s2.setGamePlayed("Runnibg");
		s2.setIsSingleSport(true);
		s2.setIsteamSport(false);
		s2.setKitDetails(new String[] {"pads","shoes","drinks","spayers","medicines","tracks"});
		
		Medals m1=new Medals();
		m1.setMid(UUID.randomUUID().toString().replaceAll("-", "").substring(0,10));
		m1.setOlympicHeld("tokyo");
		m1.setTypeOfMedal(MedalType.Bronze);
		m1.setPriceMoney(120000);
		Medals m2=new Medals();
		m2.setMid(UUID.randomUUID().toString().replaceAll("-", "").substring(0,10));
		m2.setOlympicHeld("japan");
		m2.setTypeOfMedal(MedalType.GOLD);
		m2.setPriceMoney(250000);
		
		p1.setGamesPlayed(Set.of(s1,s2));
		p1.setMedalsGot(Map.of("tokyo",m1,
								"japan",m2));
		//service.inserPlayers(List.of(p1));
		service.RetriveAllPayers().forEach(players->{
			System.out.println(players);
			Set<Sports>getSports=players.getGamesPlayed();
			getSports.forEach(sports->System.out.println("Sports===>"+sports));
			Map<String,Medals>getMedals=players.getMedalsGot();
			getMedals.forEach((game,medal)->System.out.println("Medals Details===>"+game+" "+medal));
			}
		);
	}

}
