package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Employee;
import com.codythegenius.fleetapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//return List of all employees
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}
	
	// save a new employee
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
	
	// find a employee by id
	
	public Optional<Employee> findById (Integer id) {
		return employeeRepository.findById(id);

	}
	
	public void update(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void delete(Integer id) {
		employeeRepository.deleteById(id);
	}
}
