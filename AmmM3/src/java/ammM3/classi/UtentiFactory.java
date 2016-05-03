/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ammM3.classi;

import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class UtentiFactory {
    // Attributi
    private static UtentiFactory singleton;
    public static UtentiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiFactory();
        }
        return singleton;
    }
    
    // Lista Venditori
    private ArrayList<Utente> listaVenditori = new ArrayList<Utente>();
    // Lista Clienti
    private ArrayList<Utente> listaClienti = new ArrayList<Utente>();
    
    /* Costruttore */
    private UtentiFactory() {

        // Venditore 1
        Venditore venditore1 = new Venditore();
        venditore1.setUsername("AndreaGirau");
        venditore1.setPassword("1234");
        venditore1.setNome("Andrea");
        venditore1.setCognome("Girau");
        venditore1.setId(0);
        listaVenditori.add(venditore1);
        // Venditore 2
        Venditore venditore2 = new Venditore();
        venditore2.setUsername("EfisioGirau");
        venditore2.setPassword("0000");
        venditore2.setNome("Efisio");
        venditore2.setCognome("Girau");
        venditore2.setId(1);
        listaVenditori.add(venditore2);
        
        // Cliente 1
        Cliente cliente1 = new Cliente();
        cliente1.setUsername("HarryPotter");
        cliente1.setPassword("7");
        cliente1.setNome("Harry");
        cliente1.setCognome("Potter");
        cliente1.setId(2);
        listaClienti.add(cliente1);
        // Cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setUsername("DracoMalfoy");
        cliente2.setPassword("9");
        cliente2.setNome("Draco");
        cliente2.setCognome("Malfoy");
        cliente2.setId(3);
        listaClienti.add(cliente2);
    }
    
    /* Metodi */
    public ArrayList<Utente> getListaVenditori(){
        return listaVenditori;
    }
    public Utente getVenditore(int id)
    {
        for(Utente u : listaVenditori)
        {
            if(u.getId() == id)
                return u;
        }
        
        return null;
    }
    
    public ArrayList<Utente> getListaClienti()
    {
        return listaClienti;
    }
    public Utente getCliente(int id)
    {
        for(Utente u : listaClienti)
        {
            if(u.getId() == id)
                return u;
        }
        
        return null;
    }
    
    public ArrayList<Utente> getUserList() 
    {
        ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
        
        listaUtenti.addAll(listaVenditori);
        listaUtenti.addAll(listaClienti);
        
        return listaUtenti;
    }
}
