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
public class Prodotto {
    
    private int id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String imgUrl;
    private int venditoreId;
    
    public Prodotto() {
        
         this.id=99;
         this.name="";
         this.description="...";
         this.price=0.00;
         this.quantity=0;
         this.imgUrl="";
         this.venditoreId=0;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        Double prezzo = Math.floor(this.price*100);
        prezzo = prezzo/100;
        return prezzo;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl the imgUrl to set
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return the venditoreId
     */
    public int getVenditoreId() {
        return venditoreId;
    }

    /**
     * @param venditoreId the venditoreId to set
     */
    public void setVenditoreId(int venditoreId) {
        this.venditoreId = venditoreId;
    }

    

}
