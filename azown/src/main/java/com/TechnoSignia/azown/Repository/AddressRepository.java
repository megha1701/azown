package com.TechnoSignia.azown.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnoSignia.azown.Entity.Address;

@Repository
public interface AddressRepository extends  JpaRepository<Address, Long>{

}