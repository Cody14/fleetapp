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

import com.codythegenius.fleetapp.models.Employee;
import com.codythegenius.fleetapp.models.Location;
import com.codythegenius.fleetapp.models.Vehicle;
import com.codythegenius.fleetapp.models.VehicleMake;
import com.codythegenius.fleetapp.models.VehicleModel;
import com.codythegenius.fleetapp.models.VehicleStatus;
import com.codythegenius.fleetapp.models.VehicleType;
import com.codythegenius.fleetapp.services.VehicleService;
import com.codythegenius.fleetapp.services.VehicleStatusService;
import com.codythegenius.fleetapp.services.EmployeeService;
import com.codythegenius.fleetapp.services.LocationService;
import com.codythegenius.fleetapp.services.VehicleMakeService;
import com.codythegenius.fleetapp.services.VehicleModelService;
import com.codythegenius.fleetapp.services.VehicleTypeService;

@Controller
public class VehicleController {
	
	@Autowired	
	private VehicleService vehicleService;
	@Autowired
	private VehicleTypeService vehicleTypeService;
	@Autowired	
	private VehicleMakeService vehicleMakeService;
	@Autowired
	private VehicleStatusService vehicleStatusService;
	@Autowired	
	private EmployeeService employeeService;
	@Autowired
	private VehicleModelService vehicleModelService;
	@Autowired
	private LocationService locationService;
	
	
	
	@GetMapping("/vehicles")
	public String getVehicles(Model model) {
		
		List<VehicleMake> vehicleMakeList = vehicleMakeService.getVehicleMakes();	
		model.addAttribute("vehicleMakes", vehicleMakeList);                   
		
		List<VehicleType> vehicleTypeList = vehicleTypeService.getVehicleTypes();
		model.addAttribute("vehicleTypes", vehicleTypeList);
		
		List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatuses();
		model.addAttribute("vehicleStatuses", vehicleStatusList);
		
		List<VehicleModel> vehicleModelList = vehicleModelService.getVehicleModels();
		model.addAttribute("vehicleModels", vehicleModelList);
		
		List<Location> locationlList = locationService.getLocations();
		model.addAttribute("locations", locationlList);
		
		List<Employee> employeelList = employeeService.getEmployees();
		model.addAttribute("employees", employeelList);
		
		List<Vehicle> vehicleList = vehicleService.getVehicles();	
		model.addAttribute("vehicles", vehicleList);		            
		
		return "vehicle";                                              
		 
	}
	
	@PostMapping("/vehicles/addNew")
	public String addNew(Vehicle vehicle) {
	    vehicleService.save(vehicle);
	    return "redirect:/vehicles";
	}
	
	@RequestMapping("/vehicles/findById")
	@ResponseBody
	public Optional<Vehicle> findById(Integer id) {
		return vehicleService.findById(id);
	}
	
	@RequestMapping(value = "/vehicles/update", method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Vehicle vehicle) {
	    vehicleService.update(vehicle);
	    return "redirect:/vehicles";
	}
	
	
	@RequestMapping(value = "/vehicles/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
	    vehicleService.delete(id);
	    return "redirect:/vehicles";
	}
}
