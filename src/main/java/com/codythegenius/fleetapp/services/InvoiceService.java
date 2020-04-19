package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Invoice;
import com.codythegenius.fleetapp.repositories.InvoiceRepository;

@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	//return List of all invoices
	public List<Invoice> getInvoices(){
		return invoiceRepository.findAll();
	}
	
	// save a new invoice
	public void save(Invoice invoice) {
		invoiceRepository.save(invoice);
	}
	
	// find a invoice by id
	
	public Optional<Invoice> findById (Integer id) {
		return invoiceRepository.findById(id);

	}
	
	public void update(Invoice invoice) {
		invoiceRepository.save(invoice);
	}
	
	public void delete(Integer id) {
		invoiceRepository.deleteById(id);
	}
}
