package com.TechnoSignia.azown.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TechnoSignia.azown.Entity.Property;
import com.TechnoSignia.azown.Service.PropertyService;

@RestController
public class PropertyController {
	
	@Autowired
	PropertyService propertyService;
	
	@PostMapping("/property")
	public Property createPropertyDetails(@RequestBody Property property) {
		return propertyService.createProperty(property);
	}
	
	@GetMapping("/property")
	public List<Property> getAllPropertiesDetails(){
		return propertyService.findAllPropertiesDetails();
	}


}
