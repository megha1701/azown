package com.TechnoSignia.azown.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnoSignia.azown.Entity.Owner;

@Repository
public interface OwnerRepository extends  JpaRepository<Owner, Long> {

}
