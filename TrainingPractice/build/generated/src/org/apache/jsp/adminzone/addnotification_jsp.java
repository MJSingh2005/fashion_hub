package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DBmanager;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class addnotification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminzone/adminheader.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
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
      out.write("<nav class=\"navbar navbar-inverse\" style=\"background: teal; border-radius:0px\">\n");
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
      out.write("        <li class=\"active\"><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("        <li><a href=\"viewenquiry.jsp\">View Enquiry</a></li>\n");
      out.write("        <li><a href=\"viewfeedback.jsp\">View Feedback</a></li>\n");
      out.write("        <li><a href=\"viewcomplain.jsp\">View Complain</a></li>\n");
      out.write("        <li><a href=\"viewresponse.jsp\">View Response</a></li>\n");
      out.write("        <li><a href=\"addnotification.jsp\">Add Notification</a></li>\n");
      out.write("        <li><a href=\"changepassword.jsp\">Change Password</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--end code for navbar-->");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4\" style=\"box-shadow: 3px 0px 5px 3px gray; margin: 2%; padding: 4%\">\n");
      out.write("                    <h4>Add Notification\n");
      out.write("                        <span class=\"fa fa-envelope-o\"></span>\n");
      out.write("                    </h4>\n");
      out.write("                    <hr style=\"background: purple; height: 2px;\">\n");
      out.write("                    <form action=\"addnotification.jsp\" method=\"post\">\n");
      out.write("              Notification Type\n");
      out.write("     <input type=\"text\" class=\"form-control\" name=\"txttype\">\n");
      out.write("           Notification\n");
      out.write(" <textarea name=\"txtnoti\" class=\"form-control\" style=\"height: 100px;\"></textarea>\n");
      out.write("        <hr>\n");
      out.write("      <input type=\"submit\" class=\"form-control btn-info\" value=\"Add Notification\" name=\"btnadd\">      \n");
      out.write("                    </form>      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
