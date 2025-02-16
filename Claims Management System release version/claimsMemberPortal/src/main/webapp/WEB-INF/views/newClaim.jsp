
<html>
    <head>
    
    <title>newClaim</title>
    
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
</head>
    <style>
        body {
  margin: auto;
  background: #eaeaea;  
  font-family: 'Open Sans', sans-serif;
  overflow-y:hidden;
}

.info p {
  text-align:center;
  color: #999;
  text-transform:none;
  font-weight:600;
  font-size:15px;
  margin-top:2px
}

.info i {
  color:#F6AA93;
}
form h1 {
  font-size: 18px;
  background: #0099CC none repeat scroll 0% 0%;
  color: rgb(255, 255, 255);
  padding: 22px 25px;
  border-radius: 5px 5px 0px 0px;
  margin: auto;
  text-shadow: none; 
  text-align:left
}

form {
  max-width: 700px;
  width:700%;
  margin: 4% auto;
  background-color: #FFFFFF;
  height: 83%;
  overflow: hidden;
  border: 0;
  border-radius: 27.5px;
  box-shadow: 0 10px 30px 0 rgba(172, 168, 168, 0.43);
  margin-top: 100px;
}

p span {
  color: #F00;
}

p {
  margin: 0px;
  font-weight: 500;
  /* text-align: center; */
  line-height: 2;
  color:#333;
}

h1 {
  text-align:center; 
  color: #666;
  text-shadow: 1px 1px 0px #FFF;
  margin:50px 0px 0px 0px
}

input {
  border-radius: 0px 5px 5px 0px;
  border: 1px solid rgb(193, 250, 160);
  margin-bottom: 15px;
  width: 75%;
  height: 40px;
  float: left;
  padding: 0px 15px;
}

a {
  text-decoration:inherit
}

textarea {
  border-radius: 0px 5px 5px 0px;
  border: 1px solid #EEE;
  margin: 0;
  width: 75%;
  height: 130px; 
  float: left;
  padding: 0px 15px;
}

.form-group {
  overflow: hidden;
  clear: both;
}

.icon-case {
  width: 35px;
  float: left;
  border-radius: 15px 0px 0px 5px;
  background:#eeeeee;
  height:41px;
  position: relative;
  text-align: center;
  line-height:40px;
}

i {
  color:#555;
  margin-top: 12px;
}

.contentform {
  padding: 40px 30px;
  
}

.bouton-contact{
  background-color: black;
  color: #FFF;
  font-weight:bold;
  text-align: center;
  width: 100%;
  border:0;
  padding: 17px 25px;
  border-radius: 0px 0px 5px 5px;
  cursor: pointer;
  margin-top: 22px;
  font-size: 18px;
}

.leftcontact {
  width:49.5%; 
  float:left;
  border-right: 1px dotted #CCC;
  box-sizing: border-box;
  padding: 0px 15px 0px 0px;
}

.rightcontact {
  width:49.5%;
  float:right;
  box-sizing: border-box;
  padding: 0px 30px 20px 15px;
}

.validation {
  display:none;
  margin: 0 0 10px;
  font-weight:400;
  font-size:13px;
  color: #DE5959;
}

#sendmessage {
  border:1px solid #fff;
  display:none;
  text-align:center;
  margin:10px 0;
  font-weight:600;
  margin-bottom:30px;
  background-color: #EBF6E0;
  color: #5F9025;
  border: 1px solid #B3DC82;
  padding: 13px 40px 13px 18px;
  border-radius: 3px;
  box-shadow: 0px 1px 1px 0px rgba(0, 0, 0, 0.03);
}

#sendmessage.show,.show  {
  display:block;
}

#hospital{
  padding-right: 10px;
  position: absolute;
  left: 530px;
}

#home{
  position: absolute;
  left: 950px;
  top: 85px;
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
<h3 align="center" class="display-4">${Message}</h3>
					<p align="center" class="text-muted mb-4"></p>
            
  <form action="/home/newClaim/submit"  method="POST">
    <h1><center>Claim Submission</center><a href="/home"></a></span></h1>
      
    <div class="contentform">

      <div class="leftcontact">
            <div class="form-group">
              <p>Policy ID</p>
              <span class="icon-case"><i class="fa fa-key"></i></span>
                <input type="text" name="policyId" id="policyId" required/>
                <div class="validation"></div>
       </div> 

            <div class="form-group">
            <p>Member ID  </p>
            <span class="icon-case"><i class="fa fa-user"></i></span>
            <input type="text" name="memberId" id="memberId" required/>
                <div class="validation"></div>
      </div>
      
      <div class="form-group">
      <p>Provider id </p>
      <span class="icon-case"><i class="fa fa-stream"></i></span>
        <input type="number" name=providerId id="providerId" required/>
                <div class="validation"></div>
      </div>
      
      <div class="form-group">
      <p>BenefitId </p>
      <span class="icon-case"><i class="fa fa-calendar-day"></i></span>
        <input type="number" name="benefitId" id="benefitId" required/>
                <div class="validation"></div>
      </div>
        
  </div>

  <div class="rightcontact">  

      <div class="form-group">
      <p>Claim Amount </p>
      <span class="icon-case"><i class="fa fa-money"></i></span>
        <input type="number" name="amountClaimed" id="amountClaimed" required/>
                <div class="validation"></div>
      </div>  

      <div class="form-group">
      <p>Total amount</p>  
      <span class="icon-case"><i class="fa fa-plus-square"></i></span>
        <input type="number" name="amountSettled" id="hospitalName" data-rule="maxlen:10" required/>
                <div class="validation"></div>
      </div>
   
 
  </div>
  <button type="submit" class="bouton-contact">Submit Claim</button>

  </div>

  
</form> 

  
</body>
</html>