package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Country;
import com.codythegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	//return List of all countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	// save a new country
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	// find a country by id
	
	public Optional<Country> findById (Integer id) {
		return countryRepository.findById(id);

	}
	
	public void update(Country country) {
		countryRepository.save(country);
	}
	
	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}
}
