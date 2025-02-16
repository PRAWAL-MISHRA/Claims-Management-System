<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Home</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <style>
		body
		{
			overflow-x:hidden;
		}
		.material-icons {
		vertical-align: middle;
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
		.content
		{
			width:100%;
			text-align:center;
			color:white;
			font-size:18px;
			padding-top:7px;
		}
		.iconsize
		{
			width:100px;
		}
		
</style> 
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
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
        
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>


            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="d-block w-100"src="https://i.ibb.co/9p1VNRw/slider2.jpg" alt="First slide">
                <div class="carousel-caption d-none d-md-block">
                    <h2  style="padding-top: 2rem;font-size: 300%; color:black;"><b>Getting insurance is your responsibility to YOUR family and loved ones.You may hate it but it's your responsibility.</b></h2>
                </div>   
            </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="https://i.ibb.co/dpBS484/slider1.jpg" alt="Second slide">
                <div class="carousel-caption d-none d-md-block"> <h2  style="font-size: 400%; color:black; "><b> A healthy outside starts from the inside.</b></h2>     
                </div>  
            </div>
              <div class="carousel-item">
                 <img class="d-block w-100" src="https://i.ibb.co/887ym63/slider3.jpg" alt="Third slide"> 
				 <div class="carousel-caption d-none d-md-block"> <h2  style="font-size: 400%; color:black; "><b> A healthy outside starts from the inside.</b></h2>     
                </div> 
            </div>
            </div>

            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>

 
          <div class="container-fluid">

            <div class="row">
                <!--<div class="col-12 col-sm-12 col-md-12 col-lg-12"></div> <p style="padding-left:400px; font-weight: bold;font-size: 25px;"> MyClaims Health Insurance Agency, Inc.</p>-->
                 
                  <div class="icon" style="padding-left: 750px; padding-top: 30px; padding-bottom: 30px;"><a href="https://www.facebook.com/"><i class="material-icons" class="iconsize icon-size">facebook</i></a>
                    <a href="https://accounts.google.com/"><i class="material-icons" class="iconsize icon-size">mail</i></a>
                    <a href="#"><i class="material-icons" class="iconsize icon-size">phone</i></a>
                    
                    </div>
                </div>

            <div class="row">
                    
                    <div class="content" style="background-color:#0099cc;"><p>©2021 by Claim Management System Agency, Inc.</p>
                                         
            </div>
            </div>
		
		<!--<div class="container-fluid">
		<div class="row">
				
				<div class="col-12 col-sm-12 col-md-7 col-lg-8" style="background-color:#d1e0e0;"><h3>Benifits</h3>

				<div class="col-12 col-sm-12 col-md-5 col-lg-4" style="background-color:#ccb3ff;"><h3>Login</h3></div>
										
		</div>
		</div>-->
		
        

	</body>
</html>