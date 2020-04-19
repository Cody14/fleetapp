/**
 * 
 */

$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		
		event.preventDefault();	
		
		var href= $(this).attr('href');		
		$.get(href, function(employee, status){
			$('#txtAddressEdit').val(employee.address);
			$('#txtCityEdit').val(employee.city);
			$('#ddlNationalityEdit').val(employee.countryid);			
			var dob = employee.dateOfBirth.substr(0,10);
			$('#txtDateOfBirthEdit').val(dob);
			$('#txtEmailEdit').val(employee.email);
			$('#txtFirstnameEdit').val(employee.firstname);
			$('#ddlGenderEdit').val(employee.gender);
			$('#txtIdEdit').val(employee.id);
			$('#txtInitialsEdit').val(employee.initials);
			$('#txtLastnameEdit').val(employee.lastname);
			$('#ddlMaritalStatusEdit').val(employee.maritalStatus);
			$('#txtMobileEdit').val(employee.mobile);
			$('#txtOthernameEdit').val(employee.othername);		
			$('#txtPhoneEdit').val(employee.phone);			
			$('#fupPhotoEdit').val(employee.photo);			
			$('#txtSSNEdit').val(employee.socialSecurityNumber);			
			$('#ddlStateEdit').val(employee.stateid);	
			$('#titleEdit').val(employee.title);			
			$('#ddlEmployeeTypeEdit').val(employee.employeetypeid);				
			var hireDate = employee.hireDate.substr(0,10);
			$('#txtHireDateEdit').val(hireDate);
			$('#ddlJobTitleEdit').val(employee.jobtitleid);			
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(employee, status){
			$('#txtAddressDet1').val(employee.address);
			$('#txtCityDet1').val(employee.city);
			$('#ddlNationalityDet1').val(employee.countryid);			
			var dob = employee.dateOfBirth.substr(0,10);
			$('#txtDateOfBirthDet1').val(dob);
			$('#txtEmailDet1').val(employee.email);
			$('#txtFirstnameDet1').val(employee.firstname);
			$('#ddlGenderDet1').val(employee.gender);
			$('#txtIdDet1').val(employee.id);
			$('#txtInitialsDet1').val(employee.initials);
			$('#txtLastnameDet1').val(employee.lastname);
			$('#ddlMaritalStatusDet1').val(employee.maritalStatus);
			$('#txtMobileDet1').val(employee.mobile);
			$('#txtOthernameDet1').val(employee.othername);		
			$('#txtPhoneDet1').val(employee.phone);			
			$('#fupPhotoDet1').val(employee.photo);			
			$('#txtSSNDet1').val(employee.socialSecurityNumber);			
			$('#ddlStateDet1').val(employee.stateid);	
			$('#ddlTitleDet1').val(employee.title);			
			$('#ddlEmployeeTypeDet1').val(employee.employeetypeid);				
			var hireDate = employee.hireDate.substr(0,10);
			$('#txtHireDateDet1').val(hireDate);
			$('#ddlJobTitleDet1').val(employee.jobtitleid);		
			$('#lastModifiedByDetails').val(employee.lastModifiedBy);
			$('#lastModifiedDateDetails').val(employee.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #confirmDelete').attr('href', href);
		$('#deleteModal').modal();		
	});	
	
	$('.table #photoButton').on('click',function(event) {
		   event.preventDefault();
		   var href = $(this).attr('href');
		   $('#photoModal #employeePhoto').attr('src', href);
		   $('#photoModal').modal();		
	});
	
});



