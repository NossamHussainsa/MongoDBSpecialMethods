package com.nt.Service;

import java.util.List;

import com.nt.Document.Players;

public interface IPlayerService {
	List<Players>inserPlayers(	List<Players> payers);
	List<Players>RetriveAllPayers();
}
