/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Alzemand
 */
public class daoCliente {

    private static List<Cliente> clientes = new ArrayList();

    public static void gravar(Cliente cliente) throws SQLException  {
        String sql = "Insert into cliente (nome, cgc) values ('" 
                + cliente.getNome() + "', '" + cliente.getCgc()+ "');";     
        new daoBd().executarAtualizacao(sql);
    }

    public static void alterar(Cliente c) throws SQLException {
        String sql = "update cliente set nome='" + c.getNome() + "', cgc = '"+  c.getCgc() + "' where id = " + c.getId().toString();
        new daoBd().executarAtualizacao(sql);
        
    }
    
    public static void excluir(Cliente cliente) throws SQLException {
        String sql = "delete from cliente where id = " + cliente.getId() + ";";
        new daoBd().executarAtualizacao(sql);
        
    }

    public static List<Cliente> getClientes() throws Exception {
        String sql = "select id, nome, cgc from cliente";
        daoBd bd = new daoBd();
        ResultSet rs = bd.executaConsulta(sql);
        
        clientes = new ArrayList();
        while (rs.next()) {
            Cliente c = new Cliente();
            c.setId(rs.getInt("id"));
            c.setNome(rs.getString("nome"));
            c.setCgc(rs.getString("cgc"));
            clientes.add(c);
        }
        
        bd.fecharBanco();
        
        return clientes;
    }




}
