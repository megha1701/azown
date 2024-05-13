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

import com.TechnoSignia.azown.Entity.Advertisement;

import com.TechnoSignia.azown.Service.AdvertisementService;


@RestController
public class AdvertisementController {
	
	@Autowired
	AdvertisementService advertisementService;
	
	@PostMapping("/advertisement")
	public Advertisement createAdvertisementDetails(@RequestBody Advertisement advertisement) {
		return advertisementService.createAdvertisementDetails(advertisement);
	}
	
	@GetMapping("/advertisement")
	public List<Advertisement> getAdvertisementDetails(){
		return advertisementService.findAllAdvertisementDetails();
	}
	
	@GetMapping("/advertisement/{id}")
	public Optional<Advertisement> getAdvertisementDetailsById(@PathVariable Long id){
		return advertisementService.findAllAdvertisementDetailsById(id);
	}
	@DeleteMapping("/advertisement")
	public String deleteAdvertisementDetailsById(@RequestParam Long id) {
		return advertisementService.deleteAdvertisementDetailsById(id);
		
	}
	@PutMapping("/advertisement")
	public Advertisement editAdvertisementDetails(@RequestBody Advertisement advertisement, @RequestParam Long id) {
		return advertisementService.updateAdvertisementDetails(advertisement,id);
	}
	
	

}
