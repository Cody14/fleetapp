
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//employeeTypes/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(employeeType, status){
			$('#idEdit').val(employeeType.id);
			$('#descriptionEdit').val(employeeType.description);
			$('#detailsEdit').val(employeeType.details);
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
		
		//employeeTypes/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(employeeType, status){
			
			$('#id1Edit').val(employeeType.id);
			$('#description1Edit').val(employeeType.description);
			$('#city1Edit').val(employeeType.city);
			$('#details1Edit').val(employeeType.details);

			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});