// function validateEmail(elementValue){      
//    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
//    return emailPattern.test(elementValue); 
//  }

// $(document).ready(function(){
// 	$("#submit").click(checkempty);
// });

// function checkempty(){
// 	var enteredEmail=$("#input-email").val();
// 	var enteredPassword=$("#input-password").val();
// 	if (enteredEmail==""||enteredPassword==""){
// 		alert("User name and password cannot be empty");
// 		return(true);
// 	}	
// }

$(function(){
	$("#fname_error_message").hide();
    $("#lname_error_message").hide();
    $("#email_error_message").hide();
    $("#password_error_message").hide();
    $("#rpassword_error_message").hide();

    

	var error_fname=false;
	var error_lname=false;
	var error_email=false;
	var error_password=false;
	var error_rpassword=false;
	$("#fname").focusout(function(){
		check_fname();
	});
	$("#lname").focusout(function(){
		check_lname();
	});
	$("#email").focusout(function(){
		check_email();
	});
	$("#password").focusout(function(){
		check_password();
	});
	$("#rpassword").focusout(function(){
		check_rpassword();
	});
	function check_fname() {
    	var pattern = /^[a-zA-Z]*$/;
    	var fname = $("#fname").val();
        if (pattern.test(fname) && fname !== '') {
           $("#fname_error_message").hide();
           $("#fname").css("border-bottom","2px solid #34F458");
        } else {
           $("#fname_error_message").html("Should contain only Characters");
           $("#fname_error_message").show();
           $("#fname").css("border-bottom","2px solid #F90A0A");
       		   error_fname = true;
         }
    }
    function check_lname(){
    	var pattern = /^[a-zA-Z]*$/;
    	var lname= $("#lname").val();
    	if (pattern.test(lname) && lname !== ''){
    		$("#lname_error_message").hide();
    		$("#lname").css("border-bottom","2px solid #34F458");
    	} else {
    		$("#lname_error_message").html("Should contain only Characters");
    		$("#lname_error_message").show();
    		$("#lname").css("border-bottom","2px solid #F90A0A");
       		   error_lname = true;
    	}
    }
    function check_email(){
    	var pattern = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
    	var email=$("#email").val();
    	if(pattern.test(email) && email !==''){
    		$("#email_error_message").hide();
    		$("#email").css("border-bottom","2px solid #34F458")
		} else {
			$("#email_error_message").html("Invalid Email");
			$("#email_error_message").show();
			$("#email").css("border-bottom","2px solid #F90A0A");
		}
    }
    function check_password() {
            var password_length = $("#password").val().length;
            if (password_length < 8) {
               $("#password_error_message").html("Atleast 8 Characters");
               $("#password_error_message").show();
               $("#password").css("border-bottom","2px solid #F90A0A");
               error_password = true;
            } else {
               $("#password_error_message").hide();
               $("#password").css("border-bottom","2px solid #34F458");
            }
         }
    function check_rpassword(){
    	var password=$("#password").val();
    	var rpassword=$("#rpassword").val();
    	if(password !== rpassword){
    		$("#rpassword_error_message").html("Password Did not Matched");
    		$("#rpassword_error_message").show();
    		$("#rpassword").css("border-bottom","2px solid #F90A0A");
               error_rpassword = true;
    	} else {
    		$("#rpassword_error_message").hide();
               $("#rpassword").css("border-bottom","2px solid #34F458");
    	}
    }

    $("#signup").submit(function() {
            error_fname = false;
            error_lname = false;
            error_email = false;
            error_password = false;
            error_retype_password = false;

            check_fname();
            check_lname();
            check_email();
            check_password();
            check_rpassword();

            if (error_fname === false && error_lname === false && error_email === false && error_password === false && error_rpassword === false) {
               alert("Registration Successfull");
               return true;
              
            } else {
               alert("Please Fill the form Correctly");
               return false;
            }

         });
});