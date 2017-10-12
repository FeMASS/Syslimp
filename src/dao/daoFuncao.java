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
import model.Funcao;




/**
 *
 * @author Alzemand
 */
public class daoFuncao {
    
    private static List <Funcao> servicos = new ArrayList(); 
    
    public static void adicionar (Funcao funcao) throws SQLException{
        servicos.add(funcao);
        String sql; 
        sql = "insert into funcao (codigo, funcao, homemmetro, salario, instrucao, funcionario) values ('" 
                + funcao.getCodigo() + "', '" + funcao.getFuncao() + "', '" + funcao.getHomemmetro() + "', '" + funcao.getSalario() + "', '" + funcao.getInstrucao() + "', '" + funcao.getCliente().getId().toString() +  "');";
        new daoBd().executarAtualizacao(sql);
    }
    
    public static void remover (Funcao funcao) throws SQLException{
        servicos.remove(funcao);
        String sql = "delete from funcao where codigo = " + funcao.getCodigo() + ";";
        new daoBd().executarAtualizacao(sql);
    }
    public static List<Funcao> getServicos() throws SQLException{
        String sql = "select id, codigo, funcao, homemmetro, salario, instrucao from funcao";
        daoBd bd = new daoBd();
        ResultSet rs = bd.executaConsulta(sql);
        
        servicos = new ArrayList();
        while (rs.next()) {
            Funcao s = new Funcao();
            s.setId(rs.getInt("id"));
            s.setCodigo(rs.getString("codigo"));
            s.setSalario(rs.getString("salario"));
            s.setInstrucao(rs.getString("instrucao"));
            servicos.add(s);
        }
        
        bd.fecharBanco();
        
        return servicos;
    }
}
