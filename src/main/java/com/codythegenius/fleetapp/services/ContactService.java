package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.Contact;
import com.codythegenius.fleetapp.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	//return List of all contacts
	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}
	
	// save a new contact
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
	
	// find a contact by id
	
	public Optional<Contact> findById (Integer id) {
		return contactRepository.findById(id);

	}
	
	public void update(Contact contact) {
		contactRepository.save(contact);
	}
	
	public void delete(Integer id) {
		contactRepository.deleteById(id);
	}
}
