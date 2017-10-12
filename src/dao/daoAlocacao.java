/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Alocacao;
import model.Empregado;
import model.Servico;
       

/**
 *
 * @author Alzemand
 */
public class daoAlocacao {

     private static List<Alocacao> alocacoes = new ArrayList();

    public static void adicionar(Alocacao alocacao) throws SQLException {
                String sql = "Insert into alocacao (descricao, empregado, servico) values ('" 
                + alocacao.getDescricao() + "', '" + alocacao.getEmpregado().getId().toString() + "', '" + alocacao.getServico().getId().toString() + "');";     
        new daoBd().executarAtualizacao(sql);
    }

    public static void remover(Alocacao alocacao) throws SQLException {
        String sql = "delete from alocacao where id = " + alocacao.getId() + ";";
        new daoBd().executarAtualizacao(sql);
    }

    public static List<Alocacao> getAlocacoes() {
        return alocacoes;
    }

    public static void adicionar(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
