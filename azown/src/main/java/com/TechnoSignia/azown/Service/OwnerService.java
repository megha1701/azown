package com.TechnoSignia.azown.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.azown.Entity.Owner;
import com.TechnoSignia.azown.Repository.OwnerRepository;

@Service
public class OwnerService {
	
	@Autowired
	OwnerRepository ownerRepository;
	
	public Owner createOwnerDetails(Owner owner) {
		return ownerRepository.save(owner);
	}

	public List<Owner> findAllOwnerDetails() {
		return ownerRepository.findAll();
	}

	public Optional<Owner> findAllOwnerDetailsById(Long id) {
		return ownerRepository.findById(id);
	}

	public String deleteOwnerDetailsById(Long id) {
		ownerRepository.deleteById(id);
		return "record deleted Successfully";
	}

	public Owner updateOwnerDetails(Owner owner, Long id) {
		Owner dbOwner =null;
		Optional<Owner> opOwner = ownerRepository.findById(id);
		if(opOwner.isPresent()) {
			dbOwner = opOwner.get();
			dbOwner.setContact(owner.getContact());
			dbOwner.setEmail(owner.getEmail());
			dbOwner.setName(owner.getName());
			
		}
		return ownerRepository.save(dbOwner);
	}

}
