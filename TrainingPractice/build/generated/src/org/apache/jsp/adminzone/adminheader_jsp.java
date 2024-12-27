package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
