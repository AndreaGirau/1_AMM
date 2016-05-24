package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <!-- Metainformazioni sulla pagina -->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"Login, Autontheline.com\">\n");
      out.write("        <meta name=\"description\" content=\"Login su autontheline.com\">\n");
      out.write("        <meta name=\"author\" content=\"Selima Curci\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <!-- Link al foglio di stile comune a tutte le pagine -->\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\n");
      out.write("        <!-- Icona del sito -->\n");
      out.write("        <link rel=\"icon\" href=\"Images/auto.jpeg\" type=\"image/jpeg\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            \n");
      out.write("            <header>\n");
      out.write("              <!-- Titolo usato per la risoluzione piccola e intermedia -->\n");
      out.write("              <h1 class=\"logo\">AUTONTHELINE</h1>\n");
      out.write("              \n");
      out.write("              <!-- Sezione di navigazione -->\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"currentpage\"> <a href=\"login.html\">Login</a> </li>\n");
      out.write("                        <li> <a href=\"descrizione.html\">Descrizione</a> </li>\n");
      out.write("                        <li> <a href=\"cliente.html\">Cliente</a> </li>\n");
      out.write("                        <li> <a href=\"venditore.html\">Venditore</a> </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <!-- Menù a tendina per la risoluzione più bassa -->\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <ul>  \n");
      out.write("                      <li id=\"barramenu\">\n");
      out.write("                        <a href=\"#\">Menù</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"login.html\">Login</a></li>\n");
      out.write("                            <li><a href=\"descrizione.html\">Descrizione</a></li>\n");
      out.write("                            <li><a href=\"cliente.html\">Cliente</a></li>\n");
      out.write("                            <li><a href=\"venditore.html\">Venditore</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            <div id=\"sidebar1\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"central\">\n");
      out.write("                <h1>Login al sito</h1>\n");
      out.write("                <p>Inserisci le tue credenziali per accedere a tutti i servizi di <strong>AUTONTHELINE.com</strong></p>\n");
      out.write("\n");
      out.write("                <!-- Form per l'inserimento delle credenziali da parte dell'utente-->\n");
      out.write("                <form action=\"login.html\" method=\"post\">\n");
      out.write("                    <fieldset>\n");
      out.write("                    <label for=\"username\">Username</label>\n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"username\" value=\"\" />\n");
      out.write("                    <div class=\"spazio\"></div>\n");
      out.write("                    <label for=\"pswd\">Password</label>\n");
      out.write("                    <input type=\"password\" name=\"pswd\" id=\"pswd\" value=\"\" />\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"Login\" id=\"submit\" name=\"submit\" />\n");
      out.write("                    </fieldset>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <div id=\"o\">\n");
      out.write("                    <!-- Se le credenziali d'accesso sono erratte o comunque si è verificato un errore durante\n");
      out.write("                         l'autenticazione dell'utente, questo viene avvertito con un messaggio\n");
      out.write("                    -->\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- Icludo la jsp che contiene il footer (comune a tutte le pagine) -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errore == true}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                       <p class=\"errore\"> Login erratto, riprova! </p>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
