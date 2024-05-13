package com.TechnoSignia.azown.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.azown.Entity.Address;
import com.TechnoSignia.azown.Repository.AddressRepository;



@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	
	public Address createAddressDetails(Address address) {
		return addressRepository.save(address);
	}

}
