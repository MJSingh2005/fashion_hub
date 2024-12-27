<%-- 
    Document   : login
    Created on : Sep 7, 2023, 1:41:34 PM
    Author     : Ayush Varshney
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DBmanager"%>
<%
String btn=request.getParameter("btnlogin");
if(btn!=null)
{
    String id=request.getParameter("txtid");
    String pass=request.getParameter("txtpassword");
    String cmd="select * from tbl_login where userid='"+id+"' and password='"+pass+"'";
    DBmanager db=new DBmanager();
    ResultSet rs=db.DisplayAllRecords(cmd);//id
    if(rs.next())
    {
        String type=rs.getString("type");//user
        if(type.equals("user"))
        {
            session.setAttribute("uid",id);
            response.sendRedirect("userzone/myprofile.jsp");
        }
        else if(type.equals("admin"))
        {
             session.setAttribute("aid",id);
            response.sendRedirect("adminzone/dashboard.jsp");
      }
        else
        {
            out.print("<script>alert('Invalid user type')</script>");
        }
    }
    else
    {
        out.print("<script>alert('Invalid user id and password')</script>");
    
    }
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
         <div class="container-fluid">
            <div class="row">
                <%@include file="gernalheader1.jsp" %>
            </div>
            <br><br><br>
            <div class='row' style="font-size: 20px">
                <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 panel-body" style="background: white; box-shadow: 5px 7px 10px 7px grey;">
                    <h3><b>Login Panel</b>
                        <span class="fa fa-laptop"></span>
                    </h3>
                    <hr style="background: forestgreen; height: 2px;">
                    <form action="login.jsp" method="post">
                        <b>Enter User Id</b>
                        <input type="text" class="form-control" name="txtid" style="background: white; box-shadow: 1px 1px 1px 1px grey;">
                        <b>  Enter Password</b>
                        <input type="text" class="form-control" name="txtpassword" style="background: white; box-shadow: 1px 1px 1px 1px grey;">
                        <br>
                        <input type="submit" class="form-control btn-info" value="SignIn" name="btnlogin" style="box-shadow: 1px 1px 1px 1px infotext;">
                    </form>
                </div>
                <div class="col-sm-4"></div>
            </div>
            </div>
         </div>
    </body>
</html>
