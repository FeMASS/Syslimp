/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alzemand
 */


public class Pedido {
    private Integer id;
    private String dia;
    private String metragem;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the metragem
     */
    public String getMetragem() {
        return metragem;
    }

    /**
     * @param metragem the metragem to set
     */
    public void setMetragem(String metragem) {
        this.metragem = metragem;
    }

    /**
     * @return the telefone
     */


    @Override
    public String toString() {
        return "Pedido dia: " + this.dia;
    }
    
    
}
