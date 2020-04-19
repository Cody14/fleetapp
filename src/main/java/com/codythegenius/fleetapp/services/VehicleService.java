package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Vehicle;
import com.codythegenius.fleetapp.repositories.VehicleRepository;


@Service
public class VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;
	
	//return List of all vehicles
	public List<Vehicle> getVehicles(){
		return vehicleRepository.findAll();
	}
	
	// save a new vehicle
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}
	
	// find a vehicle by id
	
	public Optional<Vehicle> findById (Integer id) {
		return vehicleRepository.findById(id);

	}
	
	public void update(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}
	
	public void delete(Integer id) {
		vehicleRepository.deleteById(id);
	}
}
