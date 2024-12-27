package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gernalheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       font-family: cursive; \n");
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
      out.write("     .s1{\n");
      out.write("                height: 70px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                border: 1px solid black;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #aa{\n");
      out.write("                background: black;\n");
      out.write("                color: #fff;\n");
      out.write("                font-family: monotype corsiva;\n");
      out.write("            }\n");
      out.write("    .bg-img\n");
      out.write("    {\n");
      out.write("        background-image: url;\n");
      out.write("        min-height: 100%;\n");
      out.write("        background-position: center;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-size: cover;\n");
      out.write("        position: relative;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("<!--code for title-->\n");
      out.write("<div class=\"bg-img\" >\n");
      out.write("<div class=\"col-sm-12\" >\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("        <img src=\"image/m3.png\" class=\"img img-responsive\" style=\"margin-top: 30%; padding-left: 5%;\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-1\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-7\">\n");
      out.write("        <h1 style=\"font-size: 50px;\">Fashion With Style! Hub</h1>\n");
      out.write("        <h4>Affiliated to Goverment of Uttar Pradesh</h4>\n");
      out.write("        <h2>Narrow</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("         <img src=\"image\\p.png\" class=\"img img-responsive\" style=\"height:200px; width: 200px;\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--  end code for title-->\n");
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
      out.write("          <li><a href=\"womensaaree.jsp\" style=\"color:black;\">Saree</a></li>\n");
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
      out.write("          <li><a href=\"kidsjacket.jsp\" style=\"color:black;\">Jackets</a></li>                 \n");
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
      out.write("\n");
      out.write("<!--end code for navbar-->\n");
      out.write("\n");
      out.write("       \n");
      out.write("    \n");
      out.write("    \n");
      out.write(" ");
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
