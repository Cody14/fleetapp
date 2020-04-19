package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.VehicleMaintenance;
import com.codythegenius.fleetapp.repositories.VehicleMaintenanceRepository;

@Service
public class VehicleMaintenanceService {
	@Autowired
	private VehicleMaintenanceRepository vehicleMaintenanceRepository;
	
	//return List of all vehicleMaintenances
	public List<VehicleMaintenance> getVehicleMaintenances(){
		return vehicleMaintenanceRepository.findAll();
	}
	
	// save a new vehicleMaintenance
	public void save(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceRepository.save(vehicleMaintenance);
	}
	
	// find a vehicleMaintenance by id
	
	public Optional<VehicleMaintenance> findById (Integer id) {
		return vehicleMaintenanceRepository.findById(id);

	}
	
	public void update(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceRepository.save(vehicleMaintenance);
	}
	
	public void delete(Integer id) {
		vehicleMaintenanceRepository.deleteById(id);
	}

}
