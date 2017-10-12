/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Edilson
 */
public class Alocacao {

    public static void setCodigo(Servico servico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Integer id;
    private String descricao;
    private Empregado empregado;
    private Servico servico;
        
    public Alocacao(String descricao, Empregado Empregado, Servico Servico) {
        this.descricao = descricao;
    }

    public Alocacao(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Alocacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String toString(){
        return this.descricao;
    
    }
    
        public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado Empregado) {
        this.empregado = empregado;
    }
    
    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico Servico) {
        this.servico = servico;
    }
    
}
