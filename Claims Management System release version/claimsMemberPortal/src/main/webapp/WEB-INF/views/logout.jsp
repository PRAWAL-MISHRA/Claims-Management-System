<!DOCTYPE html>
<head>
<title>logout</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet" href="style/index-
style.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #989898
}
.button {
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
.button2 {
	background-color: #008CBA;
} /* Blue */
.container {
	display: flex;
	justify-content: center;
	align-items: center;
}

#login{
	position:absolute;
	left:1190px;
	top:20px;
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
</head>
<body>
<%response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    session.invalidate();
    %>

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
      		 <a class="nav-link" href="#"></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/home/billStatus"></a>
              </li>
               <li class="nav-item">
                <a class="nav-link" href="/home/login">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/home/claimStatus"></a>
              </li>
    		<li class="nav-item">
      		<a class="nav-link" href="/home/newClaim"></a>
            </li>
  
              <li class="nav-item">
                <a class="nav-link" href="#"></a>
              </li>

				 <li class="nav-item">
                <a class="nav-link" href="/home/logout"></a>
              </li>
</ul>
            </div>
		</div>
		</nav>
	<!-- Demo content-->
	<div class="container">


		<div class="col-lg-10 col-xl-7 mx-auto" style="margin-top:300px; color:#2C2C2C; background-color:#CCCCCC; padding:50px; border-radius:10px;">
			<center>
				<h3 class="display-5" >You have been Successfully Logged Out.</h3>
			</center>
		</div>

	</div>
	<!-- End -->





<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</body>
</html>