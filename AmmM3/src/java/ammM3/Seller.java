/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ammM3;

import ammM3.classi.Prodotti;
import ammM3.classi.ProdottiFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
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
@WebServlet(name = "Seller", urlPatterns = {"/Seller"})
public class Seller extends HttpServlet {

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
        
        HttpSession session = request.getSession(false);
        
        if(session.getAttribute("loggedIn").equals(true) &&
           session.getAttribute("logVenditore").equals(true)){
            //esiste una sessione di un venditore, aggiungiamo il prodotto
            if(request.getParameter("Submit") != null)
                {
                    Prodotti nuovoProdotto = new Prodotti();
                    nuovoProdotto.setNome(request.getParameter("NomeOggetto"));
                    nuovoProdotto.setUrlFoto(request.getParameter("FotoOggetto"));
                    nuovoProdotto.setDescription(request.getParameter("DescrizioneOggetto"));
                    nuovoProdotto.setPrezzo(Double.parseDouble(request.getParameter("Prezzo")));
                    nuovoProdotto.setQuantità(Integer.parseInt(request.getParameter("Quantità")));
                    
                    Random rand = new Random();
                    nuovoProdotto.setId(rand.nextInt(50));
                    
                    ProdottiFactory.getInstance().addProdotto(nuovoProdotto);
                    session.setAttribute("listaProdotti", ProdottiFactory.getInstance().getListaProdotti());
                    session.setAttribute("NewProdotto", nuovoProdotto);
                }
            request.getRequestDispatcher("confermaInserimento.jsp").forward(request, response);
        }
        request.getRequestDispatcher("venditore.jsp").forward(request, response);


        
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
