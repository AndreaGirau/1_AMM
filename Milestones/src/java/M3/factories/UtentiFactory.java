/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3.factories;

import M3.classes.Cliente;
import M3.classes.Utente;
import M3.classes.Venditore;
import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class UtentiFactory {
    
    private static UtentiFactory singleton;
    private String connectionString;

    public static UtentiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiFactory();
        }
        return singleton;
    }
    
    public UtentiFactory(){
    }
    
    private ArrayList<Utente> listaUtenti= new ArrayList<>();
    
    public ArrayList<Utente> getListaUtenti(){

            /*A seguire creo gli Utenti*/
            Venditore venditore_1 = new Venditore();
            venditore_1.setId(0);
            venditore_1.setUsername("AndreaGirau");
            venditore_1.setPassword("0");
            venditore_1.setContoId(0);
            listaUtenti.add(venditore_1);
            
            Venditore venditore_2 = new Venditore();
            venditore_2.setId(1);
            venditore_2.setUsername("EfisioGirau");
            venditore_2.setPassword("1");
            venditore_2.setContoId(1);
            listaUtenti.add(venditore_2);
            
            Cliente cliente_1 = new Cliente();
            cliente_1.setId(2);
            cliente_1.setUsername("HarryPotter");
            cliente_1.setPassword("2");
            cliente_1.setContoId(2);
            listaUtenti.add(cliente_1);
            
            Cliente cliente_2 = new Cliente();
            cliente_2.setId(3);
            cliente_2.setUsername("TomMarvoloRiddle");
            cliente_2.setPassword("3");
            cliente_2.setContoId(3);
            listaUtenti.add(cliente_2);
            
        return listaUtenti;
    }
    
    public Utente getUtenteById(int id){
        for(Utente user : listaUtenti){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
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
