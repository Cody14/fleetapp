package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.VehicleModel;
import com.codythegenius.fleetapp.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {
	@Autowired
	private VehicleModelRepository vehicleModelRepository;
	
	//return List of all vehicleModels
	public List<VehicleModel> getVehicleModels(){
		return vehicleModelRepository.findAll();
	}
	
	// save a new vehicleModel
	public void save(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}
	
	// find a vehicleModel by id
	
	public Optional<VehicleModel> findById (Integer id) {
		return vehicleModelRepository.findById(id);

	}
	
	public void update(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}
	
	public void delete(Integer id) {
		vehicleModelRepository.deleteById(id);
	}
}
