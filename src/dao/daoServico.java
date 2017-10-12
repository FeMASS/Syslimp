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
import model.Funcao;
import model.Pedido;
import model.Servico;



/**
 *
 * @author Alzemand
 */
public class daoServico {
    
    private static List <Servico> servicos = new ArrayList(); 
    
    public static void adicionar (Servico servico) throws SQLException{
        servicos.add(servico);
        String sql; 
        sql = "insert into servico (codigo, descricao, homemmetro, cliente) values ('" 
                + servico.getCodigo() + "', '" + servico.getDescricao() + "', '" + servico.getHomemmetro() + "', '" + servico.getCliente().getId().toString() +  "', '" + servico.getPedido().getId().toString() +   "');";
        new daoBd().executarAtualizacao(sql);
    }
    
    public static void remover (Servico servico) throws SQLException{
        servicos.remove(servico);
        String sql = "delete from servico where codigo = " + servico.getCodigo() + ";";
        new daoBd().executarAtualizacao(sql);
    }
    public static List<Servico> getServicos() throws SQLException{
        String sql = "select id, codigo, descricao, homemmetro from servico";
        daoBd bd = new daoBd();
        ResultSet rs = bd.executaConsulta(sql);
        
        servicos = new ArrayList();
        while (rs.next()) {
            Servico s = new Servico();
            s.setId(rs.getInt("id"));
            s.setCodigo(rs.getString("codigo"));
            s.setDescricao(rs.getString("descricao"));
            s.setHomemmetro(rs.getString("homemmetro"));
            servicos.add(s);
        }
        
        bd.fecharBanco();
        
        return servicos;
    }

    public static void adicionar(Funcao funcao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
