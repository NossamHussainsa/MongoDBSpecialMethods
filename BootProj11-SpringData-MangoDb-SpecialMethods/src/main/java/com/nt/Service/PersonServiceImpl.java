package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Document.PersonDetails;
import com.nt.Repo.IpersonRepo;

@Service("PersonServiceImpl")
public class PersonServiceImpl implements IpersonService {
@Autowired
private IpersonRepo repo;
	@Override
	public List<PersonDetails> insertDetails(List<PersonDetails> details) {
		return repo.saveAll(details);
	}
	@Override
	public List<PersonDetails> getAllinfo() {
		return repo.findAll();
	}

}
