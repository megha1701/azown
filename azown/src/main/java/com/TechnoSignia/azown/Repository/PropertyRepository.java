package com.TechnoSignia.azown.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.TechnoSignia.azown.Entity.Property;

@Repository
public interface PropertyRepository extends  JpaRepository<Property, Long> {

}
