package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class professore_005fautenticato_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>esAMMi - login</title>\n");
      out.write("        <meta name=\"keywords\" content=\"AMM esami docente\">\n");
      out.write("        <meta name=\"description\" content=\"Una pagina per gestire le funzioni dei docenti\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"http://spano.sc.unica.it/amm2014/davide/esami14/images/favicon.ico\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\n");
      out.write("        <style type=\"text/css\"></style>\n");
      out.write("    </head>    \n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"social\">\n");
      out.write("                    <p>Accesso al sistema</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li id=\"facebook\"><a href=\"http://www.facebook.com\">facebook</a></li>\n");
      out.write("                        <li id=\"twitter\"><a href=\"https://twitter.com/\">twitter</a></li>\n");
      out.write("                        <li id=\"linkedin\"><a href=\"http://www.linkedin.com/\">linkedin</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--  header -->\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <h1>EsAMMi</h1>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- select per la versione del menu mobile -->\n");
      out.write("                    <select class=\"menu\">\n");
      out.write("                        <option>Menu</option>\n");
      out.write("                    </select>\n");
      out.write("                    <!-- tabs -->\n");
      out.write("                    <div id=\"menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a class=\"current_page_item\" href=\"#\">Home</a></li>\n");
      out.write("                        </ul>                   \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- start page -->\n");
      out.write("            <!--  sidebar 1 -->\n");
      out.write("            <div id=\"sidebar1\">\n");
      out.write("                <ul>\n");
      out.write("                    <li id=\"categories\">\n");
      out.write("                        <h2 class=\"icon-title\">Navigazione</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#˙\">Home</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"external\">\n");
      out.write("                        <h2 class=\"icon-title\">Link esterni</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"http://www.unica.it/\">Università di Cagliari</a></li>\n");
      out.write("                            <li><a href=\"http://www.unica.it/\">Facoltà</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"sidebar2\">\n");
      out.write("                <h2 class=\"icon-title\" id=\"help\">Istruzioni</h2>\n");
      out.write("                <p>\n");
      out.write("                    Pagina per l'accesso al sistema.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- contenuto Form -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <div class=\"input-form\">\n");
      out.write("                    <h3> Bentornato,\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professore.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professore.cognome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h3>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <h4>Il tuo ID</h4>\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professore.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </div>    \n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <h4>Materie insegnate:</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <h4>Registrazione Esami</h4>\n");
      out.write("                            \n");
      out.write("                            <ul>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clear\">\n");
      out.write("            </div>\n");
      out.write("            <!--  footer -->\n");
      out.write("            <footer>\n");
      out.write("                <div id=\"footer\">\n");
      out.write("                    <p>\n");
      out.write("                        Applicazione d'esempio per l'esame di Amministrazione di Sistema\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"validator\">\n");
      out.write("                    <p>\n");
      out.write("                        <a href=\"http://validator.w3.org/check/referer\" class=\"xhtml\" title=\"Questa pagina contiene HTML valido\">\n");
      out.write("                            <abbr title=\"eXtensible HyperText Markup Language\">HTML</abbr> Valido</a>\n");
      out.write("                        <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" class=\"css\" title=\"Questa pagina ha CSS validi\">\n");
      out.write("                            <abbr title=\"Cascading Style Sheets\">CSS</abbr> Valido</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("materia");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professore.corsiAssegnati}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${materia.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li> \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("alunno");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaAlunni}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alunno.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alunno.cognome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        <a href=\"Registra?alunnoId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alunno.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                        Registra esame\n");
          out.write("                                        </a>\n");
          out.write("                                    </li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
