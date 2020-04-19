
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//vehicleMakes/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleMake, status){
			$('#idEdit').val(vehicleMake.id);
			$('#descriptionEdit').val(vehicleMake.description);
			$('#detailsEdit').val(vehicleMake.details);
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
		
		//vehicleMakes/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(vehicleMake, status){
			
			$('#id1Edit').val(vehicleMake.id);
			$('#description1Edit').val(vehicleMake.description);
			$('#city1Edit').val(vehicleMake.city);
			$('#details1Edit').val(vehicleMake.details);
         
			$('#createdBy1Edit').val(vehicleMake.createdBy);
			$('#createdDate1Edit').val(vehicleMake.createdDate.substr(0,10).replace("T", " "));
			$('#lastModifiedBy1Edit').val(vehicleMake.lastModifiedBy);
			$('#lastModifiedDate1Edit').val(vehicleMake.lastModifiedDate.substr(0,19).replace("T", " "));
			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});