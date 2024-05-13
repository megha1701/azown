package com.TechnoSignia.azown.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Advertisement {
	
	@Id
	Long id;
	
	Long adsNumber;
	
	String adsType;
	
	@OneToMany
	List<Property> properties;
	
	int discount;
	
	String preference;
	
	String description;
	
	String postedOn;
	
	String adsDuration;
	
	String adsStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAdsNumber() {
		return adsNumber;
	}

	public void setAdsNumber(Long adsNumber) {
		this.adsNumber = adsNumber;
	}

	public String getAdsType() {
		return adsType;
	}

	public void setAdsType(String adsType) {
		this.adsType = adsType;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(String postedOn) {
		this.postedOn = postedOn;
	}

	public String getAdsDuration() {
		return adsDuration;
	}

	public void setAdsDuration(String adsDuration) {
		this.adsDuration = adsDuration;
	}

	public String getAdsStatus() {
		return adsStatus;
	}

	public void setAdsStatus(String adsStatus) {
		this.adsStatus = adsStatus;
	}	
}
