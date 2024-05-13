package com.TechnoSignia.azown.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.azown.Entity.Property;
import com.TechnoSignia.azown.Repository.PropertyRepository;

@Service
public class PropertyService {
	
	@Autowired
	PropertyRepository propertyRepository;
	
	public Property createProperty(Property property) {
		return propertyRepository.save(property);

	}
	
	public List<Property> findAllPropertiesDetails()  {
		return propertyRepository.findAll();

	}
}
