package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.VehicleMake;
import com.codythegenius.fleetapp.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	//return List of all vehicleMakes
	public List<VehicleMake> getVehicleMakes(){
		return vehicleMakeRepository.findAll();
	}
	
	// save a new vehicleMake
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	// find a vehicleMake by id
	
	public Optional<VehicleMake> findById (Integer id) {
		return vehicleMakeRepository.findById(id);

	}
	
	public void update(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	public void delete(Integer id) {
		vehicleMakeRepository.deleteById(id);
	}
}
