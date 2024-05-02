package com.nt.Service;

import java.util.List;

import com.nt.Document.PersonDetails;

public interface IpersonService {
	List<PersonDetails>insertDetails(List<PersonDetails> details);
	List<PersonDetails>getAllinfo();
}
