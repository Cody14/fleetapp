package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Supplier;
import com.codythegenius.fleetapp.repositories.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	
	//return List of all suppliers
	public List<Supplier> getSuppliers(){
		return supplierRepository.findAll();
	}
	
	// save a new supplier
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}
	
	// find a supplier by id
	
	public Optional<Supplier> findById (Integer id) {
		return supplierRepository.findById(id);

	}
	
	public void update(Supplier supplier) {
		supplierRepository.save(supplier);
	}
	
	public void delete(Integer id) {
		supplierRepository.deleteById(id);
	}
}
