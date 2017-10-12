/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * 
 */


public class Cliente {
    private Integer id;
    private String nome;
    private String cgc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
     * @return the cgc
     */
    public String getCgc() {
        return cgc;
    }

    /**
     * @param cgc the cgc to set
     */
    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    /**
     * @return the telefone
     */


    @Override
    public String toString() {
        return "Nome: " + this.nome + ", cgc: " + this.cgc;
    }  
    
    
}
