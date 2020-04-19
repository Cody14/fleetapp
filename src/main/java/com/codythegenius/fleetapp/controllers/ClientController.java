package com.codythegenius.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codythegenius.fleetapp.models.Country;
import com.codythegenius.fleetapp.models.Client;
import com.codythegenius.fleetapp.models.State;
import com.codythegenius.fleetapp.services.CountryService;
import com.codythegenius.fleetapp.services.ClientService;
import com.codythegenius.fleetapp.services.StateService;

@Controller
public class ClientController {

	@Autowired
	private StateService stateService;
	@Autowired	
	private CountryService countryService;
	@Autowired	
	private ClientService clientService;
	
	@GetMapping("/clients")
	public String getClients(Model model) {
		
		List<Country> countryList = countryService.getCountries();	
		model.addAttribute("countries", countryList);                   
		
		List<State> stateList = stateService.getStates();
		model.addAttribute("states", stateList);                       
		
		List<Client> clientList = clientService.getClients();	
		model.addAttribute("clients", clientList);		            
		
		return "client";                                              
		 
	}
	
	@PostMapping("/clients/addNew")
	public String addNew(Client client) {
	    clientService.save(client);
	    return "redirect:/clients";
	}
	
	@RequestMapping("/clients/findById")
	@ResponseBody
	public Optional<Client> findById(Integer id) {
		return clientService.findById(id);
	}
	
	@RequestMapping(value = "/clients/update", method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Client client) {
	    clientService.update(client);
	    return "redirect:/clients";
	}
	
	
	@RequestMapping(value = "/clients/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
	    clientService.delete(id);
	    return "redirect:/clients";
	}
	
}
