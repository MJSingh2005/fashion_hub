package org.apache.jsp.userzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DBmanager;

public final class myprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/userzone/userheader.jsp");
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
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("             <div class=\"container-fulid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"../js/jquery.js\"></script>\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    #myNavbar ul li a \n");
      out.write("    {\n");
      out.write("        color: white;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--code for navbar -->\n");
      out.write("<div class=\"col-sm-12\" style=\"paddig:0px;\">\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"background: forestgreen; border-radius:0px\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"userdashboard.jsp\">Dashboard</a></li>\n");
      out.write("        <li><a href=\"myprofile.jsp\">My Profile</a></li>\n");
      out.write("        <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("        <li><a href=\"complain.jsp\">Complain</a></li>\n");
      out.write("        <li><a href=\"notification.jsp\">View Notification</a></li>\n");
      out.write("        <li><a href=\"changepassword.jsp\">Change Password</a></li>    \n");
      out.write("        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--end code for navbar-->");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div class=\"col-sm-4\"></div>\n");
      out.write("                        <div class=\"col-sm-4\" style=\"box-shadow: 2px 2px 10px 2px grey; padding: 2%; margin: 2%;\">\n");
      out.write("                            <h3>My Profile Panel\n");
      out.write("                                <span class=\"fa fa-envelope\"></span>\n");
      out.write("                            </h3>\n");
      out.write("                            <hr style=\"background: teal; height: 3px;\">\n");
      out.write("                            ");

                                String id=session.getAttribute("uid")+"";
                                out.print(id);
                                if(id!=null && id!="")
                                {
                                String cmd="select * from tbl_signup where email='"+id+"'";
                                DBmanager db=new DBmanager();
                                ResultSet rs=db.DisplayAllRecords(cmd);
                                if(rs.next())
                                {
                                    
      out.write("\n");
      out.write("                                    <form action=\"myprofile.jsp\" method=\"post\"><br>\n");
      out.write("                                        First Name\n");
      out.write("                                        <input type=\"text\" name=\"txtfname\" value=\"");
      out.print(rs.getString("fname"));
      out.write("\" class=\"form-control\">\n");
      out.write("                                       \n");
      out.write("                                     Last Name\n");
      out.write("                                        <input type=\"text\" name=\"txtlname\" value=\"");
      out.print(rs.getString("lname"));
      out.write("\"    class=\"form-control\">\n");
      out.write("                                       \n");
      out.write("                                         Your Email\n");
      out.write("                                         <input type=\"text\" name=\"txtemail\" value=\"");
      out.print(rs.getString("email"));
      out.write("\" readonly=\"\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                                         Your Mobile\n");
      out.write("                                        <input type=\"text\" name=\"txtmobile\" value=\"");
      out.print(rs.getString("mobile"));
      out.write("\" class=\"form-control\">\n");
      out.write("                                        <br>\n");
      out.write("                                        <input type=\"button\" value=\"Edit\" class=\"btn btn-danger\" name=\"btnedit\">\n");
      out.write("                                        <input type=\"submit\" value=\"Update\" class=\"btn btn-success\" name=\"btnupdate\">\n");
      out.write("                                    </form>\n");
      out.write("                                    ");

                                }
                                        else
                                {
                                    
      out.write("\n");
      out.write("                                    <h3>No Record found Here</h3>\n");
      out.write("                                    ");

                                }
                                }
                                else
                                {
                                    response.sendRedirect("../login.jsp");
                                }
                                
      out.write("\n");
      out.write("  \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("<!--                             Jquery starts   -->\n");
      out.write("    <script>\n");
      out.write("                        $(document).ready(function(){\n");
      out.write("                            $(\".btn-success\").hide();\n");
      out.write("                            $(\"input[name='txtfname'],input[name='txtlname'],input[name='txtmobile']\").attr(\"readonly\",true);\n");
      out.write("                            $(\".btn-danger\").click(function(){\n");
      out.write("                                $(\".btn-danger\").hide();\n");
      out.write("                                $(\".btn-success\").show();\n");
      out.write("                                 $(\"input[name='txtfname'],input[name='txtlname'],input[name='txtmobile']\").attr(\"readonly\",false);\n");
      out.write("                                \n");
      out.write("                            })\n");
      out.write("                        \n");
      out.write("                        })\n");
      out.write("                    </script>\n");
      out.write("            \n");
      out.write("        \n");
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
