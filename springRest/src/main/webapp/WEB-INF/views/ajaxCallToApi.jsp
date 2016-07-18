<html>
<head>
<script src="../assets/jquery.min.js"></script>
<script type="text/javascript">


$(document).ready(function(){
		$('#btnGetLawyer').click(function(){
			var resultElement= $('#resultLawyer');
			$.ajax({
				url : "http://localhost:8080/springRest/helloworld/appointmentService",
				type : "POST",
				contentType: "application/json; charset=utf-8",
				data : formToJSON(),
				dataType: 'json',
				success : function(data){
					if(data.message != null){
					//alert('one');
						resultElement.html('No Lawyers found in the area');
					}
					else{
					 //alert('two');
					resultElement.html('Lawyers '+data.name+'</br>'+ 'city '+data.address)
				    }
				},
				error: function(jqXHR, textStatus, errorThrown){
                  //alert('Lawyer error: ' + textStatus+errorThrown+jqXHR);
				}
				
			});
			
		});
	});
	function formToJSON() {
	 return JSON.stringify({
        "name": $('#lcity').val(),
        "address": $('#lcase').val()
        });
}

</script>
</head>
<body>

	<div id="resultLawyer">
					
			
			</div>
			
			
			
			
		<div class="typo">
		<div class="container">
			<h3 class="title">Search the product</h3>
			<div class="grid_3 grid_4">
				<h3 class="hdg">Headings</h3>
				<div class="bs-example">
					<table class="table">
						<tbody>
						<tr>
								<td><h1 id="h1.-bootstrap-heading">City<a class="anchorjs-link" href="#h1.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h1></td>
								<td><input type="text" id="lcity"></td>
							</tr>
							<tr>
								<td><h1 id="h1.-bootstrap-heading">Case Type<a class="anchorjs-link" href="#h1.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h1></td>
								<td><input type="text" id="lcase"></td>
							</tr>
							<tr>
								<td><input type="button" id="btnGetLawyer" value="Search Lawyer"><td>
							</tr>
		
						</tbody>
					</table>
				</div>
			</div>	
			
			
			
			</body>
			
			</html>
