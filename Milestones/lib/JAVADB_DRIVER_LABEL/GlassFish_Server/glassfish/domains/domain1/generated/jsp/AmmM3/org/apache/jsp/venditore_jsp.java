package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class venditore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <header>\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <!-- Nome sito -->\n");
      out.write("                    <h1> AG Movies&Books </h1>\n");
      out.write("\n");
      out.write("                    <div class=\"navigation\">\n");
      out.write("                        <!--\n");
      out.write("                            Sezone di navigazione per navigare nelle altre pagine del sito\n");
      out.write("                        -->\n");
      out.write("                        <nav>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"descrizione.html\"> Home </a>\n");
      out.write("                                </li>\n");
      out.write("                                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty utenteLoggato}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <a href=\"login.html\">Login</a>\n");
      out.write("                                </c:if>\n");
      out.write("                                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty utenteLoggato}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <a href=\"login.html?logout=true\">Logout</a>\n");
      out.write("                                </c:if>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div id=\"contentForm\">\n");
      out.write("                <c:choose>\n");
      out.write("                    <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty prodottoInserito && not empty venditore}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <h3>Grazie, annuncio inserito!</h3>\n");
      out.write("                        <p>Nome: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodottoInserito.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Prezzo: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodottoInserito.prezzo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Quantità: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodottoInserito.quantità}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Descrizione: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodottoInserito.descrizione}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Immagine: </p>\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodottoInserito.urlImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Foto Scanner\" width=\"110\" height=\"110\"/>\n");
      out.write("                    </c:when>\n");
      out.write("                    <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty venditore && empty login_error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <h2 class=\"contentTitle\"> Vendi </h2>\n");
      out.write("                        <!--\n");
      out.write("                            Form per l'inserimento di un prodotto che un cliente vorrebbe vendere\n");
      out.write("                        -->\n");
      out.write("                        <div class=\"input-form\" id=\"form\">\n");
      out.write("                            <form method=\"post\" action=\"Seller\">\n");
      out.write("                                <!-- Inserimento nome oggetto -->\n");
      out.write("                                <label for=\"NomeOggetto\"> Nome di cosa vorresi vendere: </label>\n");
      out.write("                                <input type=\"text\" name=\"NomeOggetto\" id=\"NomeOggetto\"/>\n");
      out.write("                                <!-- Inserimento url foto oggetto -->\n");
      out.write("                                <label for=\"FotoOggetto\"> Copiare la url della foto descrittiva: </label>\n");
      out.write("                                <input type=\"url\" name=\"FotoOggetto\" id=\"FotoOggetto\"/>\n");
      out.write("                                <!-- Inserimento testo con descrizione oggetto -->\n");
      out.write("                                <label for=\"DescrizioneOggetto\"> Descrizione: </label>\n");
      out.write("                                <textarea name=\"DescrizioneOggetto\" id=\"DescrizioneOggetto\"\n");
      out.write("                                          cols=\"40\" rows=\"10\"> Scrivi qui.. </textarea>\n");
      out.write("                                <!-- Inserimento prezzo oggetto -->\n");
      out.write("                                <label for=\"Prezzo\"> Prezzo: </label>\n");
      out.write("                                <input type=\"number\" name=\"Prezzo\" id=\"Prezzo\">\n");
      out.write("                                <!-- Inserimento descrizione oggetto -->\n");
      out.write("                                <label for=\"Quantità\"> Quantità: </label>\n");
      out.write("                                <input type=\"number\" name=\"Quantità\" id=\"Quantità\">\n");
      out.write("                                \n");
      out.write("                                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty input_error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <div class=\"errore\">Verifica di aver inserito i dati correttamente.</div>\n");
      out.write("                                </c:if>\n");
      out.write("                                <!-- Pulsanti submit e reset -->\n");
      out.write("                                <input type=\"submit\" name=\"Submit\" value=\"invia\">\n");
      out.write("                                <input type=\"reset\" name=\"Reset\" value=\"cancella\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </c:when>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
}
