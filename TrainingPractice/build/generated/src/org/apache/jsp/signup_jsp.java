package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DBmanager;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/gernalheader1.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    try
    {
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
      String city=request.getParameter("txtcity");
      String state=request.getParameter("txtstate");
      String country=request.getParameter("txtcountry");
      String pincode=request.getParameter("txtpincode");
      out.print(fname+" "+lname+" "+mobile+" "+email+" "+pass+" "+cpass+" "+houseno+" "+area+" "+city+" "+state+" "+country+" "+pincode);
    SimpleDateFormat sm=new SimpleDateFormat();
    String dt=sm.format(new Date());
    if(cpass.equals(pass))
    {
        String cmd="insert into tbl_signup values('"+fname+"','"+lname+"','"+mobile+"','"+email+"','"+pass+"','"+houseno+"','"+area+"','"+city+"','"+state+"','"+country+"','"+pincode+"','"+dt+"')";
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
    }
    catch(Exception ex)
    {
        out.print(ex);
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #a{\n");
      out.write("                background: white; box-shadow: 1px 1px 1px 1px grey;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    #myNavbar ul li a{\n");
      out.write("        color: white;\n");
      out.write("        font-weight: bold;\n");
      out.write("        text-transform: uppercase;\n");
      out.write("    }\n");
      out.write("     #myNavbar ul li a:hover{\n");
      out.write("        text-decoration: underline;\n");
      out.write("    }\n");
      out.write("    h1{\n");
      out.write("        font-weight: bolder;\n");
      out.write("        font-family: sans-serif;\n");
      out.write("    }\n");
      out.write("    .fa{\n");
      out.write("        font-size: 20px;\n");
      out.write("        padding-left: 4%;\n");
      out.write("    }\n");
      out.write("    #a{\n");
      out.write("        \n");
      out.write("        font-family: cursive;\n");
      out.write("        background: lightcyan;\n");
      out.write("        border-radius: 2%;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("   \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--code for navbar-->\n");
      out.write("<div class=\"col-sm-12\" style=\"paddig:0px;\">\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"background:maroon; border:white; border-radius:0px;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"myNavbar\" >\n");
      out.write("          \n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("                              <li><a href=\"home.jsp\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>  MEN\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("    <ul class=\"dropdown-menu\" id='a' >\n");
      out.write("          <li><a href=\"menshirt.jsp\" style=\"color:black;\">Shirt</a></li>\n");
      out.write("          <li><a href=\"ment-shirt.jsp\" style=\"color:black;\">T-Shirt</a></li>\n");
      out.write("          <li><a href=\"menjeans.jsp\" style=\"color:black;\">Jeans</a></li>\n");
      out.write("          <li><a href=\"mentrouser.jsp\" style=\"color:black;\">Trouser</a></li>\n");
      out.write("          <li><a href=\"menjacket.jsp\" style=\"color:black;\">Jacket</a></li>\n");
      out.write("          <li><a href=\"mensweater.jsp\" style=\"color:black;\">Sweater</a></li>\n");
      out.write("          <li><a href=\"menshorts.jsp\" style=\"color:black;\">Shorts</a></li>\n");
      out.write("          <li><a href=\"menkurtapajama.jsp\" style=\"color:black;\">Kurta-Pajama</a></li>\n");
      out.write("          <li><a href=\"mencoatpant.jsp\" style=\"color:black;\">Coat-Pant</a></li>\n");
      out.write("          <li><a href=\"menblazer.jsp\" style=\"color:black;\">Blazer</a></li>\n");
      out.write("          <li><a href=\"menfootwear.jsp\" style=\"color:black;\">Men's Footwear</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>  WOMEN\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\" id='a'>\n");
      out.write("           <li><a href=\"womensaaree.jsp\" style=\"color:black;\">Saree</a></li>\n");
      out.write("          <li><a href=\"womensalwarsuit.jsp\" style=\"color:black;\">Salwar-Suit</a></li>\n");
      out.write("          <li><a href=\"womenkurtaset.jsp\" style=\"color:black;\">Kurta-Set</a></li>\n");
      out.write("          <li><a href=\"womenlehenga.jsp\" style=\"color:black;\">Lehenga</a></li>\n");
      out.write("          <li><a href=\"womenjacket.jsp\" style=\"color:black;\">Jacket</a></li>\n");
      out.write("          <li><a href=\"womensweater.jsp\" style=\"color:black;\">Sweater</a></li>\n");
      out.write("          <li><a href=\"womenjeans.jsp\" style=\"color:black;\">Jeans</a></li>\n");
      out.write("          <li><a href=\"womentops.jsp\" style=\"color:black;\">Tops</a></li>\n");
      out.write("           <li><a href=\"womenbeauty.jsp\" style=\"color:black;\">Beauty</a></li>\n");
      out.write("          <li><a href=\"womennighty.jsp\" style=\"color:black;\">Night-Dress</a></li>\n");
      out.write("          <li><a href=\"womenfootwear.jsp\" style=\"color:black;\">Ladies's Footwear</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("         <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>  BOYS\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\" id='a'>\n");
      out.write("          <li><a href=\"boysshirt.jsp\" style=\"color:black;\">Shirt</a></li>\n");
      out.write("          <li><a href=\"boystshirt.jsp\" style=\"color:black;\">T-Shirt</a></li>\n");
      out.write("          <li><a href=\"boystrouser.jsp\" style=\"color:black;\">Jeans/Trouser</a></li>          \n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Jacket</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Sweater</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Shorts</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Kurta-Pajama</a></li>         \n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Boy's Footwear</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("         <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>  GIRLS\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\" id='a'>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Frock</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Jeans</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Tops</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Shirt</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">T-Shirt</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Kurti-set</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Jacket</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Sweater</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Plazo</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Beauty</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Sleepwear</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Girl's Footwear</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("         <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>  KIDS\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("             <ul class=\"dropdown-menu\" id=\"a\">\n");
      out.write("         <li><a href=\"kidsjacket.jsp\" style=\"color:black;\">Jackets</a></li>                 \n");
      out.write("          <li><a href=\"kidstshirt.jsp\" style=\"color:black;\">T-Shirt</a></li>\n");
      out.write("          <li><a href=\"kidsshirt.jsp\" style=\"color:black;\">Shirt</a></li>\n");
      out.write("          <li><a href=\"kidssweater.jsp\" style=\"color:black;\">Sweater</a></li>\n");
      out.write("          <li><a href=\"#\" style=\"color:black;\">Kid's Footwear</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("       \n");
      out.write("         <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>  ACCOUNT \n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\" id='a'>\n");
      out.write("          <li><a href=\"signup.jsp\" style=\"color:black;\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("          <li><a href=\"login.jsp\" style=\"color:black;\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("    \n");
      out.write("    </ul>\n");
      out.write("        <form class=\"navbar-form navbar-right\" action=\"/action_page.php\">\n");
      out.write("  <div class=\"input-group\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("    <div class=\"input-group-btn\">\n");
      out.write("      <button class=\"btn btn-default\" type=\"submit\" >\n");
      out.write("        <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("</nav>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("<!--end code for navbar-->");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <br><br><br>\n");
      out.write("            <div class=\"container-fluid\" >\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-2\"></div>\n");
      out.write("                    <div class=\"col-sm-8 panel-body\" style=\"background: white; box-shadow: 5px 7px 10px 7px grey;\">\n");
      out.write("                        <h3><u><b><i>REGISTRATION:-</i></b></u></h3>\n");
      out.write("                        <form action=\"signup.jsp\" method=\"post\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <b>Enter First Name</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtfname\" id=\"a\">\n");
      out.write("                                <b>Enter Last Name</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtlname\" id=\"a\">\n");
      out.write("                                <b>Enter Mobile No.</b>\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" name=\"txtmobile\" id=\"a\">\n");
      out.write("                                <b>HOUSE NO.</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txthno\" id=\"a\">\n");
      out.write("                                <b>LOCALITY/AREA</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtarea\" id=\"a\">\n");
      out.write("                                <b>CITY</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtcity\" id=\"a\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                 <b>Enter E-Mail</b>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"txtemail\" id=\"a\">\n");
      out.write("                                <b>Enter Password</b>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"txtpass\" id=\"a\">\n");
      out.write("                                <b>Confirm Password</b>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"txtcpass\" id=\"a\">\n");
      out.write("                                 <b>STATE</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtstate\" id=\"a\">\n");
      out.write("                                <b>COUNTRY</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtcountry\" id=\"a\">\n");
      out.write("                                <b>PINCODE</b>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtpincode\" id=\"a\">\n");
      out.write("                                <br>\n");
      out.write("                         <input type=\"submit\" class=\"form-control\" name=\"btnregister\" value=\"Register Now\" style=\"background: green; color: white;\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-2\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("<!--            <div class=\"row\">\n");
      out.write("                ");
      out.write("\n");
      out.write("<style>\n");
      out.write(".footer {\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   \n");
      out.write("   background: linear-gradient(90deg, rgba(131,207,124,1) 0%, rgba(244,96,255,0.5961538461538461) 49%, rgba(0,212,255,1) 100%);\n");
      out.write("/*      background: linear-gradient( to right, #00093c, #2d0b00);*/\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("   border-top-left-radius: 100px;\n");
      out.write("   border-top-right-radius: 100px;\n");
      out.write("}\n");
      out.write("#ab{\n");
      out.write("    width: 33.3%;\n");
      out.write("    height: 400px;\n");
      out.write("    /*background: blue;*/\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("#b{\n");
      out.write("    width: 33.3%;\n");
      out.write("    height: 400px;\n");
      out.write("     /*background: aqua;*/\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("#c{\n");
      out.write("    width: 33.3%;\n");
      out.write("    height: 400px;\n");
      out.write("    /*background: red;*/\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("    font-family: monotype corsiva;\n");
      out.write("    font-weight: 600;\n");
      out.write("    font-size: 40px;\n");
      out.write("    margin-top: 2%;\n");
      out.write("}\n");
      out.write("p:hover{\n");
      out.write("    text-decoration: underline;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".fa-phone{\n");
      out.write("    padding-top: 2%; \n");
      out.write("    padding-left: 4%;\n");
      out.write("    padding-right: 5%;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".fa-facebook-square{\n");
      out.write("    color: white;\n");
      out.write("    font-size: 35px;\n");
      out.write("    padding-left: 15%;\n");
      out.write("}\n");
      out.write(".fa-facebook-square:hover{\n");
      out.write("        cursor: pointer;\n");
      out.write("        color: #fff;\n");
      out.write("        text-decoration: none;\n");
      out.write("}\n");
      out.write(".fa-instagram{\n");
      out.write("    color: white;\n");
      out.write("    font-size: 35px;\n");
      out.write("}\n");
      out.write(".fa-instagram:hover{\n");
      out.write("        cursor: pointer;\n");
      out.write("        color: #fff;\n");
      out.write("        text-decoration: none;\n");
      out.write("}\n");
      out.write(".fa-twitter-square{\n");
      out.write("    color: white;\n");
      out.write("    font-size: 35px;\n");
      out.write("}\n");
      out.write(".fa-twitter-square:hover{\n");
      out.write("        cursor: pointer;\n");
      out.write("        color: #fff;\n");
      out.write("        text-decoration: none;\n");
      out.write("}\n");
      out.write(".fa-whatsapp{\n");
      out.write("    color: white;\n");
      out.write("    font-size: 35px;\n");
      out.write("}\n");
      out.write(".fa-whatsapp:hover{\n");
      out.write("        cursor: pointer;\n");
      out.write("        color: #fff;\n");
      out.write("        text-decoration: none;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    padding-top: 8%;\n");
      out.write("    padding-right: 10%;\n");
      out.write("}\n");
      out.write("address{\n");
      out.write("    padding-top: 6%;\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-family: New Times Roman;\n");
      out.write("    font-weight: 550;\n");
      out.write("}\n");
      out.write("h4{\n");
      out.write("    text-align: left;\n");
      out.write("    padding-left: 5%;\n");
      out.write("    margin-right: 5%;\n");
      out.write("    font-family: New Times Roman;\n");
      out.write("    padding-top: 6%;\n");
      out.write("}\n");
      out.write(".fa-phone-square:hover{\n");
      out.write("    \n");
      out.write("    box-shadow: 1px 1px 2px 1px whitesmoke;\n");
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-12 footer\">\n");
      out.write("    <div id=\"ab\">\n");
      out.write("        <p>Contact us</p><br><br>\n");
      out.write("        \n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9675523226 </span>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9084927791 </span><br>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 7078757352 </span>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9045571472</span><br>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9634552251 </span><br>\n");
      out.write("        \n");
      out.write("        <a href=\"#\" class=\"fa fa-facebook-square\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-twitter-square\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-whatsapp\"></a>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <address> Address - Mahamaya Polytechnic of Information Technology, Salempur, Hathras - 204102, Uttar Pradesh  </address>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"b\">\n");
      out.write("        <p>About Us</p>\n");
      out.write("        <h4>\n");
      out.write("            Lorem ipsum dolor sit amet consectetur adipisicing elit. Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis doloremque ex modi earum sapiente nesciunt impedit rem quasi incidunt? Voluptatibus, possimus pariatur saepe incidunt eaque odio necessitatibus dicta impedit ex hic. Blanditiis doloremque ex modi earum sapiente nesciunt impedit rem quasi incidunt? Voluptatibus, possimus pariatur saepe incidunt eaque odio necessitatibus dicta impedit ex hic. Aliquam sint corrupti repudiandae sunt quam assumenda necessitatibus voluptates vitae, asperiores, eaque neque tenetur ipsum officiis, id dolor facilis harum amet molestias esse dolorum consectetur? Ratione numquam at dolore!\n");
      out.write("        </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"c\">\n");
      out.write("        <p>About Our Project</p>\n");
      out.write("        <h4>\n");
      out.write("            Lorem ipsum dolor sit amet consectetur adipisicing elit. Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis doloremque ex modi earum sapiente nesciunt impedit rem quasi incidunt? Voluptatibus, possimus pariatur saepe incidunt eaque odio necessitatibus dicta impedit ex hic. Blanditiis doloremque ex modi earum sapiente nesciunt impedit rem quasi incidunt? Voluptatibus, possimus pariatur saepe incidunt eaque odio necessitatibus dicta impedit ex hic. Aliquam sint corrupti repudiandae sunt quam assumenda necessitatibus voluptates vitae, asperiores, eaque neque tenetur ipsum officiis, id dolor facilis harum amet molestias esse dolorum consectetur? Ratione numquam at dolore!\n");
      out.write("        </h4>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            </div>-->\n");
      out.write("        </div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
