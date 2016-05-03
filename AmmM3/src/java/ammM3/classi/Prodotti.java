/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ammM3.classi;

/**
 *
 * @author andrea
 */
public class Prodotti {
    
    private int id;
    private String nome;
    private String urlFoto;
    private Integer quantità;
    private String description;
    private Double prezzo;
    
    public Prodotti()
    {
        id = 0;
        nome = "";
        quantità = 0;
        description="";
        prezzo= 0.0;
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the quantità
     */
    public Integer getQuantità() {
        return quantità;
    }

    /**
     * @param quantità the quantità to set
     */
    public void setQuantità(Integer quantità) {
        this.quantità = quantità;
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
     * @return the prezzo
     */
    public Double getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the price to set
     */
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return the urlFoto
     */
    public String getUrlFoto() {
        return urlFoto;
    }

    /**
     * @param urlFoto the urlFoto to set
     */
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    
}
