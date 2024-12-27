<%-- 
    Document   : changepassword
    Created on : Sep 9, 2023, 2:45:05 AM
    Author     : Ayush Varshney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .form-control{
                border-radius: 0px;
                margin-top: 2%; 
            }
            label{
                font-size: 15px;
            }
        </style>
    </head>
    <body>
        <div class="row">
            <%@include file="userheader.jsp" %>
            <div class="row">
                <div class="col-sm-12">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-4" style="padding:4%; box-shadow: 3px 4px 2px 5px gray;">
                        
                        <h3 style="text-align: center; font-size: 20px; font-family: cursive;">Change Password Here:<br><span class="fa fa-pencil-square-o"></span></h3>
                        
                        <hr style="background-color: purple; width: 100%; height: 3px;">
                       
                        <form action="changepassword.jsp" method="post">
                            <label>Enter Old Password</label>
                            <input type="password" class="form-control" name="txtoldpass">
                            
                            <label>Enter New Password</label>
                            <input type="password" class="form-control" name="txtnewpass">
                            
                            <label>Enter Confirm Password</label>
                            <input type="password" class="form-control" name="txtcpass">
                            <br>
                            <input type="submit" value="Change Password" class="form-control" style="background: forestgreen; color: white;" name="submit">
                        </form>
                       
                    </div>
                    <div class="col-sm-4"></div>
                </div>
            </div>
        </div>
    </body>
</html>
