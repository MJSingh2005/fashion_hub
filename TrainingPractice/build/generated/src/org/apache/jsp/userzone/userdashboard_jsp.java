package org.apache.jsp.userzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .a{\n");
      out.write("                height:500px;\n");
      out.write("                width:100%;\n");
      out.write("                float:left;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("             \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("    \n");
      out.write("        <div class=\"a\">\n");
      out.write("            <div style=\"height: 500px;width:10%;float: left\"></div>\n");
      out.write("            <div class=\"b\" style=\"height:500px;width: 80%;float: left\">\n");
      out.write("                <div style=\"height:248px;width:100%;\">\n");
      out.write("                    <div style=\"height:248px;width:49%;float:left\">\n");
      out.write("                        <div style=\"height:123px;width:100%;float:left\">\n");
      out.write("                            <a href=\"feedback.jsp\">\n");
      out.write("                            <div style=\"height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left\">\n");
      out.write("                                <span class=\"fa fa-pencil-square\" style=\"margin-top: 5%; font-size: 50px;\n");
      out.write("                margin-left: 100px;\"></span>\n");
      out.write("                        <h3 style=\" font-size: 30px;\n");
      out.write("                margin-left: 65px;font-weight:600\">Feedback</h3>\n");
      out.write("                            </div>\n");
      out.write("                                </a>\n");
      out.write("                            <div style=\"height:123px;width:2%;float:left\"></div>\n");
      out.write("                            <a href=\"complain.jsp\">\n");
      out.write("                            <div style=\"height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left\">\n");
      out.write("                                <span class=\"fa fa-pencil-square\" style=\"margin-top: 5%; font-size: 50px;\n");
      out.write("                margin-left: 100px;\"></span>\n");
      out.write("                        <h3 style=\" font-size: 30px;\n");
      out.write("                margin-left: 65px; font-weight:600\">Complain</h3>\n");
      out.write("                            </div>\n");
      out.write("                                </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"height:4px;width:100%;float:left\"></div>\n");
      out.write("                        <div style=\"height:123px;width:100%;float:left\">\n");
      out.write("                            <a href=\"notification.jsp\">\n");
      out.write("                            <div style=\"height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left\">\n");
      out.write("                                <span class=\"fa fa-pencil-square\" style=\"margin-top: 5%; font-size: 50px;\n");
      out.write("                margin-left: 100px;\"></span>\n");
      out.write("                        <h3 style=\" font-size: 25px;\n");
      out.write("                margin-left: 25px; font-weight:600\">View Notification</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                            <div style=\"height:123px;width:2%;float:left\"></div>\n");
      out.write("                            <A href=\"changepassword.jsp\">\n");
      out.write("                            <div style=\"height:123px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left\">\n");
      out.write("                                <span class=\"fa fa-pencil-square\" style=\"margin-top: 5%; font-size: 50px;\n");
      out.write("                margin-left: 100px;\"></span>\n");
      out.write("                        <h3 style=\" font-size: 25px;\n");
      out.write("                margin-left: 25px; font-weight:600\">Change Password</h3>\n");
      out.write("                            </div>\n");
      out.write("                                </A>                       \n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    <div style=\"height:248px;width:2%;float:left\"></div>\n");
      out.write("                    <A href=\"userdashboard.jsp\">\n");
      out.write("                    <div style=\"height:248px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left\">\n");
      out.write("                        <span class=\"fa fa-user\" style=\" margin-top: 10%;font-size: 60px;\n");
      out.write("                margin-left: 250px;\"></span>\n");
      out.write("                        <h3 style=\" font-size: 50px;\n");
      out.write("                margin-left: 170px;\">Dashboard</h3>\n");
      out.write("                    </div>\n");
      out.write("                        </A>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"height:12px;width:100%\"></div>\n");
      out.write("                <div style=\"height:248px;width:100%;\">\n");
      out.write("                    <A href=\"myprofile.jsp\">\n");
      out.write("                    <div style=\"height:247px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left\">\n");
      out.write("                         <span class=\"fa fa-lock\" style=\" margin-top: 10%;font-size: 60px;\n");
      out.write("                margin-left: 250px;\"></span>\n");
      out.write("                        <h3 style=\" font-size: 50px;\n");
      out.write("                margin-left: 170px;\">My Profile</h3>\n");
      out.write("                    </div>\n");
      out.write("                        </A>\n");
      out.write("                  <div style=\"height:247px;width:2%;float:left\"></div>\n");
      out.write("                  <a href=\"logout.jsp\">\n");
      out.write("                  <div style=\"height:247px;width:49%;border:1px solid  white; box-shadow: 4px 2px 10px 2px grey;  box-shadow: 4px 2px 10px 2px grey;float:left\">\n");
      out.write("                       <span class=\"glyphicon glyphicon-log-in\" style=\" margin-top: 10%;font-size: 60px;\n");
      out.write("                margin-left: 250px;\"></span>\n");
      out.write("                        <h3 style=\" font-size: 50px;\n");
      out.write("                margin-left: 170px;\">Logout</h3>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("                      \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"height: 500px;width:10%;float: left\"></div>\n");
      out.write("        </div>\n");
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
