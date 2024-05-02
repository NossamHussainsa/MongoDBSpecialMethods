package com.nt.Service;

import com.nt.Document.Licence;
import com.nt.Document.Person;

public interface Iservice {
	String savepersonWithLicence(Person per);
	String saveLicenceWithperson(Licence lc);
}
