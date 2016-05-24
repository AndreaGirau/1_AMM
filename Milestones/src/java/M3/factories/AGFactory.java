/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3.factories;
/*
 * questa è la factory in cui implementerò i metodi per prelevare dal database
 * milestone 4
 */
import M3.classes.Prodotto;
import M3.classes.Utente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class AGFactory {
    
    private static AGFactory singleton;
    private String connectionString;

    public static AGFactory getInstance() {
        if (singleton == null) {
            singleton = new AGFactory();
        }
        return singleton;
    }
    
    public AGFactory(){
    }
    
    /* Metodi */
    public Utente getUtente(String username, String password)
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ammdb", "andreagirau", "andreagirau");
            // sql command
            String query = "select * from Utente where " + "password = ? and username = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            // dati
            stmt.setString(1, password); //setto trmite la query la password
            stmt.setString(2, username); //e lo username
         
            ResultSet set = stmt.executeQuery();
            
            if(set.next())
            {
                Utente utente = new Utente();
                utente.setId(set.getInt("id"));
                utente.setUsername(set.getString("username"));
                utente.setPassword(set.getString("password"));
                utente.setTipo(set.getInt("tipo"));
                
                stmt.close();
                conn.close();
                
                return utente;
            }
        }catch(SQLException e){
            
        }
        return null;
    }
    
    public void setProdotto(String name, String description, Double price,
                            Integer quantity, String imgUrl, int venditoreId){
        try
        {
            //non facendomi connettere con l'override della init ho inserito direttamente la stringa
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ammdb", "andreagirau", "andreagirau");
            // sql command
            String query = "inserti into Prodotto " + 
                "name = ? and description = ? and price = ? and quantity= ? and imgUrl = ? and venditoreId = ?";
            PreparedStatement stmt;
        
            conn.setAutoCommit(false);
            // dati
            
            stmt=conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, description);
            stmt.setDouble(3, price);
            stmt.setInt(4, quantity);
            stmt.setString(5, imgUrl);
            stmt.setInt(6, venditoreId);
            
            conn.commit();
           
        }catch(SQLException e){
            
        }
    }
    
    public Prodotto getProdotto(int id){
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ammdb", "andreagirau", "andreagirau");
            // sql command
            String query = "select * from Prodotto where " + "id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            // dati
            //setto trmite la query gli attributi del prodotto
            stmt.setInt(1, id);
            
            ResultSet set = stmt.executeQuery();
            
            if(set.next())
            {
                Prodotto prodotto = new Prodotto();
                prodotto.setId(set.getInt("id"));
                prodotto.setName(set.getString("name"));
                prodotto.setDescription(set.getString("description"));
                prodotto.setPrice(set.getDouble("price"));
                prodotto.setQuantity(set.getInt("quantity"));
                prodotto.setImgUrl(set.getString("imgUrl"));
                prodotto.setVenditoreId(set.getInt("venditoreId"));
                
                stmt.close();
                conn.close();
                
                return prodotto;
            }
        }catch(SQLException e){
            
        }
        return null;
    }
    
    public Double getConto(int contoId)
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ammdb", "andreagirau", "andreagirau");
            // sql command
            String query = "select balance from Conto where " + "id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            // dati
            stmt.setInt(1, contoId); //stramite la FOREIGN KEY dell'utente salvo il saldo
         
            ResultSet set = stmt.executeQuery();
            
            if(set.next())
            {
                Double saldo = set.getDouble("balance");

                stmt.close();
                conn.close();
                
                return saldo;
            }
        }catch(SQLException e){
            
        }
        return null;
    }
    
    public ArrayList<Prodotto> getListaProdotti(){
    
    ArrayList<Prodotto> listaProdotti = new ArrayList<Prodotto>();
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ammdb", "andreagirau", "andreagirau");
            Statement stmt = conn.createStatement();
            
            String query = "select * from Prodotto";
            
            ResultSet set = stmt.executeQuery(query);
            
            
            while(set.next()) 
            {
                Prodotto prodotto = new Prodotto();
                prodotto.setId(set.getInt("id"));
                prodotto.setName(set.getString("name"));
                prodotto.setDescription(set.getString("description"));
                prodotto.setPrice(set.getDouble("price"));
                prodotto.setQuantity(set.getInt("quantity"));
                prodotto.setImgUrl(set.getString("imgUrl"));
                prodotto.setVenditoreId(set.getInt("venditoreId"));
                
                listaProdotti.add(prodotto);
            }
            
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) 
        {
        }
        return listaProdotti;
}      
   
    /*
    * task3 Milestone 4
    */
    public void setConnectionString(String s){
    	this.connectionString = s;
    }

    public String getConnectionString(){
    	return this.connectionString;
    }
}
