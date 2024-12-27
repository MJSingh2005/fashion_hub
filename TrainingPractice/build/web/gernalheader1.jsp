<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

<style>
    #myNavbar ul li a{
        color: white;
        font-weight: bold;
        text-transform: uppercase;
    }
     #myNavbar ul li a:hover{
        text-decoration: underline;
    }
    h1{
        font-weight: bolder;
        font-family: sans-serif;
    }
    .fa{
        font-size: 20px;
        padding-left: 4%;
    }
    #a{
        
        font-family: cursive;
        background: lightcyan;
        border-radius: 2%;
    }
   
   
</style>



<!--code for navbar-->
<div class="col-sm-12" style="paddig:0px;">
<nav class="navbar navbar-inverse" style="background:maroon; border:white; border-radius:0px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
    </div>
      <div class="collapse navbar-collapse" id="myNavbar" >
          
    <ul class="nav navbar-nav">

                              <li><a href="home.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>
<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>  MEN
        <span class="caret"></span></a>
    <ul class="dropdown-menu" id='a' >
          <li><a href="menshirt.jsp" style="color:black;">Shirt</a></li>
          <li><a href="ment-shirt.jsp" style="color:black;">T-Shirt</a></li>
          <li><a href="menjeans.jsp" style="color:black;">Jeans</a></li>
          <li><a href="mentrouser.jsp" style="color:black;">Trouser</a></li>
          <li><a href="menjacket.jsp" style="color:black;">Jacket</a></li>
          <li><a href="mensweater.jsp" style="color:black;">Sweater</a></li>
          <li><a href="menshorts.jsp" style="color:black;">Shorts</a></li>
          <li><a href="menkurtapajama.jsp" style="color:black;">Kurta-Pajama</a></li>
          <li><a href="mencoatpant.jsp" style="color:black;">Coat-Pant</a></li>
          <li><a href="menblazer.jsp" style="color:black;">Blazer</a></li>
          <li><a href="menfootwear.jsp" style="color:black;">Men's Footwear</a></li>
        </ul>
      </li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>  WOMEN
        <span class="caret"></span></a>
        <ul class="dropdown-menu" id='a'>
           <li><a href="womensaaree.jsp" style="color:black;">Saree</a></li>
          <li><a href="womensalwarsuit.jsp" style="color:black;">Salwar-Suit</a></li>
          <li><a href="womenkurtaset.jsp" style="color:black;">Kurta-Set</a></li>
          <li><a href="womenlehenga.jsp" style="color:black;">Lehenga</a></li>
          <li><a href="womenjacket.jsp" style="color:black;">Jacket</a></li>
          <li><a href="womensweater.jsp" style="color:black;">Sweater</a></li>
          <li><a href="womenjeans.jsp" style="color:black;">Jeans</a></li>
          <li><a href="womentops.jsp" style="color:black;">Tops</a></li>
           <li><a href="womenbeauty.jsp" style="color:black;">Beauty</a></li>
          <li><a href="womennighty.jsp" style="color:black;">Night-Dress</a></li>
          <li><a href="womenfootwear.jsp" style="color:black;">Ladies's Footwear</a></li>
        </ul>
      </li>
         <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>  BOYS
        <span class="caret"></span></a>
        <ul class="dropdown-menu" id='a'>
           <li><a href="boysshirt.jsp" style="color:black;">Shirt</a></li>
          <li><a href="boystshirt.jsp" style="color:black;">T-Shirt</a></li>
          <li><a href="boysjeans.jsp" style="color:black;">Jeans</a></li>          
          <li><a href="boystrouser.jsp" style="color:black;">Trouser</a></li> 
          <li><a href="boysjacket.jsp" style="color:black;">Jacket</a></li>
          <li><a href="boyssweater.jsp" style="color:black;">Sweater</a></li>
          <li><a href="boysshorts.jsp" style="color:black;">Shorts</a></li>
          <li><a href="boyskurtapajama.jsp" style="color:black;">Kurta-Pajama</a></li>         
          <li><a href="boysfootwear.jsp" style="color:black;">Boy's Footwear</a></li>
        </ul>
      </li>
         <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>  GIRLS
        <span class="caret"></span></a>
        <ul class="dropdown-menu" id='a'>
           <li><a href="girlsfrok.jsp" style="color:black;">Frock</a></li>
          <li><a href="girlsjeans.jsp" style="color:black;">Jeans</a></li>
          <li><a href="girlstops.jsp" style="color:black;">Tops</a></li>
          <li><a href="girlshirt.jsp" style="color:black;">Shirt</a></li>
          <li><a href="girlstshirt.jsp" style="color:black;">T-Shirt</a></li>
          <li><a href="girlskurtiset.jsp" style="color:black;">Kurti-set</a></li>
          <li><a href="girlsjacket.jsp" style="color:black;">Jacket</a></li>
          <li><a href="girlssweater.jsp" style="color:black;">Sweater</a></li>
          <li><a href="girlsplazo.jsp" style="color:black;">Plazo</a></li>
          <li><a href="womenbeauty.jsp" style="color:black;">Beauty</a></li>
          <li><a href="girlssleepwear.jsp" style="color:black;">Sleepwear</a></li>
          <li><a href="womenfootwear.jsp" style="color:black;">Girl's Footwear</a></li>
        </ul>
      </li>
         <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>  KIDS
        <span class="caret"></span></a>
             <ul class="dropdown-menu" id="a">
         <li><a href="kidsjacket.jsp" style="color:black;">Jackets</a></li>                 
          <li><a href="kidstshirt.jsp" style="color:black;">T-Shirt</a></li>
          <li><a href="kidsshirt.jsp" style="color:black;">Shirt</a></li>
          <li><a href="kidssweater.jsp" style="color:black;">Sweater</a></li>
         
        </ul>
      </li>
    </ul>
       
         <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>  ACCOUNT 
        <span class="caret"></span></a>
        <ul class="dropdown-menu" id='a'>
          <li><a href="signup.jsp" style="color:black;"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
          <li><a href="login.jsp" style="color:black;"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
          
        </ul>
      </li>
    
    </ul>
        <form class="navbar-form navbar-right" action="/action_page.php">
  <div class="input-group">
    <input type="text" class="form-control" placeholder="Search">
    <div class="input-group-btn">
      <button class="btn btn-default" type="submit" >
        <i class="glyphicon glyphicon-search"></i>
      </button>
    </div>
  </div>
</form>

        
      </div>
      
      </div>
</nav>
   
    
</div>
<!--end code for navbar-->