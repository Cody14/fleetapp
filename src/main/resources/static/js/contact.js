
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		event.preventDefault();
		
		//contacts/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(contact, status){
			$('#idEdit').val(contact.id);
			$('#firstnameEdit').val(contact.firstname);
			$('#phoneEdit').val(contact.phone);
			$('#emailEdit').val(contact.email);
			$('#remarksEdit').val(contact.remarks);
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
		
		//contacts/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(contact, status){
			$('#id1Edit').val(contact.id);
			$('#firstname1Edit').val(contact.firstname);
			$('#phone1Edit').val(contact.phone);
			$('#email1Edit').val(contact.email);
			$('#remarks1Edit').val(contact.remarks);
		});
		
		$('#detailsModal').modal();
	});
	
});