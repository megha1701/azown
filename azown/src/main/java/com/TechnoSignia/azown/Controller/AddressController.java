package com.TechnoSignia.azown.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TechnoSignia.azown.Entity.Address;
import com.TechnoSignia.azown.Service.AddressService;



@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public Address createAddressDetails(@RequestBody Address address) {
		return addressService.createAddressDetails(address);
	}

}
