/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2016-06-26 23:39:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/theme/navbar.html", Long.valueOf(1466979791930L));
    _jspx_dependants.put("/theme/recursos.html", Long.valueOf(1466454372166L));
    _jspx_dependants.put("/theme/footer.html", Long.valueOf(1466453476270L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    /* Add a gray background color and some padding to the footer */\n");
      out.write("    footer {\n");
      out.write("      background-color: #f2f2f2;\n");
      out.write("      padding: 25px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .carousel-inner img {\n");
      out.write("      width: 100%; /* Set width to 100% */\n");
      out.write("      min-height: 200px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Hide the carousel text when the screen is less than 600 pixels wide */\n");
      out.write("    @media (max-width: 600px) {\n");
      out.write("      .carousel-caption {\n");
      out.write("        display: none; \n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  <!-- Bootstrap -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/starter-template.css\" rel=\"stylesheet\">\n");
      out.write(" ");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Sangucheto</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">Inicio</a></li>\n");
      out.write("        <li><a href=\"AgregarIngrediente\">Agregar Ingrediente</a></li>\n");
      out.write("        <li><a href=\"Agregar Stock\">Agregar Stock</a></li>\n");
      out.write("        <li><a href=\"Crearsangucheto\">Crear sangucheto</a></li>\n");
      out.write("        <li><a href=\"Stock\">Ver Stock</a></li>\n");
      out.write("        <li><a href=\"AEliminarIngrediente\">Eliminar Ingrediente</a></li>\n");
      out.write("         <li><a href=\"Contacto\">Contacto</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write('\n');
      out.write(' ');
      out.write("<link href='<c:url value=\"css/bootstrap.min.css\" />' rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href='<c:url value=\"css/starter-template.css\" />' rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src='<c:url value=\"js/jquery-1.11.3.min.js\" />' type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<br></br><br></br>\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"col-sm-8\">\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("      <!-- Indicators -->\n");
      out.write("      <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      </ol>\n");
      out.write("\n");
      out.write("      <!-- Wrapper for slides -->\n");
      out.write("      <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("        <div class=\"item active\">\n");
      out.write("          <img src=\"http://placehold.it/800x400?text=IMAGE\" alt=\"Image\">\n");
      out.write("          <div class=\"carousel-caption\">\n");
      out.write("            <h3>Sell $</h3>\n");
      out.write("            <p>Money Money.</p>\n");
      out.write("          </div>      \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <img src=\"http://placehold.it/800x400?text=Another Image Maybe\" alt=\"Image\">\n");
      out.write("          <div class=\"carousel-caption\">\n");
      out.write("            <h3>More Sell $</h3>\n");
      out.write("            <p>Lorem ipsum...</p>\n");
      out.write("          </div>      \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Left and right controls -->\n");
      out.write("      <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Previous</span>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Next</span>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-4\">\n");
      out.write("    <div class=\"well\">\n");
      out.write("      <p>Some text..</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"well\">\n");
      out.write("       <p>Upcoming Events..</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"well\">\n");
      out.write("       <p>Visit Our Blog</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container text-center\">    \n");
      out.write("  <h3>Secciones</h3>\n");
      out.write("  <br>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("      <img src=\"http://imageshack.com/a/img921/1130/Q93O5d.gif\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\">\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\"> \n");
      out.write("      <img src=\"http://imageshack.com/a/img922/3268/MRQHjm.gif\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\">\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\"> \n");
      out.write("      <img src=\"http://imageshack.com/a/img924/5969/ONeoV8.gif\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\"> \n");
      out.write("      <img src=\"http://imageshack.com/a/img922/9927/l430Aw.gif\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\">\n");
      out.write("     \n");
      out.write("    </div> \n");
      out.write("    <div class=\"col-sm-2\"> \n");
      out.write("      <img src=\"http://imageshack.com/a/img923/6930/OYh4wt.gif\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\">\n");
      out.write("      \n");
      out.write("    </div>     \n");
      out.write("    <div class=\"col-sm-2\"> \n");
      out.write("      \n");
      out.write("      <img src=\"http://imageshack.com/a/img924/1830/Mqh6rV.gif\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\" >\n");
      out.write("   \n");
      out.write("    </div> \n");
      out.write("  </div>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"starter-template.css\" rel=\"stylesheet\">\n");
      out.write("<footer id=\"footer\">\n");
      out.write("    <p>Orieta Romina, Miharu Lucas - Taller Web I - Tp final</p>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      $(document).ready(function() {\n");
      out.write("        $(\"#navbar ul li:contains(Inicio)\").addClass(\"active\");\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
