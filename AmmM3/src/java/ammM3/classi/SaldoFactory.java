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
public class SaldoFactory {
    // Attributi
    private static SaldoFactory singleton;
    public static SaldoFactory getInstance() {
        if (singleton == null) {
            singleton = new SaldoFactory();
        }
        return singleton;
    }
    
    /* Costruttore */
    private SaldoFactory() {
              
        // Saldo        
        Saldo saldo = new Saldo();
        saldo.setSaldo(100.00);
    }
    
}
