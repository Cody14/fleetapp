package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.VehicleStatus;
import com.codythegenius.fleetapp.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {
	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;
	
	//return List of all vehicleStatus
	public List<VehicleStatus> getVehicleStatuses(){
		return vehicleStatusRepository.findAll();
	}
	
	// save a new vehicleStatus
	public void save(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}
	
	// find a vehicleStatus by id
	
	public Optional<VehicleStatus> findById (Integer id) {
		return vehicleStatusRepository.findById(id);

	}
	
	public void update(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}
	
	public void delete(Integer id) {
		vehicleStatusRepository.deleteById(id);
	}
}
