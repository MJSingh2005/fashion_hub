<%-- 
    Document   : myprofile
    Created on : Sep 9, 2023, 2:46:24 AM
    Author     : Ayush Varshney
--%>


<%
    String btn=request.getParameter("btnupdate");
    if(btn!=null)
    {
        String cmd="update tbl_signup set fname='"+request.getParameter("txtfname")+"',lname='"+request.getParameter("txtlname")+"',mobile='"+request.getParameter("txtmobile")+"',email='"+request.getParameter("txtemail")+"'";
        DBmanager db=new DBmanager();
        if(db.MyInsertUpadateDelete(cmd))
            out.print("<script>alert('Profile Upadated Successfully !')</script>");
        else
            out.print("<script>alert('Error')</script>");
    }
    %>


<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DBmanager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            
             <div class="container-fulid">
            <div class="row">
                <%@include file="userheader.jsp" %>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="col-sm-4"></div>
                        <div class="col-sm-4" style="box-shadow: 2px 2px 10px 2px grey; padding: 2%; margin: 2%;">
                            <h3>My Profile Panel
                                <span class="fa fa-envelope"></span>
                            </h3>
                            <hr style="background: teal; height: 3px;">
                            <%
                                String id=session.getAttribute("uid")+"";
                                out.print(id);
                                if(id!=null && id!="")
                                {
                                String cmd="select * from tbl_signup where email='"+id+"'";
                                DBmanager db=new DBmanager();
                                ResultSet rs=db.DisplayAllRecords(cmd);
                                if(rs.next())
                                {
                                    %>
                                    <form action="myprofile.jsp" method="post"><br>
                                        First Name
                                        <input type="text" name="txtfname" value="<%=rs.getString("fname")%>" class="form-control">
                                       
                                     Last Name
                                        <input type="text" name="txtlname" value="<%=rs.getString("lname")%>"    class="form-control">
                                       
                                         Your Email
                                         <input type="text" name="txtemail" value="<%=rs.getString("email")%>" readonly="" class="form-control">

                                         Your Mobile
                                        <input type="text" name="txtmobile" value="<%=rs.getString("mobile")%>" class="form-control">
                                        <br>
<!--                                        <input type="button" value="Edit" class="btn btn-danger" name="btnedit">
                                        <input type="submit" value="Update" class="btn btn-success" name="btnupdate">-->
                                    </form>
                                    <%
                                }
                                        else
                                {
                                    %>
                                    <h3>No Record found Here</h3>
                                    <%
                                }
                                }
                                else
                                {
                                    response.sendRedirect("../login.jsp");
                                }
                                %>
  
                            
                        </div>
                        <div class="col-sm-4"></div>
                    </div>
                </div>
            </div>
        </div>
                                
                                
<!--                             Jquery starts   -->
    <script>
                        $(document).ready(function(){
                            $(".btn-success").hide();
                            $("input[name='txtfname'],input[name='txtlname'],input[name='txtmobile']").attr("readonly",true);
                            $(".btn-danger").click(function(){
                                $(".btn-danger").hide();
                                $(".btn-success").show();
                                 $("input[name='txtfname'],input[name='txtlname'],input[name='txtmobile']").attr("readonly",false);
                                
                            })
                        
                        })
                    </script>
            
        
    </body>
</html>
