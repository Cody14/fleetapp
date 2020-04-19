package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Location;
import com.codythegenius.fleetapp.repositories.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	//return List of all locations
	public List<Location> getLocations(){
		return locationRepository.findAll();
	}
	
	// save a new location
	public void save(Location location) {
		locationRepository.save(location);
	}
	
	// find a location by id
	
	public Optional<Location> findById (Integer id) {
		return locationRepository.findById(id);

	}
	
	public void update(Location location) {
		locationRepository.save(location);
	}
	
	public void delete(Integer id) {
		locationRepository.deleteById(id);
	}
}
