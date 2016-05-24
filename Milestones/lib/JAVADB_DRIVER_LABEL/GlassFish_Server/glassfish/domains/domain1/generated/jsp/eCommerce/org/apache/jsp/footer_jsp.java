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
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
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
      out.write("\n");
      out.write("    <div class=\"clear\"></div>        \n");
      out.write("    <!-- Sezione informazioni aggiuntive e contatti -->\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("        <h3>Informazioni</h3>\n");
      out.write("        <p>Per qualsiasi informazione chiamate al numero verde <strong>800-900-313</strong> o scrivete a \n");
      out.write("           <strong>autontheline.vr6@gmail.com</strong>. Per qualsiasi lamentela rivolgersi all'ufficio reclami.\n");
      out.write("        </p>\n");
      out.write("       \n");
      out.write("        <div class=\"social\">\n");
      out.write("            <ul> \n");
      out.write("                <li id=\"facebook\"><a href=\"https://www.facebook.com/\">facebook</a></li>  \n");
      out.write("                    <li id=\"twitter\"><a href=\"https://twitter.com/?lang=it\">twitter</a></li>  \n");
      out.write("                    <li id=\"linkedin\"><a href=\"https://it.linkedin.com/\">linkedin</a></li> \n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"valida\">\n");
      out.write("                <a href=\"http://jigsaw.w3.org/css-validator/check/referer\">\n");
      out.write("                     <img style=\"border:0;width:88px;height:31px\"\n");
      out.write("                     src=\"http://jigsaw.w3.org/css-validator/images/vcss\"\n");
      out.write("                     alt=\"CSS Valido!\" />\n");
      out.write("                </a>\n");
      out.write("        </div>\n");
      out.write("    </footer>    \n");
      out.write(" \n");
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
