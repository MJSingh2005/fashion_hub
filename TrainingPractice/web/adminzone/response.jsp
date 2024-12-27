<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="mypack.DBmanager"%>
<%@page import="java.sql.ResultSet"%>
<%
   String btn=request.getParameter("btnresponse");
   if(btn!=null)
   {
       String id=request.getParameter("txtcid");
       String user=request.getParameter("txtuserid");
       String res=request.getParameter("txtresponse");
       
       SimpleDateFormat sm=new SimpleDateFormat();
       String dt=sm.format(new Date());
       
       String cmd="insert into tbl_response(cid,userid,response,rdate) values('"+id+"','"+user+"','"+res+"','"+dt+"')";
      DBmanager db=new DBmanager();
      if(db.MyInsertUpadateDelete(cmd))
          out.print("<script>alert('Response Save !');window.location.href='viewcomplain.jsp'</script>");
      else
         out.print("<script>alert('Error !')</script>");
   }
%>
<%
        String id=request.getParameter("rep");
        String cmd="select * from tbl_complain where cid='"+id+"'";
        DBmanager db=new DBmanager();
        ResultSet rs=db.DisplayAllRecords(cmd);
        if(rs.next())
        {
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="adminheader.jsp" %>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4" style="margin: 2%; padding: 3%; box-shadow: 0px 0px 4px 0px gray">
                <h3>Responsive Management !</h3>
                <hr style="background: teal; height: 3px;">
                <form action="response.jsp" method="post">
                    
                    Complain Id
  <input type="text" class="form-control" name="txtcid" readonly value="<%=rs.getString("cid")%>">    
                    Complain User
  <input type="text" class="form-control" name="txtuserid" readonly value="<%=rs.getString("userid")%>">    
                    Enter Response Here
                    <textarea name="txtresponse" class="form-control"></textarea>   
                    <br>
                    <input type="submit" value="Respone Now" class="form-control btn-info" name="btnresponse">
                </form>
            </div>
            <div class="col-sm-4"></div>
        </div>
    </body>
</html>
<%
}
%>