/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3.factories;

import M3.classes.Conto;
import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class ContoFactory {
 
    private static ContoFactory singleton;
    private String connectionString;

    public static ContoFactory getInstance() {
        if (singleton == null) {
            singleton = new ContoFactory();
        }
        return singleton;
    }

    private ContoFactory() {
    }
    
    private ArrayList<Conto> listaConti = new ArrayList<>();;
    
    public ArrayList<Conto> getListaConti() {
     
            /*A seguire creo i conti*/
            Conto conto_1 = new Conto();
            conto_1.setId(0);
            conto_1.setBalance(130.00);
            listaConti.add(conto_1);
            
            Conto conto_2 = new Conto();
            conto_2.setId(1);
            conto_2.setBalance(5.00);
            listaConti.add(conto_2);
            
            Conto conto_3 = new Conto();
            conto_3.setId(2);
            conto_3.setBalance(57.45);
            listaConti.add(conto_3);
            
            Conto conto_4 = new Conto();
            conto_4.setId(3);
            conto_4.setBalance(2.54);
            listaConti.add(conto_4);

       
        return listaConti;
    }

    public Conto getContoById(int id) {
        for (Conto conto : listaConti) {
            if (conto.getId() == id) {
                return conto;
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
