package com.TechnoSignia.azown.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TechnoSignia.azown.Entity.Owner;
import com.TechnoSignia.azown.Service.OwnerService;

@RestController
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/owner")
	public Owner createOwnerDetails(@RequestBody Owner owner) {
		return ownerService.createOwnerDetails(owner);
	}
	
	@GetMapping("/owner")
	public List<Owner> getOwnerDetails(){
		return ownerService.findAllOwnerDetails();
	}
	
	@GetMapping("/owner/{id}")
	public Optional<Owner> getOwnerDetailsById(@PathVariable Long id){
		return ownerService.findAllOwnerDetailsById(id);
	}
	@DeleteMapping("/owner")
	public String deleteOwnerDetailsById(@RequestParam Long id) {
		return ownerService.deleteOwnerDetailsById(id);
		
	}
	@PutMapping("/owner")
	public Owner editOwnerDetails(@RequestBody Owner owner, @RequestParam Long id) {
		return ownerService.updateOwnerDetails(owner,id);
	}
	
	

}
