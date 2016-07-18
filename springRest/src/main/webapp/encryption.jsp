<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
    <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/aes.js"></script>
    <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/components/mode-ecb-min.js"></script>
    
    <script src="<c:url value="/resources/jquery.min.js" />"></script>
</head>
<body>


<div class="container">
<div class="main">
<h2>Javascript Login Validation</h2>
<form id="form_id" method="post" name="myform">
<label>User Name :</label>
<input type="text" name="username" id="username"/>
<label>Password :</label>
<input type="password" name="passwordstring" id="passwordstring"/>
<input type="button" value="Login" id="submit"/>
</form>
<span><b class="note">Note : </b>Use <br/><b class="valid">User Name : Hello<br/>Password : Bar12345Bar12345</b></span>
</div>
</div>


<div class="container">
	<h2> Login : </h2>
	<form>
    <p>Secret String is: <b id="secretstring">...</b></p>
    <p>Password is: <b id="passwordstring">...</b></p>
    <p>Encrypted String is: <b id="encryptedstring">...</b></p>
    <p>Decrypted String is: <b id="decryptedstring">...</b></p>
</div>


<script type="text/javascript">

var encryptedData;
var username;
var object1;
$(document).ready(function(){
	
		$('#submit').click(function(){
		
username = document.getElementById("username").value;
var passwordstring = document.getElementById("passwordstring").value;

var password = "Bar12345Bar12345"; // passcode



//start


    var key = CryptoJS.enc.Base64.parse(password);
    alert(key);
    var b6 = CryptoJS.enc.Base64.stringify(key);
    alert(b6);

 
    console.log( "plaintText = " + passwordstring );
    encryptedData = CryptoJS.AES.encrypt(passwordstring, password, {
        mode: CryptoJS.mode.ECB,
        padding: CryptoJS.pad.Pkcs7
    });
    console.log( "encryptedData = " + encryptedData );

    var decryptedData = CryptoJS.AES.decrypt( encryptedData, key, {
        mode: CryptoJS.mode.ECB,
        padding: CryptoJS.pad.Pkcs7
    } );
    var decryptedText = decryptedData.toString( CryptoJS.enc.Utf8 );
    console.log( "decryptedText = " + decryptedText );
 



//end


/*  encrypted = CryptoJS.AES.encrypt(passwordstring, password);
 object1 = encrypted.ciphertext.toString(CryptoJS.enc.Hex) */
document.getElementById("encryptedstring").innerHTML=encryptedData.toString();


/* var decrypted = CryptoJS.AES.decrypt(encrypted.toString(), password */
document.getElementById("decryptedstring").innerHTML=decryptedData.toString(CryptoJS.enc.Utf8);
		
		    
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
		
		console.log({
	        "name": username,
	        "address": encryptedData
	        });
		console.log(encryptedData.ciphertext.toString);
	 return JSON.stringify({
        "name": username,
        "address": encryptedData.toString()
        });
}

</script>

<script>
var attempt = 3; 

function validate(){
var username = document.getElementById("username").value;
var passwordstring = document.getElementById("passwordstring").value;

var password = "Bar12345Bar12345"; // passcode



var encrypted = CryptoJS.AES.encrypt(passwordstring, password);
document.getElementById("encryptedstring").innerHTML=encryptedData.toString();

var decrypted = CryptoJS.AES.decrypt(encrypted.toString(), password);
document.getElementById("decryptedstring").innerHTML=decrypted.toString(CryptoJS.enc.Utf8);


}

</script>

<div id="resultLawyer">
					
			
			</div>

</body>
</html>