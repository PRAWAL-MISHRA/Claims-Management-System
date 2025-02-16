
<!DOCTYPE html>
<html>
<head>
<title>About Us</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
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
		.welcome
		{
			font-size:20px;
		}
		.navbar img
		{
			width:60px;
			margin-left:50px;
		}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
  padding:20px;
  background:#0099CC!important;
}

.about-section {
  padding: 50px;
  text-align: center;
  background-color: #474e5d;
  color: white;
  padding-top:140px;
  padding-bottom:40px;
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}
.home-icon{
color:black;
padding-left:1150px;
}
.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: #555;
}
.team
{
	padding-top:20px;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}
</style>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-expand-md navbar-expand-lg bg-white navbar-light" style = "box-shadow: 2px 2px 10px black; position:fixed; z-index:10; width:100%;">
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
<div class="about-section">
   
  <h1>About Us</h1>
  <p>MyClaims Insurance is a specialized health insurer offering products in the retail segment for Health Insurance, Top-up Coverage, Personal Accident, Maternity, International Travel Insurance and Critical Illness along with Group Health Insurance and Group Personal Accident Insurance for Corporates, Micro Insurance Products for the Rural Market and a Comprehensive Set of Wellness Services. With its operating philosophy being based on the principal tenet of consumer-centricity, the company has consistently invested in the effective application of technology to deliver excellence in customer servicing, product innovation and value-for-money services.</p>
  <p>MyClaims Insurance has been adjudged the as the Best Health Insurance Company once at the ABP News-BFSI Awards 2021 and again at the Emerging Asia Insurance Awards, 2021 & Best Claims Service Provider of the Year and Insurance India Summit & Awards 2021. MyClaims Insurance has also received the Editors Choice Award for Best Product Innovation at Finnoviti in 2021 and was conferred the Best Medical/Health Insurance Product Award at the FICCI Healthcare Excellence Awards in 2021, 2020 and 2019.</p>
</div>

<h2 class = "team" style="text-align:center;color:#424242;" >Our Team</h2>\
<div class = "container-fluid">
<div class="row">

  <div class="col-md-3">
    <div class="card">
      <div class="container">
        <h2>Prawal</h2>
        <p class="title" style="color:#EEEEEE; font-weight:900;">Team Lead</p>
        <p style="color:white;"> "I need to create the end of patients needing to see us..."</p>
        <p style="color:white; font-weight:bold; " >Email - prawal@gmail.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
  
    <div class="col-md-3">
    <div class="card">
      <div class="container">
        <h2>Sagar</h2>
        <p class="title" style="color:#EEEEEE; font-weight:900;">Team Member</p>
        <p style="color:white;">"The state of our nation is only as state of our health and state of our well being..."</p>
        <p style="color:white; font-weight:bold; " >Email - sagar@gmail.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
  
  <div class="col-md-3">
    <div class="card">
      <div class="container">
        <h2>Ananya</h2>
        <p class="title" style="color:#EEEEEE; font-weight:900;">Team Member</p>
        <p style="color:white;">"Reducing health care costs for families requires competition in health insurance..."</p>
        <p style="color:white; font-weight:bold; " >Email - ananya@gmail.com </p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
  
  <div class="col-md-3">
    <div class="card">
      <div class="container">
        <h2>Payal</h2>
        <p class="title" style="color:#EEEEEE; font-weight:900;">Team Member</p>
        <p style="color:white;"> "The roots below the earth claim no rewards for making the branches fruitful."</p>
        <p style="color:white; font-weight:bold;">Email - payal@gmail.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
  
</div>
</div>
</body>
</html>
