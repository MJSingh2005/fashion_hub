<%-- 
    Document   : viewcomplain
    Created on : Sep 9, 2023, 3:30:31 AM
    Author     : Ayush Varshney
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DBmanager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/akash.css" rel="stylesheet" type="text/css"/>
        <script src="../js/jquery.js" type="text/javascript"></script>
    </head>
    <body>
        <%@include file="adminheader.jsp" %>
        <div class="col-sm-12">
            <div class="sol-sm-1"></div>
            <div class="sol-sm-10">
                <h3>View Complain Panel</h3>
                 <hr style="background: maroon; height: 3%;">
                 <table class="table table-responsive" id="example">
                     <thead>
                         <tr>
                             <th>SN.</th>
                             <th>User Id</th>
                             <th>Complain</th>
                             <th>Date</th>
                             <th>Action</th>
                         </tr>
                     </thead>
                     <tbody>
                         <%
                           String cmd="select * from tbl_complain";
                           DBmanager db=new DBmanager();
                           ResultSet rs=db.DisplayAllRecords(cmd);
                           while(rs.next())
                           {
                               %>
                               <tr>
                                   <td><%=rs.getString("cid")%></td>
                                   <td><%=rs.getString("userid")%></td>
                                   <td><%=rs.getString("msg")%></td>
                                   <td><%=rs.getString("cdate")%></td>
                                   <td>
                                       <a href="response.jsp?rep=<%=rs.getString("cid")%>">Response</a>
                                   </td>
                               </tr>
                               <%
                           }
                           %>
                     </tbody>
                 </table>
            </div>
            <div class="sol-sm-1"></div>
        </div>
                     <script src="../js/akash.js" type="text/javascript"></script>
                     <script>
                       $(document).ready(function(){
                           alert("ok");
                           $("#example").DataTable();
                       })
                   </script>
    </body>
</html>
