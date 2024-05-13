package com.TechnoSignia.azown.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.azown.Entity.Advertisement;

import com.TechnoSignia.azown.Repository.AdvertisementRepository;


@Service
public class AdvertisementService {
	@Autowired
	AdvertisementRepository advertisementRepository;
	
	public Advertisement createAdvertisementDetails(Advertisement advertisement) {
		return advertisementRepository.save(advertisement);
	}

	public List<Advertisement> findAllAdvertisementDetails() {
		return advertisementRepository.findAll();
	}

	public Optional<Advertisement> findAllAdvertisementDetailsById(Long id) {
		return advertisementRepository.findById(id);
	}

	public String deleteAdvertisementDetailsById(Long id) {
		advertisementRepository.deleteById(id);
		return "record deleted Successfully";
	}

	public Advertisement updateAdvertisementDetails(Advertisement advertisement, Long id) {
		Advertisement dbAdvertisement =null;
		Optional<Advertisement> opAdvertisement = advertisementRepository.findById(id);
		if(opAdvertisement.isPresent()) {
			dbAdvertisement = opAdvertisement.get();
			dbAdvertisement.setAdsType(advertisement.getAdsType());
			
			
		}
		return advertisementRepository.save(dbAdvertisement);
	}

}
