/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 */
public class Funcao {
    private Integer id;
    private String codigo;
    private String funcao;
    private String homemmetro;
    private String salario;
    private String instrucao;
    private Cliente cliente;


    public Funcao(String codigo, String funcao, String homemmetro, String salario, String instrucao,
            Cliente clientes) {
        this.codigo = codigo;
        this.funcao = funcao;
        this.homemmetro = homemmetro;
        this.salario = salario;
        this.instrucao = instrucao;

    }
    
    public Funcao(){
    }
    
    public void Adicionar(String codigo, String func, String quant, String sal, String inst){
        this.codigo = codigo;
        this.funcao=func;
        this.homemmetro=quant;
        this.salario = sal;
        this.instrucao = inst;
    
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setHomemmetro(String homemmetro) {
        this.homemmetro = homemmetro;
    }

    public String getDescricao() {
        return funcao;
    }

    public String getHomemmetro() {
        return homemmetro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
       
    
    
    @Override
    public String toString(){
        return "Código: " +  this.codigo + "  | " +this.funcao + "  | "  +this.cliente + "  | " + this.homemmetro;
    }

    public void setEmpregado(Empregado empregado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





    
    
}
