<%@page import="mypack.DBmanager" %>
<%
    DBmanager db=new DBmanager();
    out.print(db.getCon());
    %>