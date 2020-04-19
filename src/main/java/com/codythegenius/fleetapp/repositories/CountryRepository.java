package com.codythegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codythegenius.fleetapp.models.Country;
 @Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
