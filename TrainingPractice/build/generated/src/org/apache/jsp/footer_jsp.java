package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<style>\n");
      out.write(".footer {\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   \n");
      out.write("/*   background: linear-gradient(90deg, rgba(131,207,124,1) 0%, rgba(244,96,255,0.5961538461538461) 49%, rgba(0,212,255,1) 100%);*/\n");
      out.write("      background: linear-gradient( to top left, black, grey);\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("   border-top-left-radius: 100px;\n");
      out.write("   border-top-right-radius: 100px;\n");
      out.write("}\n");
      out.write("#ab{\n");
      out.write("    width: 33.3%;\n");
      out.write("    height: 360px;\n");
      out.write("    /*background: blue;*/\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("#b{\n");
      out.write("    width: 33.3%;\n");
      out.write("    height: 360px;\n");
      out.write("     /*background: aqua;*/\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("#c{\n");
      out.write("    width: 33.3%;\n");
      out.write("    height: 360px;\n");
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
      out.write(".fa-phone-square{\n");
      out.write("    padding-top: 2%; \n");
      out.write("    padding-left: 4%;\n");
      out.write("    padding-right: 5%;\n");
      out.write("    font-size: 15px;\n");
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
      out.write("        \n");
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
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".fa-envelope{\n");
      out.write("    padding-top: 2%; \n");
      out.write("    padding-left: 4%;\n");
      out.write("    padding-right: 5%;\n");
      out.write("    font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-12 footer\">\n");
      out.write("    <div id=\"ab\">\n");
      out.write("        <p>Contact us</p><br>\n");
      out.write("        \n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9675523226 </span>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9084927791 </span><br>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 7078757352 </span>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9045571472</span><br>\n");
      out.write("        <span class=\"fa fa-phone-square\"> +91 - 9634552251 </span><br><br>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("            <span class=\"fa fa-envelope\">  dk7530922@gmail.com </span><br>\n");
      out.write("            <span class=\"fa fa-envelope\">  dheerajpandit513@gmail.com  </span>\n");
      out.write("            <span class=\"fa fa-envelope\">  ayushvarshney0987@gmail.com  </span>\n");
      out.write("            <span class=\"fa fa-envelope\">  meghanshusaxena789@gmail.com </span>\n");
      out.write("            <span class=\"fa fa-envelope\">  jeetendrasingh201920@gmail.com  </span>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("<!--        <a href=\"#\" class=\"fa fa-facebook-square\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-twitter-square\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-whatsapp\"></a>-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div id=\"b\">\n");
      out.write("        <p>Follow Us With</p>\n");
      out.write("        <h4>\n");
      out.write("            <a href=\"https://www.facebook.com/profile.php?id=100022554400887\" class=\"fa fa-facebook-square\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-twitter-square\"></a>\n");
      out.write("        <a href=\"#\" class=\"fa fa-whatsapp\"></a>\n");
      out.write("        </h4><br>\n");
      out.write("        \n");
      out.write("        <address> Address - Mahamaya Polytechnic of Information Technology, Salempur, Hathras - 204102, Uttar Pradesh  </address><br>\n");
      out.write("         \n");
      out.write("         <h6 style=\"font-family: monospace\"><center><span>&copy;</span> copyright 2023,WWW All Right Reserved <span>&copy;</span>. | Govt. Of India</center> </h6>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"c\">\n");
      out.write("        <p>About Our Project</p>\n");
      out.write("        <h4>\n");
      out.write("            \n");
      out.write("        </h4>\n");
      out.write("    </div>\n");
      out.write("                       \n");
      out.write("</div>\n");
      out.write("\n");
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
