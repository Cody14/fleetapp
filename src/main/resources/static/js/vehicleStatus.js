
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//vehicleStatuss/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleStatus, status){
			$('#idEdit').val(vehicleStatus.id);
			$('#descriptionEdit').val(vehicleStatus.description);
			$('#detailsEdit').val(vehicleStatus.details);
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
		
		//vehicleStatuss/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleStatus, status){
			
			$('#id1Edit').val(vehicleStatus.id);
			$('#description1Edit').val(vehicleStatus.description);
			$('#city1Edit').val(vehicleStatus.city);
			$('#details1Edit').val(vehicleStatus.details);

			$('#createdBy1Edit').val(vehicleStatus.createdBy);
			$('#createdDate1Edit').val(vehicleStatus.createdDate.substr(0,10).replace("T", " "));
			$('#lastModifiedBy1Edit').val(vehicleStatus.lastModifiedBy);
			$('#lastModifiedDate1Edit').val(vehicleStatus.lastModifiedDate.substr(0,19).replace("T", " "));
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});