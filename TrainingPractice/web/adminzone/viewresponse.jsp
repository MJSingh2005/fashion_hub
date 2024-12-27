<%-- 
    Document   : viewresponse
    Created on : Sep 9, 2023, 11:56:52 PM
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
        <style>
            th{
                background: black;
                color: white;
            }
            td{
                background: lightyellow;
                color: darkgreen;
            }
        </style>
    </head>
    <body>
        <%@include file="adminheader.jsp" %>
        <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">
                <h3>View Response Management</h3>
                <hr style="background: teal; height: 3px;">
                <table id="example" border="1px">
                    <thead>
                        <tr>
                            <th><center>UserId</center></th>
                            <th><center>Complain</center></th>
                            <th><center>Response</center></th>
                            <th><center>Rdate</center></th>
                            <th><center>Cdate</center></th>
                            <th><center>Delete</center></th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            String cmd="select * from tbl_complain inner join tbl_response on tbl_complain.cid=tbl_response.cid";
                            DBmanager db=new DBmanager();
                            ResultSet rs=db.DisplayAllRecords(cmd);
                            while(rs.next())
                            {
                                %>
                                <tr>
                                    <td><%=rs.getString("userid")%></td>
                                    <td><%=rs.getString("msg")%></td>
                                    <td><%=rs.getString("response")%></td>
                                    <td><%=rs.getString("rdate")%></td>
                                    <td><%=rs.getString("cdate")%></td>
                                    <td>
                                        <span class="fa fa-trash"></span>
                                    </td>
                                </tr>
                                <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
            <div class="col-sm-1"></div>
        </div>
        
    </body>
</html>
