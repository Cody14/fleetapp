/**
 * 
 */

$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(supplier, status){
			$('#txtAddressEdit').val(supplier.address);
			$('#txtCityEdit').val(supplier.city);
			$('#ddlCountryEdit').val(supplier.countryid);
			$('#txtDetailsEdit').val(supplier.details);
			$('#txtEmailEdit').val(supplier.email);
			$('#txtIdEdit').val(supplier.id);
			$('#txtMobileEdit').val(supplier.mobile);
			$('#txtNameEdit').val(supplier.name);	
			$('#txtPhoneEdit').val(supplier.phone);			
			$('#ddlStateEdit').val(supplier.stateid);	
			$('#txtWebsiteEdit').val(supplier.website);
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
			$.get(href, function(supplier, status){
				$('#txtAddress1Edit').val(supplier.address);
				$('#txtCity1Edit').val(supplier.city);
				$('#ddlCountry1Edit').val(supplier.countryid);
				$('#txtDetails1Edit').val(supplier.details);
				$('#txtEmail1Edit').val(supplier.email);
				$('#txtId1Edit').val(supplier.id);
				$('#txtMobile1Edit').val(supplier.mobile);
				$('#txtName1Edit').val(supplier.name);	
				$('#txtPhone1Edit').val(supplier.phone);			
				$('#ddlState1Edit').val(supplier.stateid);	
				$('#txtWebsite1Edit').val(supplier.website);
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