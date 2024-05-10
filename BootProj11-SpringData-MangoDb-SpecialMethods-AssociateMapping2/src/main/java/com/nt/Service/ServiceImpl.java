package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Document.Licence;
import com.nt.Document.Person;
import com.nt.Repository.ILicenceRepo;
import com.nt.Repository.IpersonRepo;

@Service("ServiceImpl")
public class ServiceImpl implements Iservice {
@Autowired
private IpersonRepo prepo;
@Autowired
private ILicenceRepo lrepo;
@Override
public String savepersonWithLicence(Person per) {
	
	return "person data is saved with the id:"+prepo.save(per).getPid();
}
@Override
public String saveLicenceWithperson(Licence lc) {
	// TODO Auto-generated method stub
	return "licence is saved with the id:"+lrepo.save(lc).getLid();
}
	@Override
	public List<Person> getallinfo() {
		return prepo.findAll();
	}
}
