<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/font-awesome.min.css" rel="stylesheet">
<script src="../js/jquery.js"></script>
<script src="../js/bootstrap.min.js"></script>

<style>
    #myNavbar ul li a 
    {
        color: white;
        
    }
</style>



<!--code for navbar -->
<div class="col-sm-12" style="paddig:0px;">
<nav class="navbar navbar-inverse" style="background: forestgreen; border-radius:0px">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="userdashboard.jsp">Dashboard</a></li>
        <li><a href="myprofile.jsp">My Profile</a></li>
        <li><a href="feedback.jsp">Feedback</a></li>
        <li><a href="complain.jsp">Complain</a></li>
        <li><a href="notification.jsp">View Notification</a></li>
        <li><a href="changepassword.jsp">Change Password</a></li>    
        <li><a href="logout.jsp">Logout</a></li>
      </ul>
      
    </div>
  </div>
</nav>

</div>
<!--end code for navbar-->