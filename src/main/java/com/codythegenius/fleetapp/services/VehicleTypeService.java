package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.VehicleType;
import com.codythegenius.fleetapp.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {
	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	//return List of all vehicleTypes
	public List<VehicleType> getVehicleTypes(){
		return vehicleTypeRepository.findAll();
	}
	
	// save a new vehicleType
	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}
	
	// find a vehicleType by id
	
	public Optional<VehicleType> findById (Integer id) {
		return vehicleTypeRepository.findById(id);

	}
	
	public void update(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}
	
	public void delete(Integer id) {
		vehicleTypeRepository.deleteById(id);
	}
}
