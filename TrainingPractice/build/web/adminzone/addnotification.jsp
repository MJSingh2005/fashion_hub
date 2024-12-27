<%@page import="mypack.DBmanager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
    String btn=request.getParameter("btnadd");
    if(btn!=null)
    {
        String type=request.getParameter("txttype");
        String noti=request.getParameter("txtnoti");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        
        DBmanager db=new DBmanager();
        String cmd="insert into tbl_notification (type,msg,ndate) values('"+type+"','"+noti+"','"+dt+"')";
        
        if(db.MyInsertUpadateDelete(cmd))
        
                 out.print("<script>alert('Notification Successfully save')</script>");
        
                 else
            out.print("<script>alert('unable to add')</script>");
        
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
            <%@include file="adminheader.jsp" %>     
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4" style="box-shadow: 3px 0px 5px 3px gray; margin: 2%; padding: 4%">
                    <h4>Add Notification
                        <span class="fa fa-envelope-o"></span>
                    </h4>
                    <hr style="background: purple; height: 2px;">
                    <form action="addnotification.jsp" method="post">
              Notification Type
     <input type="text" class="form-control" name="txttype">
           Notification
 <textarea name="txtnoti" class="form-control" style="height: 100px;"></textarea>
        <hr>
      <input type="submit" class="form-control btn-info" value="Add Notification" name="btnadd">      
                    </form>      
                </div>
                <div class="col-sm-4"></div>
            </div>
        </div>
    </body>
</html>
