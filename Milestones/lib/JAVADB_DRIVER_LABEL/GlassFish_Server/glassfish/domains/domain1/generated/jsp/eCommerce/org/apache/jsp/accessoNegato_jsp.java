package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accessoNegato_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Stampa Cliente o Venditore a seconda del tentativo d'accesso effettuato, rispettivamente cliente.html\r\n");
      out.write("             e venditore.html -->\r\n");
      out.write("        <title>Portale ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${utente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("        <!-- Metainformazioni sulla pagina -->\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Vendita, Usato, Nuovo, Auto, Veicoli\">\r\n");
      out.write("        <meta name=\"description\" content=\"Inserimento di un nuovo veicolo in vendita\">\r\n");
      out.write("        <meta name=\"author\" content=\"Selima Curci\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("         <!-- Link al foglio di stile comune a tutte le pagine -->\r\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("        <!-- Icona del sito -->\r\n");
      out.write("        <link rel=\"icon\" href=\"Images/auto.jpeg\" type=\"image/jpeg\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"page\">\r\n");
      out.write("            \r\n");
      out.write("            <header>\r\n");
      out.write("              <!-- Se la sessione è attiva e valida allora è possibile effettuare il logout da questo link, che \r\n");
      out.write("                   richiamerà la servlet Logout\r\n");
      out.write("              -->\r\n");
      out.write("              ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("              <!-- Titolo usato per la risoluzione piccola e intermedia -->\r\n");
      out.write("              <h1 class=\"logo\">AUTONTHELINE</h1>\r\n");
      out.write("              \r\n");
      out.write("              <!-- Sezione di navigazione -->\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li> <a href=\"login.html\">Login</a> </li>\r\n");
      out.write("                        <li> <a href=\"descrizione.html\">Descrizione</a> </li>\r\n");
      out.write("                        <li class=\"currentpage\"> <a href=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${utente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- Menù a tendina per la risoluzione più bassa -->\r\n");
      out.write("                <div class=\"menu\">\r\n");
      out.write("                    <ul>  \r\n");
      out.write("                      <li id=\"barramenu\">\r\n");
      out.write("                        <a href=\"#\">Menù</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"login.html\">Login</a></li>\r\n");
      out.write("                            <li><a href=\"descrizione.html\">Descrizione</a></li>\r\n");
      out.write("                            <li><a href=\"\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${utente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"sidebar1\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"central\">\r\n");
      out.write("                \r\n");
      out.write("                <h1>Accesso negato</h1>\r\n");
      out.write("                <p id=\"divieto\">Non hai i permessi necessari per accedere a questa pagina</p>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Icludo la jsp che contiene il footer (comune a tutte le pagine) -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login == true}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                  <div id=\"logout\"><a href=\"logout.html\">Logout</a></div>\r\n");
        out.write("              ");
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
