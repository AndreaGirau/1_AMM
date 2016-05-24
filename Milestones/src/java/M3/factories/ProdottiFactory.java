/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3.factories;

import M3.classes.Prodotto;
import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class ProdottiFactory {
    
    private static ProdottiFactory singleton;
    private String connectionString;

    public static ProdottiFactory getInstance() {
        if (singleton == null) {
            singleton = new ProdottiFactory();
        }
        return singleton;
    }
    
    private ProdottiFactory() {

    }
    
    private ArrayList<Prodotto> listaProdotti = new ArrayList<>();
            
    public ArrayList<Prodotto> getListaProdotti() {

            Prodotto prodotto_1 = new Prodotto();
            prodotto_1.setName("Casper(1995)- DVD");
            prodotto_1.setImgUrl("img/Film/casper_dvd.jpg");
            prodotto_1.setDescription("...");
            prodotto_1.setPrice(13.99);
            prodotto_1.setQuantity(18);
            prodotto_1.setId(0);
            prodotto_1.setVenditoreId(0);
            listaProdotti.add(prodotto_1);
            
            Prodotto prodotto_2 = new Prodotto();
            prodotto_2.setName("Hercules(1996)- DVD");
            prodotto_2.setImgUrl("img/Film/hercules_dvd.jpg");
            prodotto_2.setDescription("...");
            prodotto_2.setPrice(13.99);
            prodotto_2.setQuantity(7);
            prodotto_2.setId(1);
            prodotto_2.setVenditoreId(0);
            listaProdotti.add(prodotto_2);
            
            Prodotto prodotto_3 = new Prodotto();
            prodotto_3.setName("American Sniper(2015)- Blu-Ray");
            prodotto_3.setImgUrl("img/Film/american_sniper_blu_ray.jpg");
            prodotto_3.setDescription("...");
            prodotto_3.setPrice(18.99);
            prodotto_3.setQuantity(21);
            prodotto_3.setId(2);
            prodotto_3.setVenditoreId(0);
            listaProdotti.add(prodotto_3);
            
            Prodotto prodotto_4 = new Prodotto();
            prodotto_4.setName("The Imitation Game(2015)- Blu-Ray");
            prodotto_4.setImgUrl("img/Film/the_imitation_game.jpg");
            prodotto_4.setDescription("...");
            prodotto_4.setPrice(18.99);
            prodotto_4.setQuantity(9);
            prodotto_4.setId(3);
            prodotto_4.setVenditoreId(0);
            listaProdotti.add(prodotto_4);
            
            Prodotto prodotto_5 = new Prodotto();
            prodotto_5.setName("Harry Potter (saga completa)- Blu-Ray");
            prodotto_5.setImgUrl("img/Film/harry_potter_cofanetto.jpg");
            prodotto_5.setDescription("...");
            prodotto_5.setPrice(19.89);
            prodotto_5.setQuantity(11);
            prodotto_5.setId(4);
            prodotto_5.setVenditoreId(0);
            listaProdotti.add(prodotto_5);
            
            Prodotto prodotto_6 = new Prodotto();
            prodotto_6.setName("Ritorno Al Futuro (La Trilogia)- Blu-Ray");
            prodotto_6.setImgUrl("img/Film/ritorno_al_futuro_trilogia.jpeg");
            prodotto_6.setDescription("...");
            prodotto_6.setPrice(18.89);
            prodotto_6.setQuantity(5);
            prodotto_6.setId(5);
            prodotto_6.setVenditoreId(0);
            listaProdotti.add(prodotto_6);
            
            Prodotto prodotto_7 = new Prodotto();
            prodotto_7.setName("1984 - Orwell");
            prodotto_7.setImgUrl("img/Libri/1984_book.jpg");
            prodotto_7.setDescription("...");
            prodotto_7.setPrice(8.99);
            prodotto_7.setQuantity(13);
            prodotto_7.setId(6);
            prodotto_7.setVenditoreId(0);
            listaProdotti.add(prodotto_7);
            
            Prodotto prodotto_8 = new Prodotto();
            prodotto_8.setName("Il Piccolo Principe - Antoine de Saint-Exupéry");
            prodotto_8.setImgUrl("img/Libri/il_piccolo_principe_book.jpeg");
            prodotto_8.setDescription("...");
            prodotto_8.setPrice(5.99);
            prodotto_8.setQuantity(26);
            prodotto_8.setId(7);
            prodotto_8.setVenditoreId(0);
            listaProdotti.add(prodotto_8);
            
            Prodotto prodotto_9 = new Prodotto();
            prodotto_9.setName("Ventimila Leghe Sotto I Mari - Verne");
            prodotto_9.setImgUrl("img/Libri/ventimila_leghe_sotto_i_mari_book.jpg");
            prodotto_9.setDescription("...");
            prodotto_9.setPrice(6.89);
            prodotto_9.setQuantity(4);
            prodotto_9.setId(8);
            prodotto_9.setVenditoreId(0);
            listaProdotti.add(prodotto_9);
            
            Prodotto prodotto_10 = new Prodotto();
            prodotto_10.setName("Harry Potter(cofanetto 8 libri)- J.K. Rowling");
            prodotto_10.setImgUrl("img/Libri/harry_potter_cofanetto_books.jpg");
            prodotto_10.setDescription("...");
            prodotto_10.setPrice(54.89);
            prodotto_10.setQuantity(7);
            prodotto_10.setId(9);
            prodotto_10.setVenditoreId(0);
            listaProdotti.add(prodotto_10);
            
            Prodotto prodotto_11 = new Prodotto();
            prodotto_11.setName("Il Signore Degli Anelli(trilogia)- J.R.R. Tolkien");
            prodotto_11.setImgUrl("img/Libri/il_signore_degli_anelli_trilogia.jpeg");
            prodotto_11.setDescription("...");
            prodotto_11.setPrice(13.89);
            prodotto_11.setQuantity(13);
            prodotto_11.setId(10);
            prodotto_11.setVenditoreId(0);
            listaProdotti.add(prodotto_11);
            
            Prodotto prodotto_12 = new Prodotto();
            prodotto_12.setName("Collana Doni Della Morte - Harry Potter");
            prodotto_12.setImgUrl("img/Gadgets/collana_doni_della_morte.jpg");
            prodotto_12.setDescription("...");
            prodotto_12.setPrice(7.50);
            prodotto_12.setQuantity(15);
            prodotto_12.setId(11);
            prodotto_12.setVenditoreId(0);
            listaProdotti.add(prodotto_12);
            
            Prodotto prodotto_13 = new Prodotto();
            prodotto_13.setName("Unico Anello - Il Signore Degli Anelli");
            prodotto_13.setImgUrl("img/Gadgets/unico_signore_degli_anelli.jpg");
            prodotto_13.setDescription("...");
            prodotto_13.setPrice(9.99);
            prodotto_13.setQuantity(23);
            prodotto_13.setId(12);
            prodotto_13.setVenditoreId(0);
            listaProdotti.add(prodotto_13);
            
            Prodotto prodotto_14 = new Prodotto();
            prodotto_14.setName("Costume Spiderman");
            prodotto_14.setImgUrl("img/Gadgets/spiderman_costume.jpg");
            prodotto_14.setDescription("...");
            prodotto_14.setPrice(19.89);
            prodotto_14.setQuantity(6);
            prodotto_14.setId(13);
            prodotto_14.setVenditoreId(0);
            listaProdotti.add(prodotto_14);

        return listaProdotti;
    }
    
    public Prodotto getProdottoById(int id){
        for(Prodotto prodotto : listaProdotti){
            if(prodotto.getId() == id){
                return prodotto;
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
