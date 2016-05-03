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
public class ProdottiFactory {
    // Attributi
    private static ProdottiFactory singleton;
    public static ProdottiFactory getInstance() {
        if (singleton == null) {
            singleton = new ProdottiFactory();
        }
        return singleton;
    }
    // Lista Prodotti
    private ArrayList<Prodotti> listaProdotti = new ArrayList<Prodotti>();
    
    /* Costruttore */
    private ProdottiFactory() {
              
        // Prodotti         
        Prodotti dvd_1 = new Prodotti();
        dvd_1.setNome("Casper");
        dvd_1.setId(10);
        dvd_1.setQuantità(18);
        dvd_1.setPrezzo(13.99);
        listaProdotti.add(dvd_1); //sarà da fare per tutti i prodotti
        
    }
    
    /* Metodi */
    public ArrayList<Prodotti> getListaProdotti(){
        return listaProdotti;
    }
    public Prodotti getProdotti(int id)
    {
        for(Prodotti u : listaProdotti)
        {
            if(u.getId() == id)
                return u;
        }
        
        return null;
    }
    
    public void addProdotto(Prodotti newProdotto){
        this.listaProdotti.add(newProdotto);
    }
}
