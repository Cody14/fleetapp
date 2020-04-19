
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//vehicleTypes/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleType, status){
			$('#idEdit').val(vehicleType.id);
			$('#descriptionEdit').val(vehicleType.description);
			$('#detailsEdit').val(vehicleType.details);
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
		
		//vehicleTypes/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleType, status){
			
			$('#id1Edit').val(vehicleType.id);
			$('#description1Edit').val(vehicleType.description);
			$('#city1Edit').val(vehicleType.city);
			$('#details1Edit').val(vehicleType.details);

			$('#createdBy1Edit').val(vehicleType.createdBy);
			$('#createdDate1Edit').val(vehicleType.createdDate.substr(0,10).replace("T", " "));
			$('#lastModifiedBy1Edit').val(vehicleType.lastModifiedBy);
			$('#lastModifiedDate1Edit').val(vehicleType.lastModifiedDate.substr(0,19).replace("T", " "));
			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});