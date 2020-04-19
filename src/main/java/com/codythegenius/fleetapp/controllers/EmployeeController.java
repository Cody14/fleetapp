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
import com.codythegenius.fleetapp.models.Employee;
import com.codythegenius.fleetapp.models.EmployeeType;
import com.codythegenius.fleetapp.models.JobTitle;
import com.codythegenius.fleetapp.models.State;
import com.codythegenius.fleetapp.services.CountryService;
import com.codythegenius.fleetapp.services.EmployeeService;
import com.codythegenius.fleetapp.services.EmployeeTypeService;
import com.codythegenius.fleetapp.services.JobTitleService;
import com.codythegenius.fleetapp.services.StateService;

@Controller
public class EmployeeController {

	@Autowired
	private JobTitleService jobTitleService;
	@Autowired	
	private EmployeeTypeService employeeTypeService;
	@Autowired	
	private EmployeeService employeeService;
	@Autowired	
	private StateService stateService;
	@Autowired	
	private CountryService countryService;
	
	
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		
		List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeTypes();	
		model.addAttribute("employeeTypes", employeeTypeList);                   
		
		List<JobTitle> jobTitleList = jobTitleService.getJobTitles();
		model.addAttribute("jobTitles", jobTitleList);                       
		
		List<Employee> employeeList = employeeService.getEmployees();	
		model.addAttribute("employees", employeeList);	
		
		List<State> stateList = stateService.getStates();
		model.addAttribute("states", stateList);                       
		
		List<Country> countryList = countryService.getCountries();	
		model.addAttribute("countries", countryList);	
		
		return "employee";                                              
		 
	}
	
	@PostMapping("/employees/addNew")
	public String addNew(Employee employee) {
	    employeeService.save(employee);
	    return "redirect:/employees";
	}
	
	@RequestMapping("/employees/findById")
	@ResponseBody
	public Optional<Employee> findById(Integer id) {
		return employeeService.findById(id);
	}
	
	@RequestMapping(value = "/employees/update", method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Employee employee) {
	    employeeService.update(employee);
	    return "redirect:/employees";
	}
	
	
	@RequestMapping(value = "/employees/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
	    employeeService.delete(id);
	    return "redirect:/employees";
	}
}
