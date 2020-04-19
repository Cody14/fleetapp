
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//locations/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(location, status){
			$('#idEdit').val(location.id);
			$('#descriptionEdit').val(location.description);
			$('#cityEdit').val(location.city);
			$('#addressEdit').val(location.address);
			$('#detailsEdit').val(location.details);
			$('#ddlCountryEdit').val(location.countryid);
			$('#ddlStateEdit').val(location.stateid);
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
		
		//locations/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(location, status){
			
			$('#id1Edit').val(location.id);
			$('#description1Edit').val(location.description);
			$('#city1Edit').val(location.city);
			$('#address1Edit').val(location.address);
			$('#details1Edit').val(location.details);
			$('#ddlCountry1Edit').val(location.countryid);
			$('#ddlState1Edit').val(location.stateid);
			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});