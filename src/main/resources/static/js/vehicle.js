/**
 * 
 */

$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicle, status){
			$('#txtIdEdit').val(vehicle.id);
			$('#txtNameEdit').val(vehicle.name);
			var acquisitionDate = vehicle.acquisitionDate.substr(0,10);
			$('#txtAcquisitionDateEdit').val(acquisitionDate);
			$('#txtDescriptionEdit').val(vehicle.description);
			$('#ddlEmployeeEdit').val(vehicle.employeeid);
			$('#ddlLocationEdit').val(vehicle.locationid);
			$('#ddlVehicleMakeEdit').val(vehicle.vehiclemakeid);
			$('#txtNetWeigtEdit').val(vehicle.netWeight);	
			$('#txtFuelCapacityEdit').val(vehicle.fuelCapacity);			
			$('#txtPowerEdit').val(vehicle.power);	
			var registrationDate = vehicle.registrationDate.substr(0,10);
			$('#txtRegistrationDateEdit').val(registrationDate);
			$('#txtRemarksEdit').val(vehicle.remarks);			
			$('#ddlVehicleModelEdit').val(vehicle.vehiclemodelid);	
			$('#ddlVehicleStatusEdit').val(vehicle.vehiclestatusid);	
			$('#ddlVehicleTypeEdit').val(vehicle.vehicletypeid);			
			$('#txtVehicleNumberEdit').val(vehicle.vehicleNumber);	
		});			
		$('#editModal').modal();		
	});
	
	/**
	 * 
	 */

	$('document').ready(function() {
		
		$('.table #detailsButton').on('click',function(event){		
			event.preventDefault();		
			var href= $(this).attr('href');		
			$.get(href, function(vehicle, status){
				$('#txtIdDet1').val(vehicle.id);
				$('#txtNameDet1').val(vehicle.name);
				var acquisitionDate = vehicle.acquisitionDate.substr(0,10);
				$('#txtAcquisitionDateDet1').val(acquisitionDate);
				$('#txtDescriptionDet1').val(vehicle.description);
				$('#ddlEmployeeDet1').val(vehicle.employeeid);
				$('#ddlLocationDet1').val(vehicle.locationid);
				$('#ddlVehicleMakeDet1').val(vehicle.vehiclemakeid);
				$('#txtNetWeigtDet1').val(vehicle.netWeight);	
				$('#txtFuelCapacityDet1').val(vehicle.fuelCapacity);			
				$('#txtPowerDet1').val(vehicle.power);	
				var registrationDate = vehicle.registrationDate.substr(0,10);
				$('#txtRegistrationDateDet1').val(registrationDate);
				$('#txtRemarksDet1').val(vehicle.remarks);			
				$('#ddlVehicleModelDet1').val(vehicle.vehiclemodelid);	
				$('#ddlVehicleStatusDet1').val(vehicle.vehiclestatusid);	
				$('#ddlVehicleTypeDet1').val(vehicle.vehicletypeid);			
				$('#txtVehicleNumberDet1').val(vehicle.vehicleNumber);	
			});			
			$('#detailsModal').modal();		
		});
		

		
		$('.table #deleteButton').on('click',function(event) {
			event.preventDefault();
			var href = $(this).attr('href');
			$('#deleteModal #confirmDeleteButton').attr('href', href);
			$('#deleteModal').modal();		
		});	
	});
	
	$('.table #photoButton').on('click',function(event) {
		   event.preventDefault();
		   var href = $(this).attr('href');
		   $('#photoModal #vehiclePhoto').attr('src', href);
		   $('#photoModal').modal();		
	});
	
});