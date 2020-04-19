
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//vehicleMakes/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(invoiceStatus, status){
			$('#idEdit').val(invoiceStatus.id);
			$('#descriptionEdit').val(invoiceStatus.description);
			$('#detailsEdit').val(invoiceStatus.details);
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
		
		//invoiceStatuss/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(invoiceStatus, status){
			
			$('#id1Edit').val(invoiceStatus.id);
			$('#description1Edit').val(invoiceStatus.description);
			$('#city1Edit').val(invoiceStatus.city);
			$('#details1Edit').val(invoiceStatus.details);

			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});