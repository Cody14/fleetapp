
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//vehicleModels/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleModel, status){
			$('#idEdit').val(vehicleModel.id);
			$('#descriptionEdit').val(vehicleModel.description);
			$('#detailsEdit').val(vehicleModel.details);
		});
		
		$('#editModal').modal();
	});
	
	
	$('.table #deleteButton').on('click',function(event){
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
	   $('#deleteModal').modal();
	});
	
	

	$('.table #detailsButton').on('click',function(event){
		event.preventDefault();
		
		//vehicleModels/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleModel, status){
			
			$('#id1Edit').val(vehicleModel.id);
			$('#description1Edit').val(vehicleModel.description);
			$('#city1Edit').val(vehicleModel.city);
			$('#details1Edit').val(vehicleModel.details);
			
			$('#createdBy1Edit').val(vehicleModel.createdBy);
			$('#createdDate1Edit').val(vehicleModel.createdDate.substr(0,10).replace("T", " "));
			$('#lastModifiedBy1Edit').val(vehicleModel.lastModifiedBy);
			$('#lastModifiedDate1Edit').val(vehicleModel.lastModifiedDate.substr(0,19).replace("T", " "));

			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});