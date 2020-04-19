/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicleMovement, status){
			$('#idEdit').val(vehicleMovement.id);
			$('#remarksEdit').val(vehicleMovement.remarks);
			$('#ddlLocation1Edit').val(vehicleMovement.locationid1);
			$('#ddlLocation2Edit').val(vehicleMovement.locationid2);
			$('#ddlVehicleEdit').val(vehicleMovement.vehicleid);
			
			//Create a date variable and extract only the date part of the fiedl
			var date1 = vehicleMovement.date1.substr(0,10);
			var date2 = vehicleMovement.date2.substr(0,10);
			
			$('#date1Edit').val(date1);
			$('#date2Edit').val(date2);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicleMovement, status){
			$('#idDetails').val(vehicleMovement.id);
			$('#remarksDetails').val(vehicleMovement.remarks);
			$('#ddlLocation1Details').val(vehicleMovement.locationid1);
			$('#ddlLocation2Details').val(vehicleMovement.locationid2);
			$('#ddlVehicleDetails').val(vehicleMovement.vehicleid);
			
			//Create a date variable and extract only the date part of the fiedl
			var date1 = vehicleMovement.date1.substr(0,10);
			var date2 = vehicleMovement.date2.substr(0,10);
			
			$('#date1Details').val(date1);
			$('#date2Details').val(date2);
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