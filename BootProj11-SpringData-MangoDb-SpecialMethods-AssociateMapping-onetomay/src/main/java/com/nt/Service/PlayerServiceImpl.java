package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Document.Players;
import com.nt.Repository.IMedalRepo;
import com.nt.Repository.IPlayerRepo;
import com.nt.Repository.ISportRepo;

@Service("PlayerServiceImpl")
public class PlayerServiceImpl implements IPlayerService {
	@Autowired
	private IPlayerRepo prepo;
	@Autowired
	private ISportRepo srepo;
	@Autowired
	private IMedalRepo mrepo;
	@Override
	public List<Players> inserPlayers(List<Players>payers) {
		// TODO Auto-generated method stub
		return prepo.saveAll(payers);
	}
	@Override
	public List<Players> RetriveAllPayers() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}
}
