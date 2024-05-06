package com.nt.Service;

import java.util.List;

import com.nt.Document.Licence;
import com.nt.Document.Person;

public interface Iservice {
	String savepersonWithLicence(Person per);
	List<Person>getallinfo();
	String saveLicenceWithperson(Licence lc);
}
