<%@page import="mypack.DBmanager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
String btn=request.getParameter("btnregister");
if(btn!=null)
{
    String fname=request.getParameter("txtfname");
      String lname=request.getParameter("txtlname");
      String mobile=request.getParameter("txtmobile");
      String email=request.getParameter("txtemail");
      String pass=request.getParameter("txtpass");
      String cpass=request.getParameter("txtcpass");
      String houseno=request.getParameter("txthno");
      String area=request.getParameter("txtarea");
      String city=request.getParameter("txtfcity");
      String state=request.getParameter("txtstate");
      String country=request.getParameter("txtcountry");
      String pincode=request.getParameter("txtpincode");
    SimpleDateFormat sm=new SimpleDateFormat();
    String dt=sm.format(new Date());
    if(cpass.equals(pass))
    {
        
        String cmd="insert into tbl_register values('"+fname+"','"+lname+"','"+mobile+"','"+email+"','"+pass+"','"+houseno+"','"+area+"','"+city+"','"+state+"','"+country+"','"+pincode+"','"+dt+"')";
        String cmd2="insert into tbl_login values('"+email+"','"+pass+"','user')";
        
        DBmanager db=new DBmanager();
        if(db.MyInsertUpadateDelete(cmd) && db.MyInsertUpadateDelete(cmd2) )
            out.print("<script>alert('Registration successfully done')</script>");
        else
            out.print("<scrtip>alert('unable to save')</script>");
    }
    else
    {
        out.print("<script>alert('Password and confirm password not match.')</script>");
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
            <div class="container-fluid">
                <div class="col-sm-12">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8">
                        <h3><u><b><i>REGISTRATION:-</i></b></u></h3>
                        <hr style="height: 2px; background: black;">
                        <form action="signup.jsp" method="post">
                            <div class="col-sm-6">
                                <b>Enter First Name</b>
                                <input type="text" class="form-control" name="txtfname">
                                <b>Enter Last Name</b>
                                <input type="text" class="form-control" name="txtlname">
                                <b>Enter Mobile No.</b>
                                <input type="tel" class="form-control" name="txtmobile">
                            </div>
                            <div class="col-sm-6">
                                 <b>Enter E-Mail</b>
                                <input type="email" class="form-control" name="txtemail">
                                <b>Enter Password</b>
                                <input type="password" class="form-control" name="txtpass">
                                <b>Confirm Password</b>
                                <input type="password" class="form-control" name="txtcpass">
                            </div>
                        </form>
                    <hr style="height: 2px; background: black;">
                    </div>
                    
                    <div class="col-sm-2"></div>
                </div>
                <div class="col-sm-12">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8">
                        <hr style="height: 2px; background: black; width: 50%;">
                        <form action="signup.jsp" method="post">
                            <div class="col-sm-6">
                                <b>HOUSE NO.</b>
                                <input type="text" class="form-control" name="txthno">
                                <b>LOCALITY/AREA</b>
                                <input type="text" class="form-control" name="txtarea">
                                <b>CITY</b>
                                <input type="text" class="form-control" name="txtcity">
                                 
                            </div>
                            <div class="col-sm-6">
                                 <b>STATE</b>
                                <input type="text" class="form-control" name="txtstate">
                                <b>COUNTRY</b>
                                <input type="text" class="form-control" name="txtcountry">
                                <b>PINCODE</b>
                                <input type="text" class="form-control" name="txtpincode">
                            </div>
                        </form>
                    <hr style="height: 2px; background: black;">
                    </div>
                    
                    <div class="col-sm-2"></div>
                </div>
                <div class="col-sm-12">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8">
                        <form action="signup.jsp" method="post">
                        <br>
                         <input type="submit" class="form-control" name="btnregister" value="Register Now" style="background: green; color: white;">
                         </form>
                        
                    </div>
                    <div class="col-sm-2"></div>
                </div>
                
            </div>
        </div>
    </body>
</html>
