/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3.servlets;

import M3.classes.Utente;
import M3.factories.AGFactory;
/*import M3.factories.ContoFactory;
import M3.factories.ProdottiFactory;
import M3.factories.UtentiFactory;*/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "Login", urlPatterns = {"/login.html"}, loadOnStartup = 0)
public class Login extends HttpServlet {

    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DB_CLEAN_PATH = "../../web/WEB-INF/db/ammdb";
    private static final String DB_BUILD_PATH = "WEB-INF/db/ammdb";
    
    @Override 
    public void init(){

        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {

            Class.forName(JDBC_DRIVER);

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }

        AGFactory.getInstance().setConnectionString(dbConnection);      
    }
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
        //creo la sessione
        HttpSession session = request.getSession(true);
        
        if(session.getAttribute("utenteLoggato") != null){
            if(request.getParameter("logout") != null){
                session.invalidate();
            }else{
                Utente user = (Utente)session.getAttribute("utenteLoggato");
                if(user.getTipo() == 1){
                    session.setAttribute("venditoreLoggato", user);
                    response.sendRedirect("venditore.html");
                }else if(user.getTipo() == 2){
                    session.setAttribute("clienteLoggato", user);
                    response.sendRedirect("cliente.html");
                }
            }
        }
        if(request.getParameter("submit") != null)
        {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            Utente u = AGFactory.getInstance().getUtente(username, password);
            
            if(username.equals(u.getUsername()) && password.equals(u.getPassword())){
                session.setAttribute("utenteLoggato", u);
                    if(u.getTipo() == 1){
                        session.setAttribute("venditoreLoggato", u);
                        response.sendRedirect("venditore.html");
                        return;
                    }else if(u.getTipo() == 2){
                        session.setAttribute("clienteLoggato", u);
                        response.sendRedirect("cliente.html");
                        return;
                    }                    
            }
            else{
                request.setAttribute("login_failed", true);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
        
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
