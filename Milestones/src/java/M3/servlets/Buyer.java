/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3.servlets;

import M3.classes.Prodotto;
import M3.classes.Utente;
import M3.factories.AGFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andrea
 */
@WebServlet(name = "Buyer", urlPatterns = {"/cliente.html"})
public class Buyer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        //controllo se è in piedi la sessione
        if(session != null){
            //se sì, salvo su una lista i prodotti in vendita prendendoli dalla factory
            ArrayList<Prodotto> listaProdotti = AGFactory.getInstance().getListaProdotti();
            //se l'utente è loggato
            if(session.getAttribute("clienteLoggato") != null){
                Utente clienteLog = (Utente) session.getAttribute("clienteLoggato");
                request.setAttribute("cliente", clienteLog);
                //controllo sull'acquisto
                if(request.getParameter("idProdottoComprato") != null){
                    
                    int idProdotto = Integer.parseInt(request.getParameter("idProdottoComprato"));
                    Double conto = AGFactory.getInstance().getConto(clienteLog.getId());
                    Double prezzo = AGFactory.getInstance().getProdotto(idProdotto).getPrice();
                    int quantità = AGFactory.getInstance().getProdotto(idProdotto).getQuantity();
                    
                    if(prezzo < conto && quantità > 0){
                        request.setAttribute("acquistato", true);
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    } else {
                        request.setAttribute("nonAcquistato", true);
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    }
                // resoconto oggetto selezionato
                } else if(request.getParameter("idProdotto")!= null){
                    int idProdotto = Integer.parseInt(request.getParameter("idProdotto"));
                    Prodotto prodotto = AGFactory.getInstance().getProdotto(idProdotto);
                    request.setAttribute("dettagliProdotto", prodotto);
                    request.getRequestDispatcher("cliente.jsp").forward(request, response);
                //elenco oggetti in vendita
                } else {
                    request.setAttribute("listaProdotti", listaProdotti);
                    request.getRequestDispatcher("cliente.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("login_error", true);
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
            }
        } else {
                request.setAttribute("login_error", true);
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
