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
public class Utente {
    
    private int id;
    private String username;
    private String password;
    private int contoId;
    private int tipo; //1=venditore 2=utente

    public Utente(){
        
        id = 0;
        username = "";
        password = "";
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the contoId
     */
    public int getContoId() {
        return contoId;
    }

    /**
     * @param contoId the contoId to set
     */
    public void setContoId(int contoId) {
        this.contoId = contoId;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}
