package com.TechnoSignia.azown.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnoSignia.azown.Entity.Advertisement;

@Repository
public interface AdvertisementRepository extends  JpaRepository<Advertisement, Long> {

}
