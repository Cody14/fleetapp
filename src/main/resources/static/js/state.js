
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		event.preventDefault();
		
		//countries/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(state, status){
			$('#idEdit').val(state.id);
			$('#nameEdit').val(state.name);
			$('#capitalEdit').val(state.capital);
			$('#codeEdit').val(state.code);
			$('#detailstEdit').val(state.details);
			$('#ddlCountryEdit').val(state.countryid);
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
		
		//states/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(state, status){
			
			$('#id1Edit').val(state.id);
			$('#name1Edit').val(state.name);
			$('#capital1Edit').val(state.capital);
			$('#code1Edit').val(state.code);
			$('#details1tEdit').val(state.details);
			$('#ddlCountry1Edit').val(state.countryid);
			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});