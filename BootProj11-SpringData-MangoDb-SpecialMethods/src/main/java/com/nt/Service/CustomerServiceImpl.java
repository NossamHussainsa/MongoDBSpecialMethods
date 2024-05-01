package com.nt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Document.Customer;
import com.nt.Repo.ICustomerRepo;

@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements ICustomerService {
@Autowired
private ICustomerRepo repo;

	@Override
	public String insertInfo(Customer cus) {
		
		return "Document have Saved with the id:"+repo.save(cus).getId();
	}

	@Override
	public List<Customer> getAllinfo() {
		return repo.findAll();
	}

	@Override
	public String deleteInfo(String info) {
		Optional<Customer> opt=repo.findById(info);
		if(opt.isPresent())
		{
			repo.deleteById(info);
			Customer cus=opt.get();
			return "Document with cid:"+cus.getCid()+" is deleted";
		}
		return "Document nopt found";
	}

	@Override
	public List<Customer> fetchbycounties(String ad1,String ad11) {
		return repo.findByCadressIn(ad1,ad11);
	}

	@Override
	public List<Customer> fetchbyId(Integer value,Integer value1) {
		return repo.findByCidIn(value, value);
	}
}
