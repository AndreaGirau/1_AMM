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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Descrizione Autontheline.com</title>\n");
      out.write("        <!-- Metainformazioni sulla pagina -->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"Auto, Moto, Nuovo, Usato, Vendita, Autontheline.com, Occasioni, Convenienza\">\n");
      out.write("        <meta name=\"description\" content=\"Sito per il commercio online di auto e veicoli nuovi e usati\">\n");
      out.write("        <meta name=\"author\" content=\"Selima Curci\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <!-- Link al foglio di stile comune a tutte le pagine -->\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\n");
      out.write("        <!-- Icona del sito -->\n");
      out.write("        <link rel=\"icon\" href=\"Images/auto.jpeg\" type=\"image/jpeg\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <header id=\"header\">\n");
      out.write("                <!-- Se la sessione è attiva e valida allora è possibile effettuare il logout da questo link, che \n");
      out.write("                    richiamerà la servlet Logout\n");
      out.write("                -->\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                <!-- Titolo usato per la risoluzione piccola e intermedia -->\n");
      out.write("                <h1 class=\"logo\">AUTONTHELINE</h1>\n");
      out.write("                \n");
      out.write("                <!-- Sezione di navigazione -->\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"currentpage\"> <a href=\"descrizione.html\">Descrizione</a> </li>\n");
      out.write("                        <li> <a href=\"login.html\">Login</a> </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                \n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <a href=\"login.html\"  class=\"login\">Login</a>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <!-- Sommario con link interni alle sezioni-->\n");
      out.write("            <div id=\"sidebar1\">\n");
      out.write("                <ul class=\"sezione\">\n");
      out.write("                    <li class=\"categoria\"> <a href=\"#nuovo\">Veicoli nuovi</a> </li>\n");
      out.write("                    <li>\n");
      out.write("                        <ul class=\"sottosezioni\">\n");
      out.write("                            <li><a href=\"#auto1\">Auto</a></li>\n");
      out.write("                            <li><a href=\"#moto1\">Moto</a></li>\n");
      out.write("                            <li><a href=\"#altro1\">Altro</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    <li>\n");
      out.write("                    <li class=\"categoria\"> <a href=\"#usato\">Veicoli usati</a> </li>\n");
      out.write("                    <li>   \n");
      out.write("                        <ul class=\"sottosezioni\">\n");
      out.write("                            <li><a href=\"#auto2\">Auto</a></li>\n");
      out.write("                            <li><a href=\"#moto2\">Moto</a></li>\n");
      out.write("                            <li><a href=\"#altro2\">Altro</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>    \n");
      out.write("                    <li class=\"categoria\"> <a href=\"#accessori\">Ricambi e accessori</a> </li>\n");
      out.write("                    <li>    \n");
      out.write("                        <ul class=\"sottosezioni\">\n");
      out.write("                            <li><a href=\"#auto3\">Auto</a></li>\n");
      out.write("                            <li><a href=\"#moto3\">Moto</a></li>\n");
      out.write("                            <li><a href=\"#altro3\">Altro</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"categoria\"> <a href=\"#info\">Informazioni</a> </li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                 <!-- Storia della società --> \n");
      out.write("                <p><em>AUTONTHELINE</em> nasce nel 1989 d.C. in Lituania, fondata da George Athelstan all'età di 19 anni.\n");
      out.write("                La società ha intrapreso un profondo cammino verso il successo in Europa per poi decidere che la Cina era più economica. Attualmete non è quotata in borsa \n");
      out.write("                e non intende esserlo in futuro. Per chi fosse interessato a lavorare con noi invii il curriculum e forse \n");
      out.write("                verrà preso in considerazione. Grazie per l'attenzione.</p>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"central\">\n");
      out.write("                <!-- Sommario per la risoluzione più bassa -->\n");
      out.write("                <ul id=\"sommario\">\n");
      out.write("                    <li class=\"categoria\"> <aside><a href=\"#nuovo\">Veicoli nuovi</a></aside> </li>\n");
      out.write("                    <li class=\"categoria\"> <aside><a href=\"#usato\">Veicoli usati</a></aside> </li>    \n");
      out.write("                    <li class=\"categoria\"> <aside><a href=\"#accessori\">Ricambi e accessori</a></aside> </li>\n");
      out.write("                    <li class=\"categoria\"> <aside><a href=\"#info\">Informazioni</a></aside> </li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                 <!-- Introduzione e descrizione al sito -->\n");
      out.write("                <div id=\"introduzione\">\n");
      out.write("                <p>Vuoi vendere o comprare un auto? <strong>Autontheline.com</strong> sarà la tua risposta! Trova subito auto nuove e usate, moto, camper e veicoli commerciali.\n");
      out.write("                Interfaccia utente intuitiva ed efficacie per esperti e venditori alle prime armi. Potrai accedere facilmente sia\n");
      out.write("                come venditore che come cliente. I venditori potranno inserire i propri annunci in maniera semplice e completamente gratuita.\n");
      out.write("                Sistema di logistica interattivo e multifunzionale per mettere in contatto e soddisfare le \n");
      out.write("                esigenze anche dei clienti più difficili e degli abitanti più sfortunati in termini di locazione geografica. \n");
      out.write("                Non sai come spendere i tuoi soldi? Oppure sei stanco di avere le tasche vuote? Noi trasformeremo il \n");
      out.write("                vecchio rottame di tuo nonno nel tappeto volante di qualcun altro, realizzando sogni irrealizzabili. \n");
      out.write("                Solo su <strong>AUTONTHELINE</strong>! Nella sezione Auto Usate trovi migliaia di annunci con foto di auto usate sicure con garanzia di concessionari e \n");
      out.write("                privati di tutte le marche in tutto il globo.\n");
      out.write("                </p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- Sezione veicoli nuovi-->\n");
      out.write("                <div id=\"sez_nuovo\">\n");
      out.write("                    <h2 id='nuovo'>VEICOLI NUOVI</h2>\n");
      out.write("                    <p>Vendita veicoli nuovi e nuovissimi : auto, moto e 2-6-9-15 ruote per le persone più bisognose di viaggiare. \n");
      out.write("                        Vedi un muro e vuoi salirci? La categoria <strong>ALTRO</strong> risponderà alle tue salite nel modo giusto. Vuoi verticalizzare\n");
      out.write("                    la tua vita in un piano orizzontale di strade catramate? Sgomma su <strong>AUTONTHELINE.COM</strong>, la via giusta per \n");
      out.write("                    il viaggio sbagliato. Hai problemi di sonno? Su <strong>AUTONTHELINE.COM</strong> potrai svegliarti più tardi per andare a \n");
      out.write("                    lavoro grazie alle moto più veloci del più veloce e-commerce veloce dell'alta velocità. Per te le migliori\n");
      out.write("                    offerte e occasioni rintracciabili sul pianeta, solo oggi, solo adesso, <em>\"only for you\"</em>, chiama ora, VIVI.</p>\n");
      out.write("                    <h3 id='auto1'>Auto</h3>\n");
      out.write("                    <p class=\"sottosezione\">Cerca la tua nuova auto tra i tanti modelli offerti da autontheline. Ogni giorno migliaia di offerte ti \n");
      out.write("                    sorprenderano al punto tale che ti convincerai a cambiare auto in qualsiasi momento. Potrai pagare attraverso un \n");
      out.write("                    nuovo circuito di moneta virtuale che renderà più semplice e più veloce ogni trattazione messa in atto all'interno\n");
      out.write("                    della piattaforma. Per chiarire quasiasi dubbio chiamate e scriveteci senza alcun problema (ma non esagerate). \n");
      out.write("                    Tra i migliori marchi dei sette mari offerti solo per voi:</p>\n");
      out.write("                    <div class=\"marche_auto\">\n");
      out.write("                    <ul class=\"elenco\">\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Aixam</li> \n");
      out.write("                                <li>Amphicar</li> \n");
      out.write("                                <li>Borgward</li> \n");
      out.write("                                <li>Casalini</li> \n");
      out.write("                                <li>Chery</li> \n");
      out.write("                                <li>Daimler</li> \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>DRmotor</li> \n");
      out.write("                                <li>Fisker</li> \n");
      out.write("                                <li>IsoRivolta</li> \n");
      out.write("                                <li>Lifan</li> \n");
      out.write("                                <li>Melex</li> \n");
      out.write("                                <li>PGO</li> \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Savel</li> \n");
      out.write("                                <li>TownLife</li> \n");
      out.write("                                <li>UAZ</li> \n");
      out.write("                                <li>VAZ</li> \n");
      out.write("                                <li>Zastova</li> \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <h3 id='moto1'>Moto</h3>\n");
      out.write("                    <p class=\"sottosezione\">Sogni le due ruote? Su autontheline potrai volare via sulla tua moto nuova. Potrai provare l'acqua \n");
      out.write("                    di montagna e i brividi sulla pelle, i moscerini negli occhi e il mal di schiena. Potrai impennare dove \n");
      out.write("                    e quando vuoi, ricordati però di atterrare ogni volta. Soddisfatti o soddisfatti. </p>\n");
      out.write("                    <div class=\"marche_moto\">\n");
      out.write("                    <ul class=\"elenco\">\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Access</li>\n");
      out.write("                                <li>Adly</li>\n");
      out.write("                                <li>Baotian</li>\n");
      out.write("                                <li>ChinaBike</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>D-RAD</li>\n");
      out.write("                                <li>EcoMobile</li>\n");
      out.write("                                <li>Horex</li>\n");
      out.write("                                <li>IFA</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Leonard</li>\n");
      out.write("                                <li>PGO</li>\n");
      out.write("                                <li>REX</li>\n");
      out.write("                                <li>XingFu</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <h3 id='altro1'>Altro</h3>\n");
      out.write("                    <p class=\"sottosezione\">Hai le idee confuse? Cerca tra le stranezze proposte da autontheline. Troverai quel che cerchi ancora \n");
      out.write("                    prima di sapere cosa stai cercando. In alcuni periodi dell'anno potresti riuscire ad acquistare un disco \n");
      out.write("                    volante nuovo di zecca mai atterrato su un pianeta del nostro sistema solare. E tanto altro ancora. \n");
      out.write("                    Per scoprire le novità più nuove del nuovo conosciuto segui la nostra pagina facebook : <em>www.facebook.org</em>.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"spazio\"></div>\n");
      out.write("                <!-- Sezione veicoli usati-->\n");
      out.write("                <div id=\"sez_usato\">\n");
      out.write("                    <h2 id='usato'>VEICOLI USATI</h2>\n");
      out.write("                    <p>Vendita veicoli usati. Cerca la tua auto d´occasione o vendi macchine private in tutto l'Universo conosciuto.\n");
      out.write("                    Hai il garage vuoto? Riempitelo. Hai il garage pieno? Svuotatelo. Hai pochi soldi? Non possiamo aiutarti. \n");
      out.write("                    Ma se hai una macchina vecchia noi saremo la luce fuori dal tuo tunnel immenso e infinito, colmo di indecisione \n");
      out.write("                    e sofferenza inaudita. Non avere paura di abbandonare il tuo catorcio per un nuovissimo catorcio peggiore del precedente. \n");
      out.write("                    E' il momento, lasciati andare, segui l'onda dei milioni e milioni di milioni. Forse con euri in tasca riempi il \n");
      out.write("                    garage, ma questa è solo una supposizione statistica. Per maggiori dettagli: <strong>STUDIA</strong>.  </p>\n");
      out.write("                    <h3 id='auto2'>Auto</h3>\n");
      out.write("                    <p class=\"sottosezione\">Cerca la tua auto usata e riusata e strausata tra i tanti modelli offerti da furbi ma onestamente fraudolenti venditori. \n");
      out.write("                    Tra i peggiori marchi del Bengala alle migliori offerte australiane:</p>\n");
      out.write("                    <div class=\"marche_auto\">\n");
      out.write("                    <ul class=\"elenco\">\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Aixam</li> \n");
      out.write("                                <li>Amphicar</li> \n");
      out.write("                                <li>Borgward</li> \n");
      out.write("                                <li>Casalini</li> \n");
      out.write("                                <li>Chery</li> \n");
      out.write("                                <li>Daimler</li> \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>DRmotor</li>  \n");
      out.write("                                <li>Fisker</li> \n");
      out.write("                                <li>IsoRivolta</li> \n");
      out.write("                                <li>Lifan</li> \n");
      out.write("                                <li>Melex</li> \n");
      out.write("                                <li>PGO</li> \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Savel</li> \n");
      out.write("                                <li>TownLife</li> \n");
      out.write("                                <li>UAZ</li> \n");
      out.write("                                <li>VAZ</li> \n");
      out.write("                                <li>Zastova</li> \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <h3 id='moto2'>Moto</h3>\n");
      out.write("                    <p class=\"sottosezione\">Sogni le due ruote? Su autontheline vorresti volare via sulla tua moto nuova, ma non puoi; \n");
      out.write("                    perciò accontentati di una usata perchè è la tua unica chance. Potrai provare 1/5 dei brivisdi della velocità, \n");
      out.write("                    i moscerini negli occhi e il mal di testa. Potrai impennare dove e quando vuoi (più o meno), ricordati \n");
      out.write("                    però di atterrare ogni volta. Soddisfatti o soddisfatti. Ci estraniamo da ogni responsabilità. </p>\n");
      out.write("                    <div class=\"marche_moto\">\n");
      out.write("                    <ul class=\"elenco\">\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Access</li>\n");
      out.write("                                <li>Adly</li>\n");
      out.write("                                <li>Baotian</li>\n");
      out.write("                                <li>ChinaBike</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>D-RAD</li>\n");
      out.write("                                <li>EcoMobile</li>\n");
      out.write("                                <li>Horex</li>\n");
      out.write("                                <li>IFA</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <ul class=\"sottolista\">\n");
      out.write("                                <li>Leonard</li>\n");
      out.write("                                <li>PGO</li>\n");
      out.write("                                <li>REX</li>\n");
      out.write("                                <li>XingFu</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <h3 id='altro2'>Altro</h3>\n");
      out.write("                    <p class=\"sottosezione\">Hai le idee confuse? Cerca tra le stranezze proposte da autontheline. Troverai quel che cerchi ancora \n");
      out.write("                    prima di sapere cosa stai cercando. In alcuni periodi dell'anno potresti riuscire ad acquistare un disco \n");
      out.write("                    volante nuovo di zecca mai atterrato su un pianeta del nostro sistema solare. E tanto altro ancora. \n");
      out.write("                    Per scoprire le novità più nuove del nuovo conosciuto segui la nostra pagina facebook : <em>www.facebook.org</em>.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"spazio\"></div>\n");
      out.write("                <!-- Sezione ricambi e accessori per veicoli -->\n");
      out.write("                <div id=\"sez_acessori\">\n");
      out.write("                    <h2 id='accessori'>RICAMBI E ACCESSORI</h2>\n");
      out.write("                    <p>Non puoi più volare via per un problemino, per un problemone, per una problematica o per qualsiasi sia \n");
      out.write("                        il tuo reale problema ? <strong>AUTONTHELINE.COM</strong> non può aiutarti. Siamo profondamente dispiaciuti, al massimo possiamo \n");
      out.write("                    offrirti qualche ricambio originale, di concorrenza o contraffatto, a seconda del tuo budget. Non aspettarti \n");
      out.write("                    miracoli, ma solo ulteriori problemi, che ovviamente richiederanno ulteriori spese dispersive, espansive e \n");
      out.write("                    compulsive, IVA inclusa ed esentasse. Non emettiamo fatture ma solide realtà.</p>\n");
      out.write("                    <h3 id=\"auto3\">Auto</h3>\n");
      out.write("                    <p class=\"sottosezione\">Acessori e ricambi di qualità per la tua auto.</p>\n");
      out.write("                    <h3 id='moto3'>Moto</h3>\n");
      out.write("                    <p class=\"sottosezione\">Acessori e ricambi di qualità per la tua moto.</p>\n");
      out.write("                    <h3 id='altro3'>Altro</h3>\n");
      out.write("                    <p class=\"sottosezione\">Acessori e ricambi di qualità per i veicoli più disparati. Occasioni introvabili e rare a portata di click.</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <a href=\"#header\" id=\"su\"></a> <!-- Link interno che permette di tornare a inizio pagina -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            \n");
      out.write("            <!-- Sezione informazioni aggiuntive e contatti -->\n");
      out.write("            <footer id=\"footer\">\n");
      out.write("                <h3 id=\"info\">Informazioni</h3>\n");
      out.write("                <p>Per qualsiasi informazione chiamate al numero verde <strong>800-900-313</strong> o scrivete a \n");
      out.write("                   <strong>autontheline.vr6@gmail.com</strong>. Per qualsiasi lamentela rivolgersi all'ufficio reclami.\n");
      out.write("                </p>\n");
      out.write("       \n");
      out.write("                <div class=\"social\">\n");
      out.write("                    <ul> \n");
      out.write("                        <li id=\"facebook\"><a href=\"https://www.facebook.com/\">facebook</a></li>  \n");
      out.write("                        <li id=\"twitter\"><a href=\"https://twitter.com/?lang=it\">twitter</a></li>  \n");
      out.write("                        <li id=\"linkedin\"><a href=\"https://it.linkedin.com/\">linkedin</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                 <div id=\"valida\">\n");
      out.write("                    <a href=\"http://jigsaw.w3.org/css-validator/check/referer\">\n");
      out.write("                    <img style=\"border:0;width:88px;height:31px\"\n");
      out.write("                        src=\"http://jigsaw.w3.org/css-validator/images/vcss\"\n");
      out.write("                        alt=\"CSS Valido!\" />\n");
      out.write("                    </a>\n");
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
        out.write("\n");
        out.write("                  <div id=\"logout\"><a href=\"logout.html\">Logout</a></div>\n");
        out.write("                ");
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
