package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.InvoiceStatus;
import com.codythegenius.fleetapp.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
	
	//return List of all invoiceStatuss
	public List<InvoiceStatus> getInvoiceStatuses(){
		return invoiceStatusRepository.findAll();
	}
	
	// save a new invoiceStatus
	public void save(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}
	
	// find a invoiceStatus by id
	
	public Optional<InvoiceStatus> findById (Integer id) {
		return invoiceStatusRepository.findById(id);

	}
	
	public void update(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}
	
	public void delete(Integer id) {
		invoiceStatusRepository.deleteById(id);
	}
}
