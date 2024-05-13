package com.TechnoSignia.azown.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	@OneToOne
	Address address;
	
	Double rentalPrice;
	
	Double sellPrice;
	
	Long propertyAge;
	
	String propertyType;
	
	String configuration;
	
	String furnishingStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(Double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Long getPropertyAge() {
		return propertyAge;
	}

	public void setPropertyAge(Long propertyAge) {
		this.propertyAge = propertyAge;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getFurnishingStatus() {
		return furnishingStatus;
	}

	public void setFurnishingStatus(String furnishingStatus) {
		this.furnishingStatus = furnishingStatus;
	}

	
	
}
