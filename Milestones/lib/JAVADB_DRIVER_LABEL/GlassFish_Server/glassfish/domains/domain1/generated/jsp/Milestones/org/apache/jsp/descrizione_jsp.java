package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class descrizione_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> AG Movies&Books</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"author\" content=\"Andrea Girau\">\n");
      out.write("        <meta name=\"keywords\" content=\"film, dvd, blu-ray, AG, movies, books, libri, best, sellers\">\n");
      out.write("        <!-- link al file style.css -->\n");
      out.write("        <link href=\"./style.css\" rel=\"stylesheet\"  type=\"text/css\" media=\"screen\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <header>\n");
      out.write("                <!--\n");
      out.write("                    Header con nome del sito\n");
      out.write("                -->\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <h1> AG Movies&Books </h1>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                    <!--\n");
      out.write("                        Sezone di navigazione per il Login\n");
      out.write("                    -->\n");
      out.write("                    <div class=\"navigation\">\n");
      out.write("                        <nav> \n");
      out.write("                            <ul>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            <div id=\"sidebar\">\n");
      out.write("                <!--\n");
      out.write("                    Sommario con link interni per favorire la navigazione sul sito\n");
      out.write("                -->\n");
      out.write("                <h2> Sommario </h2>\n");
      out.write("                <ol>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#welcome\"> Benvenuto! </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#catalogue\"> Catalogo </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#movies\"> Film </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#books\"> Libri </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#gadget\"> Gadget </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#news\"> Novità e Best Seller </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#gift\"> Cofanetti e idee regalo </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#guide\"> Guida all'acquisto </a>\n");
      out.write("                    </li>\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("                <!-- \n");
      out.write("                    Introduzione al sito \n");
      out.write("                -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <h2 id=\"welcome\"> Benvenuto! </h2>\n");
      out.write("                <p>\n");
      out.write("                    Benvenuto in AG Movies&Books, dove troverai migliaia di titoli di Dvd, Blu-Ray e libri, \n");
      out.write("                    anche in anteprima mondiale. Spedizioni in tutto il globo. Film, serie tv, \n");
      out.write("                    documentari, anime, cartoni animati ma anche best sellers, nuove uscite e i grandi classici,\n");
      out.write("                    tutto quello che cerchi lo troverai qua!\n");
      out.write("                    E' presente anche una sezione di vendita dell'usato, compriamo i vostri dvd, blu-ray o libri\n");
      out.write("                    supervalutandoli.\n");
      out.write("                    Per maggiori informazioni continuate a leggere, buona permanenza nel nostro sito!\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <!-- \n");
      out.write("                    Spiegazione sulla suddivisione degli acquisti \n");
      out.write("                -->\n");
      out.write("                <h2 id=\"catalogue\"> Catalogo </h2>\n");
      out.write("                <p>\n");
      out.write("                    Il nostro catalogo si divide in tre parti: vendita di Dvd e Blu-Ray, vendita di libri e \n");
      out.write("                    vendita di gadget provenienti dai più famosi titoli cinematografici e non solo.\n");
      out.write("                    Accedi con un semplice click su Login e andando sulla sezione \"Compra\" scorri facilmente\n");
      out.write("                    il nostro catalogo e compra i nostri prodotti a prezzi imbattibili!\n");
      out.write("                </p>    \n");
      out.write("\n");
      out.write("                <!--\n");
      out.write("                    Macrocategorie film\n");
      out.write("                -->\n");
      out.write("                <h2 id=\"movies\"> Film </h2>\n");
      out.write("                <p>\n");
      out.write("                    I nostri titoli sono tantissimi e aspettano solo te, sfoglia la sezione principale del \n");
      out.write("                    catalogo e troverai numerosissimi film, in Dvd o Blu-ray, aggiungi al carrello e potrai\n");
      out.write("                    ridere, piangere, emozionarti guardando i tuoi film preferiti. Le categorie che troverai\n");
      out.write("                    saranno principalmente (ma non solo):\n");
      out.write("                </p>\n");
      out.write("                <ul class=\"descrizione\">\n");
      out.write("                    <li> Animazione </li>\n");
      out.write("                    <li> Avventura </li>\n");
      out.write("                    <li> Azione </li>\n");
      out.write("                    <li> Commedia </li>\n");
      out.write("                    <li> Documentario </li>\n");
      out.write("                    <li> Fantascienza </li>\n");
      out.write("                    <li> Fantasy </li>\n");
      out.write("                    <li> Horror </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!--\n");
      out.write("                    Macrocategorie libri\n");
      out.write("                -->\n");
      out.write("                <h2 id=\"books\"> Libri </h2>\n");
      out.write("                <p>\n");
      out.write("                Tantissimi libri ti aspettano! Sfoglia il catalogo, aggiungi al carrello\n");
      out.write("                e buona lettura! Troverai (e non solo):\n");
      out.write("                </p>\n");
      out.write("                <ul class=\"descrizione\">\n");
      out.write("                    <li> Arte e spettacolo </li>\n");
      out.write("                    <li> Avventura </li>\n");
      out.write("                    <li> Letteratura </li>\n");
      out.write("                    <li> Fantascienza </li>\n");
      out.write("                    <li> Fantasy </li>\n");
      out.write("                    <li> Giallo </li>\n");
      out.write("                    <li> Horror </li>\n");
      out.write("                    <li> Ragazzi </li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                <!--\n");
      out.write("                    Sezione gadgets\n");
      out.write("                -->\n");
      out.write("                <h2 id=\"gadget\"> Gadget </h2>\n");
      out.write("                <p>\n");
      out.write("                    E' presente una sezione in cui potrai comprare i gadget dei film più famosi. Vuoi l'Anello\n");
      out.write("                    della saga \"Il Signore Degli Anelli\" per una super proposta di matrimonio? Qua lo troverai! \n");
      out.write("                    Vuoi padroneggiare la Morte? Acquista in offerta i Doni Della Morte dalla saga \"Harry Potter\".\n");
      out.write("                    Oppure preferisci travestirti da Spider-Man? Troverai tutto questo!\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <!-- Particolari offerte promosse  -->\n");
      out.write("                <h3 id=\"news\"> Novità e Best Seller</h3>\n");
      out.write("                <p>\n");
      out.write("                    Ogni settimana migliaia di nuovi titoli, anteprime, nuove edizioni ma anche i titoli\n");
      out.write("                    più famosi, vengono aggiunti a prezzi imbattibili al fine di permettere una completa \n");
      out.write("                    esperienza d'acquisto, come se entraste di persona nel nostro negozio. \n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <h3 id=\"gift\"> Cofanetti e idee regalo </h3>\n");
      out.write("                <p>\n");
      out.write("                    Non sai cosa regalare? Trovrai nel nostro sito cofanetti delle più famose saghe \n");
      out.write("                    e non solo. Sorprendi con regali originali e introvabili i tuoi amici, \n");
      out.write("                    troverai le edizioni dei film e libri più famosi: Harry Potter, Ritorno Al Futuro, \n");
      out.write("                    Hunger Games, Il Signore Degli Anelli, ma anche i film Marvel come Spiderman o la serie X-Men.\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <!-- Semplici direttive per aiutare i nuovi utenti  -->\n");
      out.write("                <h3 id=\"guide\"> Guida all'acquisto </h3>\n");
      out.write("                <p>\n");
      out.write("                    Esegui il Login per accedere a tutte le nostre funzionalità. Leggi la lista dei nostri titoli \n");
      out.write("                    e aggiungi al carrello! Reso gratuito entro 30 giorni dalla data dell'acquisto. Scegli se \n");
      out.write("                    comprare o vendere.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty compratoreLoggato && empty venditoreLoggato}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"login.html\"> Login</a>\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty compratoreLoggato || not empty venditoreLoggato}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"login.html?logout=true\"> Logout </a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
