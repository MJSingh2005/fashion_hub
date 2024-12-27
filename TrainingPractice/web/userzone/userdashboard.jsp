<%-- 
    Document   : userdashboard
    Created on : Sep 9, 2023, 2:46:42 AM
    Author     : Ayush Varshney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .a{
                height:500px;
                width:100%;
                float:left;
                
            }
             
        </style>
    </head>
    <body>
        <%@include file="userheader.jsp" %>
    
        <div class="a">
            <div style="height: 500px;width:10%;float: left"></div>
            <div class="b" style="height:500px;width: 80%;float: left">
                <div style="height:248px;width:100%;">
                    <div style="height:248px;width:49%;float:left">
                        <div style="height:123px;width:100%;float:left">
                            <a href="feedback.jsp">
                            <div style="height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left">
                                <span class="fa fa-pencil-square" style="margin-top: 5%; font-size: 50px;
                margin-left: 100px;"></span>
                        <h3 style=" font-size: 30px;
                margin-left: 65px;font-weight:600">Feedback</h3>
                            </div>
                                </a>
                            <div style="height:123px;width:2%;float:left"></div>
                            <a href="complain.jsp">
                            <div style="height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left">
                                <span class="fa fa-pencil-square" style="margin-top: 5%; font-size: 50px;
                margin-left: 100px;"></span>
                        <h3 style=" font-size: 30px;
                margin-left: 65px; font-weight:600">Complain</h3>
                            </div>
                                </a>
                        </div>
                        <div style="height:4px;width:100%;float:left"></div>
                        <div style="height:123px;width:100%;float:left">
                            <a href="notification.jsp">
                            <div style="height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left">
                                <span class="fa fa-pencil-square" style="margin-top: 5%; font-size: 50px;
                margin-left: 100px;"></span>
                        <h3 style=" font-size: 25px;
                margin-left: 25px; font-weight:600">View Notification</h3>
                            </div>
                        </a>
                            <div style="height:123px;width:2%;float:left"></div>
                            <A href="changepassword.jsp">
                            <div style="height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left">
                                <span class="fa fa-pencil-square" style="margin-top: 5%; font-size: 50px;
                margin-left: 100px;"></span>
                        <h3 style=" font-size: 25px;
                margin-left: 25px; font-weight:600">Change Password</h3>
                            </div>
                                </A>                       
                        </div>
                        </div>
                    <div style="height:248px;width:2%;float:left"></div>
                    <A href="userdashboard.jsp">
                    <div style="height:248px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left">
                        <span class="fa fa-user" style=" margin-top: 10%;font-size: 60px;
                margin-left: 250px;"></span>
                        <h3 style=" font-size: 50px;
                margin-left: 170px;">Dashboard</h3>
                    </div>
                        </A>
                </div>
                <div style="height:12px;width:100%"></div>
                <div style="height:248px;width:100%;">
                    <A href="myprofile.jsp">
                    <div style="height:247px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left">
                         <span class="fa fa-lock" style=" margin-top: 10%;font-size: 60px;
                margin-left: 250px;"></span>
                        <h3 style=" font-size: 50px;
                margin-left: 170px;">My Profile</h3>
                    </div>
                        </A>
                  <div style="height:247px;width:2%;float:left"></div>
                  <a href="logout.jsp">
                  <div style="height:247px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left">
                       <span class="glyphicon glyphicon-log-in" style=" margin-top: 10%;font-size: 60px;
                margin-left: 250px;"></span>
                        <h3 style=" font-size: 50px;
                margin-left: 170px;">Logout</h3>
                  </div>
                </a>
                      
                </div>
            </div>
            <div style="height: 500px;width:10%;float: left"></div>
        </div>
        
    </body>
</html>
