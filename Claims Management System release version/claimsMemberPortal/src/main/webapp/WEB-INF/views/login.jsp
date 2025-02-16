<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Login Page</title>
  <link href="https://fonts.googleapis.com/css?family=Karla:400,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>

<style>
	body {
  font-family: "Karla", sans-serif;
  background-color: #d0d0ce;
  min-height: 100vh; }
.brand-wrapper {
  margin-bottom: 25px; }
.login-card {
  border: 0;
  border-radius: 27.5px;
  box-shadow: 0 10px 30px 0 rgba(172, 168, 168, 0.43);
  overflow: hidden; }
  .login-card-img {
    border-radius: 0;
    position: absolute;
    width: 100%;
    height: 100%;
    -o-object-fit: cover;
       object-fit: cover; }
  .login-card .card-body {
    padding: 85px 60px 60px; }
    @media (max-width: 422px) {
      .login-card .card-body {
        padding: 35px 24px; } }
  .login-card-description {
    font-size: 25px;
    color: #000;
    font-weight: normal;
    margin-bottom: 23px; }
  .login-card form {
    max-width: 326px; }
  .login-card .form-control {
    border: 1px solid #d5dae2;
    padding: 15px 25px;
    margin-bottom: 20px;
    min-height: 45px;
    font-size: 13px;
    line-height: 15;
    font-weight: normal; }
    .login-card .form-control::-webkit-input-placeholder {
      color: #919aa3; }
    .login-card .form-control::-moz-placeholder {
      color: #919aa3; }
    .login-card .form-control:-ms-input-placeholder {
      color: #919aa3; }
    .login-card .form-control::-ms-input-placeholder {
      color: #919aa3; }
    .login-card .form-control::placeholder {
      color: #919aa3; }
  .login-card .login-btn {
    padding: 13px 20px 12px;
    background-color: #000;
    border-radius: 4px;
    font-size: 17px;
    font-weight: bold;
    line-height: 20px;
    color: #fff;
    margin-bottom: 24px; }
    .login-card .login-btn:hover {
      border: 1px solid #000;
      background-color: transparent;
      color: #000; }
  .login-card .forgot-password-link {
    font-size: 14px;
    color: #919aa3;
    margin-bottom: 12px; }
  .login-card-footer-text {
    font-size: 16px;
    color: #0d2366;
    margin-bottom: 60px; }
    @media (max-width: 767px) {
      .login-card-footer-text {
        margin-bottom: 24px; } }
  .login-card-footer-nav a {
    font-size: 14px;
    color: #043efd; }
  #userid {
    margin-left: 58px;
  }
  #password{
    margin-left: 58px;
	
  }
  #upassword
  {
	  margin-left:59px;
  }
  #forget{
    margin-left: 240px;
  }
  #submit{
    margin-left: 200px;
    width: 100px;
  }
  
   #register{
    margin-left: 120px;
  }
  
  .display-4{
  		color:red;
		font-size:18px;
		font-family:"Karla", sans-serif;
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
/*# sourceMappingURL=login.css.map */
	
</style>
<body>
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
                <a class="nav-link" href="#"></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#"></a>
              </li>
    		<li class="nav-item">
      		<a class="nav-link" href="#"></a>
            </li>
  
              <li class="nav-item">
                <a class="nav-link" href="#"></a>
              </li>

				 <li class="nav-item">
                <a class="nav-link" href="#"></a>
              </li>
</ul>
            </div>
		</div>
		</nav>

  <main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
    <div class="container">
      <div class="card login-card">
        <div class="row no-gutters">
          <div class="col-md-5">
            <img src="https://i.ibb.co/dKKz8tk/login123.jpg" style="width: 100%; height: 100%;"> 
          </div>
          <div class="col-md-7">
            <div class="card-body">
              <div class="brand-wrapper">
                <h1 style="text-align: center;"><a class="navbar-brand" style="font-style: inherit; font-size: 2rem; color:#212529;"><b style="font-family:arial;font-weight: bold;">  <img src="https://i.ibb.co/mzRDTjk/logo1.png" style = "margin-right:20px;" width="70" height="70">Login here</b></a></h1>
              </div>   
              	<p align="center" class="display-4">${Message}</p>
              
                <form action="/generate" method="post">
               <div class="form-group" id="userid">
                      <input type="text" name="userid" id="userid" class="form-control" title=" UserId must contain uppercase, lowercase letters,digits & minimum of 3 characters" placeholder="Enter UserId" required/>
                  </div>
                  <div class="form-group" id="password">
                   <input type="password" name="upassword" id="upassword" class="form-control" title="must contain uppercase, lowercase letters ,digits & minimum of 8 characters" placeholder="Enter Password" required/>
                  </div>  
                  <input type="submit" class="btn btn-block login-btn mb-4" id="submit" value="Login">
                </form>
            </div>
          </div>
        </div>
      </div>
      </div>
  </main>
  <script>
  	function myfunction(){
  		alert("Invalid Credentials!");
  	}
  </script>
  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>