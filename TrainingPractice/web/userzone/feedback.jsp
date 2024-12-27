
<%@page import="mypack.DBmanager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
    String id=session.getAttribute("uid")+"";
    if(id!=null && id!="")
    {
        String btn=request.getParameter("btnsave");
        if(btn!=null)
        {
            String rate=request.getParameter("txtrate");
            String msg=request.getParameter("txtmsg");
            SimpleDateFormat sm=new SimpleDateFormat();
            String dt=sm.format(new Date());
           
            String cmd="insert into tbl_feedback(userid,rate,msg,fdate) values('"+id+"','"+rate+"','"+msg+"','"+dt+"')";
            DBmanager db=new DBmanager();
            if(db.MyInsertUpadateDelete(cmd))
                out.print("<script>alert('Feedback Syccessfully submited')</script>");
            else
                out.print("<script>alert('Error')</script>");
        }
    }
    else
    {
        response.sendRedirect("..login.jsp");
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
            
        </div>
            <div class="row">
                <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 panle panle-body" style="box-shadow: 0px 0px 4px 0px grey">
                    <h3>Feedback Panle Here
                        <span class="fa fa-android"></span>
                    </h3>
                    <hr style="background: purple; height: 3px;">
                    
                    <h3>Rate Now Here</h3>
                    <span class="fa fa-star" id="s1"></span>
                    <span class="fa fa-star" id="s2"></span>
                    <span class="fa fa-star" id="s3"></span>
                    <span class="fa fa-star" id="s4"></span>
                    <span class="fa fa-star" id="s5"></span>
                    
                    <span class="fa fa-star" id="sp1">1</span>
                    <span class="fa fa-star" id="sp2">2</span>
                    <span class="fa fa-star" id="sp3">3</span>
                    <span class="fa fa-star" id="sp4">4</span>
                    <span class="fa fa-star" id="sp5">5</span>
                    
                    <form action="feedback.jsp" method="post">
                    <input type="hidden" name="txtrate">
                    <h3>Write Your Reviews</h3><br>
                    <textarea name="txtmsg" class="form-control"
                              style="height: 100px"></textarea>
                    <br>
                    <input type="submit" class="form-control" style="background: forestgreen; color: white;" name="btnsave">
                    </form>
                    
                    
                </div>
                <div class="col-sm-4"></div>
                </div>
            </div>
            <script>
                $(document).ready(function(){
                    $("#s1,#s2,#s3,#s4,#s5").css({"fontSize":"40px","color":"teal","cursor":"pointer"});
                    $("#sp1,#sp2,#sp3,#sp4,#sp5").hide();
                    
                    var total="";
                    $("#s1").click(function(){
                        total=$("#sp1").text();
                        $("input[name='txtrate']").val(total);
                        $("#s1").css("color","gold");
                        $("#s2,#s3,#s4,#s5").css("color","green");
                    })
                    
                    $("#s2").click(function(){
                        total=$("#sp2").text();
                        $("input[name='txtrate']").val(total);
                        $("#s1,#s2").css("color","gold");
                        $("#s3,#s4,#s5").css("color","green");
                    })
                    $("#s3").click(function(){
                        total=$("#sp3").text();
                        $("input[name='txtrate']").val(total);
                        $("#s1,#s2,#s3").css("color","gold");
                        $("#s4,#s5").css("color","green");
                    })
                    $("#s4").click(function(){
                        total=$("#sp4").text();
                        $("input[name='txtrate']").val(total);
                        $("#s1,#s2,#s3,#s4").css("color","gold");
                        $("#s5").css("color","green");
                    })
                    $("#s5").click(function(){
                        total=$("#sp5").text();
                        $("input[name='txtrate']").val(total);
                        $("#s1,#s2,#s3,#s4,#s5").css("color","gold");
                    })
                }
                        
            )
            </script>
    </body>
</html>
