package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.EmployeeType;
import com.codythegenius.fleetapp.repositories.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {
	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
	
	//return List of all employeeTypes
	public List<EmployeeType> getEmployeeTypes(){
		return employeeTypeRepository.findAll();
	}
	
	// save a new employeeType
	public void save(EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}
	
	// find a employeeType by id
	
	public Optional<EmployeeType> findById (Integer id) {
		return employeeTypeRepository.findById(id);

	}
	
	public void update(EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}
	
	public void delete(Integer id) {
		employeeTypeRepository.deleteById(id);
	}
}
