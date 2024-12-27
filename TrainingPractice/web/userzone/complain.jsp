<%@page import="mypack.DBmanager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
    
  String btn=request.getParameter("submit");
  if(btn!=null)
  {
       String id=session.getAttribute("uid")+"";
      if(id!=null && id!="")
      {
     
      String msg=request.getParameter("txtcomplain");
      SimpleDateFormat sm=new SimpleDateFormat();
      String dt=sm.format(new Date());
      
      String cmd="insert into tbl_complain(userid,msg,cdate) values('"+id+"','"+msg+"','"+dt+"')";
      
      DBmanager db=new DBmanager();
      if(db.MyInsertUpadateDelete(cmd))
          out.print("<script>alert('Complain Save ! Admin team contact shortly')</script>");
      else
          out.print("<script>alert('Error')</script>");
      }
   
      else
      {
             response.sendRedirect("../Login.jsp"); 
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
        <div class="row">
        <%@include file="userheader.jsp" %>
        <div class="row">
            <div class="col-sm-12" >
                <div class="col-sm-4"></div>
                <div class="col-sm-4"  style="border: 2px solid black; padding: 0px; box-shadow: 4px 4px 5px 4px gray; padding: 2%; margin: 2%;">
                    
                    <h3 style="text-align: center; font-size: 20px; font-family: cursive;">Complain Panel Here<br><span class="fa fa-laptop"></span></h3>
                    
                    <hr style="width:100%; height: 3px; background-color: purple;">
                    <form action="complain.jsp" method="post">
                        <label style="font-size: 15px;">Enter Complain Here</label><br>
                        <textarea style="height: 100px; width: 100%;" name="txtcomplain"></textarea>
                        <input type="submit" class="form-control" style="color: white; background: forestgreen;" value="Complain Here" name="submit">
                    </form>
                </div>
                <div class="col-sm-4"></div>
            </div>
        </div>
        </div>
    </body>
</html>
