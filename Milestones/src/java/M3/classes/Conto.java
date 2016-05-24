/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3.classes;

/**
 *
 * @author andrea
 */
public class Conto {
    
    private int id;
    private double balance;
    
    public Conto() {
        this.id = 99;
        this.balance = 0.00;
    }
     
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * purchase return the balance - the price of the purchase
     */
    void purchase(double price){
        balance -= price;
    }

}
