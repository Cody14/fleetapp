/**
 * 
 */

$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(client, status){
			$('#txtAddressEdit').val(client.address);
			$('#txtCityEdit').val(client.city);
			$('#ddlCountryEdit').val(client.countryid);
			$('#txtDetailsEdit').val(client.details);
			$('#txtEmailEdit').val(client.email);
			$('#txtIdEdit').val(client.id);
			$('#txtMobileEdit').val(client.mobile);
			$('#txtNameEdit').val(client.name);	
			$('#txtPhoneEdit').val(client.phone);			
			$('#ddlStateEdit').val(client.stateid);	
			$('#txtWebsiteEdit').val(client.website);
		});			
		$('#editModal').modal();		
	});
	
	/**
	 * 
	 */

	$('document').ready(function() {
		
		$('.table #detailsButton').on('click',function(event){		
			event.preventDefault();		
			var href= $(this).attr('href');		
			$.get(href, function(client, status){
				$('#txtAddress1Edit').val(client.address);
				$('#txtCity1Edit').val(client.city);
				$('#ddlCountry1Edit').val(client.countryid);
				$('#txtDetails1Edit').val(client.details);
				$('#txtEmail1Edit').val(client.email);
				$('#txtId1Edit').val(client.id);
				$('#txtMobile1Edit').val(client.mobile);
				$('#txtName1Edit').val(client.name);	
				$('#txtPhone1Edit').val(client.phone);			
				$('#ddlState1Edit').val(client.stateid);	
				$('#txtWebsite1Edit').val(client.website);
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
	

});