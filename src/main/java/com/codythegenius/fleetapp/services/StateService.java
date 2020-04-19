package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.State;
import com.codythegenius.fleetapp.repositories.StateRepository;

@Service
public class StateService {
	@Autowired
	private StateRepository stateRepository;
	
	//return List of all states
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	// save a new state
	public void save(State state) {
		stateRepository.save(state);
	}
	
	// find a state by id
	
	public Optional<State> findById (Integer id) {
		return stateRepository.findById(id);

	}
	
	public void update(State state) {
		stateRepository.save(state);
	}
	
	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}
}
