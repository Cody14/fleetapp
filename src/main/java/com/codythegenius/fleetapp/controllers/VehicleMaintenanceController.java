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

import com.codythegenius.fleetapp.models.Vehicle;
import com.codythegenius.fleetapp.models.VehicleMaintenance;
import com.codythegenius.fleetapp.models.Supplier;
import com.codythegenius.fleetapp.services.VehicleMaintenanceService;
import com.codythegenius.fleetapp.services.VehicleService;
import com.codythegenius.fleetapp.services.SupplierService;

@Controller
public class VehicleMaintenanceController {

	@Autowired
	private SupplierService supplierService;
	@Autowired	
	private VehicleService vehicleService;
	@Autowired	
	private VehicleMaintenanceService vehicleMaintenanceService;
	
	@GetMapping("/vehicleMaintenances")
	public String getVehicleMaintenances(Model model) {
		
		List<Vehicle> vehicleList = vehicleService.getVehicles();	
		model.addAttribute("vehicles", vehicleList);                   
		
		List<Supplier> supplierList = supplierService.getSuppliers();
		model.addAttribute("suppliers", supplierList);                       
		
		List<VehicleMaintenance> vehicleMaintenanceList = vehicleMaintenanceService.getVehicleMaintenances(); 	
		model.addAttribute("vehicleMaintenances", vehicleMaintenanceList);		            
		
		return "vehicleMaintenance";                                              
		 
	}
	
	@PostMapping("/vehicleMaintenances/addNew")
	public String addNew(VehicleMaintenance vehicleMaintenance) {
	    vehicleMaintenanceService.save(vehicleMaintenance);
	    return "redirect:/vehicleMaintenances";
	}
	
	@RequestMapping("/vehicleMaintenances/findById")
	@ResponseBody
	public Optional<VehicleMaintenance> findById(Integer id) {
		return vehicleMaintenanceService.findById(id);
	}
	
	@RequestMapping(value = "/vehicleMaintenances/update", method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleMaintenance vehicleMaintenance) {
	    vehicleMaintenanceService.update(vehicleMaintenance);
	    return "redirect:/vehicleMaintenances";
	}
	
	
	@RequestMapping(value = "/vehicleMaintenances/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
	    vehicleMaintenanceService.delete(id);
	    return "redirect:/vehicleMaintenances";
	}
}
