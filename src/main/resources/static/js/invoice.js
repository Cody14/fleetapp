
$('document').ready(function(){
	
	$('.table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		//invoices/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(invoice, status){
			$('#idEdit').val(invoice.id);
			$('#ddlClientEdit').val(invoice.clientid);
			var invoiceDate = invoice.invoiceDate.substr(0,10);
			$('#invoiceDateEdit').val(invoiceDate);
			$('#ddlInvoiceStatusEdit').val(invoice.invoicestatusid);
			$('#remarksEdit').val(invoice.remarks);
			
			
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
		
		//invoices/findById/?id=1
		
		var href = $(this).attr('href')
		
		$.get(href,function(invoice, status){
			$('#id1Edit').val(invoice.id);
			$('#ddlClient1Edit').val(invoice.clientid);
			var invoiceDate = invoice.invoiceDate.substr(0,10);
			$('#invoiceDate1Edit').val(invoiceDate);
			$('#ddlInvoiceStatus1Edit').val(invoice.invoicestatusid);
			$('#remarks1Edit').val(invoice.remarks);
			
			
		});
		
		$('#detailsModal').modal();
	});
	
	
	
});