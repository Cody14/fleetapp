package com.codythegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codythegenius.fleetapp.models.JobTitle;
import com.codythegenius.fleetapp.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired
	private JobTitleRepository jobTitleRepository;
	
	//return List of all jobTitles
	public List<JobTitle> getJobTitles(){
		return jobTitleRepository.findAll();
	}
	
	// save a new jobTitle
	public void save(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}
	
	// find a jobTitle by id
	
	public Optional<JobTitle> findById (Integer id) {
		return jobTitleRepository.findById(id);

	}
	
	public void update(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}
	
	public void delete(Integer id) {
		jobTitleRepository.deleteById(id);
	}
}
