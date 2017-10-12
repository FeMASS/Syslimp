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
import model.Pedido;

/**
 *
 * @author acg
 */
public class daoPedido {

    private static List<Pedido> pedidos = new ArrayList();

    public static void gravar(Pedido pedido) throws SQLException  {
        String sql = "Insert into pedido (dia, metragem) values ('" 
                + pedido.getDia() + "', '" + pedido.getMetragem()+ "');";     
        new daoBd().executarAtualizacao(sql);
    }

    public static void alterar(Pedido p) throws SQLException {
        String sql = "update pedido set dia='" + p.getDia() + "', metragem = '"+  p.getMetragem() + "' where id = " + p.getId().toString();
        new daoBd().executarAtualizacao(sql);
        
    }
    
    public static void excluir(Pedido pedido) throws SQLException {
        String sql = "delete from pedido where id = " + pedido.getId() + ";";
        new daoBd().executarAtualizacao(sql);
        
    }

    public static List<Pedido> getPedidos() throws Exception {
        String sql = "select id, dia, metragem from pedido";
        daoBd bd = new daoBd();
        ResultSet rs = bd.executaConsulta(sql);
        
        pedidos = new ArrayList();
        while (rs.next()) {
            Pedido p = new Pedido();
            p.setId(rs.getInt("id"));
            p.setDia(rs.getString("dia"));
            p.setMetragem(rs.getString("metragem"));
            pedidos.add(p);
        }
        
        bd.fecharBanco();
        
        return pedidos;
    }




}
