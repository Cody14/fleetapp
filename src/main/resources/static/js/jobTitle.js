
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//jobTitles/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(jobTitle, status){
			$('#idEdit').val(jobTitle.id);
			$('#descriptionEdit').val(jobTitle.description);
			$('#detailsEdit').val(jobTitle.details);
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
		
		//jobTitles/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(jobTitle, status){
			
			$('#id1Edit').val(jobTitle.id);
			$('#description1Edit').val(jobTitle.description);
			$('#city1Edit').val(jobTitle.city);
			$('#details1Edit').val(jobTitle.details);

			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});