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
public class Servico {
    private Integer id;
    private String codigo;
    private String descricao;
    private String homemmetro;
    private Cliente cliente;
    private List<Pedido> pedidos;

    public Servico(String codigo, String descricao, String homemmetro,
            Cliente clientes, List<Pedido> pedidos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.homemmetro = homemmetro;
        this.pedidos = pedidos;
    }
    
    public Servico(){
    }
    
    public void adicionarDados(String codigo, String des,String quant){
        this.codigo = codigo;
        this.descricao=des;
        this.homemmetro=quant;
    
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setHomemmetro(String homemmetro) {
        this.homemmetro = homemmetro;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public String getHomemmetro() {
        return homemmetro;
    }

     public List<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void adicionar (Object objeto){
        pedidos.add((Pedido)objeto);
    }
    
    public void remover(Object objeto){
        pedidos.remove((Pedido)objeto);
    } 

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Pedido getPedido() {
        return (Pedido) pedidos;
    }

    public void setPedido(Pedido pedido) {
        this.pedidos = pedidos;
    }   
    
    
    
    @Override
    public String toString(){
        return this.codigo + "  | " +this.descricao + "  |  " + this.homemmetro;
    }

    public Object getServico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
