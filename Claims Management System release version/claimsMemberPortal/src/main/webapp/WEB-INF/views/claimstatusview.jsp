<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Claim Status Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>   
<link href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,400i,700,900&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,400i,700,900&display=swap" rel="stylesheet">
  	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Karla:400,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head>  
<style>
.background {
  position: fixed;
  z-index: -1;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  object-fit: cover;
  height: 100%;
  width: 100%;
}


.form-card {
  border-radius: 12px;
  background: #fff;
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.12), 0 1px 2px rgba(0, 0, 0, 0.24);
  transition: all 0.56s cubic-bezier(0.25, 0.8, 0.25, 1);
  max-width: 500px;
  padding: 20px;
  margin: 50px auto;
}

.form-card:hover,
.form-card:focus {
  box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);
}

.form-card:focus-within {
  box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);
}

.form-actions {
  position: relative;
  display: -ms-flexbox;
  display: flex;
  margin-top: 2.25rem;
}

.form-actions .form-btn-cancel {
  -ms-flex-order: -1;
  order: -1;
}

.form-actions::before {
  content: "";
  position: absolute;
  width: 100%;
  height: 1px;
  background: #999;
  opacity: 0.3;
}

.form-actions > * {
  -ms-flex: 1;
  flex: 1;
  margin-top: 0;
}

.form-fieldset {
  padding: 10px;
  border: 0;
}

.form-fieldset + .form-fieldset {
  margin-top: 15px;
}

.form-legend {
  padding: 1em 0 0;
  margin: 0 0 -0.5em;
  font-size: 1.5rem;
  text-align: center;
}

.form-legend {
  position: absolute;
  top: 125px;
  left: 0px;
  font-size:1.9rem;
}
.home-icon{
  top:10px;
  color:red;
  padding-left:900px;
  position:absolute;
    
  }
  
  .brand-wrapper {
  margin-bottom: 25px; 
  position: absolute;
  left: 525px;
  top: 20px;
  }
  p{
  text-align: center;
  
  }
  
  table{
  	border: 1.5px solid black;
  	border-collapse: collapse;
  	margin-left: auto;
  	margin-right: auto;	
	
  }
  
  th,td{
    padding:5px; 
  	text-align: left;
  	padding-top:10px;
  	border: 1.5px solid black;
  	border-collapse: collapse;
  }

body {
  margin: 40px auto;
  background-image: linear-gradient(to top, #a3bded 0%, #6991c7 100%);
  overflow-y:hidden;
}
#date
{
	font-size:0.9rem;
}
.nav-item{
			   
			letter-spacing: 0.01em;
			line-height: 50px;
			
		}
		.nav-item a
		{
			color:#333333!important;
			font-weight:bold;
		}
		.nav-item a:hover
		{
			color:red!important;
			
		}
		.welcome h5 b
		{
			font-size:30px;
			font-weight:bold;
		}
		.navbar img
		{
			width:60px;
			margin-left:50px;
		}
		
</style>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<!-- Taken from https://codepen.io/jonnitto/project/editor/XRPjxx -->
<nav class="navbar navbar-expand-sm navbar-expand-md navbar-expand-lg bg-white navbar-light" style = "box-shadow: 2px 2px 10px black; position:fixed; top : 0; z-index:10; width:100%;">
        <img src="https://i.ibb.co/mzRDTjk/logo1.png" width="60" height="60" >
		<h2><a class="navbar-brand"></a></h2>
		
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
   		 <span class="navbar-toggler-icon"></span>
		 </button>
		
		    <div class="welcome">
                 <h5 style="padding-top: 7px;font-size: 130%; padding-left:50px"><b>CLAIM MANAGEMENT SYSTEM</b></h5>
            </div>
		
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
            <div class="container">
            <ul class="navbar-nav ml-auto ">
   		 <li class="nav nav-item ">		
      		 <a class="nav-link" href="/home">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/home/billStatus">Bill Status</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/home/claimStatus">Claim Status</a>
              </li>
    		<li class="nav-item">
      		<a class="nav-link" href="/home/newClaim">New Claim</a>
            </li>
  
              <li class="nav-item">
                <a class="nav-link" href="/home/aboutUs">About Us</a>
              </li>

				 <li class="nav-item">
                <a class="nav-link" href="/home/logout">Log Out</a>
              </li>
</ul>
            </div>
		</div>
		</nav>
<video width="1280" height="720" class="background" autoplay muted loop>
  <source src="https://codepen.jonnitto.ch/BackgroundVideo.mp4" type="video/mp4">
</video>

<form class="form-card">
    	<div class="brand-wrapper">
                
        </div>
    <fieldset class="form-fieldset">
        <legend class="form-legend"><b>Your Claim Status Summary</b></legend><br><br><br>
      
        <table>
        <tr><p id="date">Date&Time :<script>
const d = new Date();
document.getElementById("date").innerHTML = d;
</script> </p></tr>
        <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Claim Id :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">${ claims.claimId }<br><br></td>
        </tr>
        <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Policy Id :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">${ claims.policyId }<br><br></td>
        </tr>
        <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Member Id :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">${ claims.memberId }<br><br></td>
        </tr>
        <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Claim Status :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">${claims.claimStatus }<br><br></td>
        </tr>
      
        <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Claimed Amount :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">Rs. ${ claims.amountClaimed }<br><br></td>
        </tr>
         <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Settled Amount :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">Rs. ${ claims.amountSettled }<br><br></td>
        </tr>
        <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Claimed Benefit :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">${ claims.benefitId }<br><br></td>
        </tr>
            <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Claimed Description :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">${ claims.description }<br><br></td>
        </tr>
            <%-- <tr>
        	<td style="color:#007399; font-size:15px; font-weight:bold;">Remarks :<br><br></td>
        	<td style="color:#ff0080; font-size:13px; font-weight:bold;">${ claims.remarks }<br><br></td>
        </tr> --%>
        </table>
    </fieldset>    
   
</form>
  
</body>
</html>