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
import model.Empregado;

/**
 *
 * @author Alzemand
 */
public class daoEmpregado {

    private static List<Empregado> empregados = new ArrayList();

    public static void gravar(Empregado empregado) throws SQLException  {
        String sql = "Insert into empregado (nome, matricula) values ('" 
                + empregado.getNome() + "', '" + empregado.getMatricula()+ "');";     
        new daoBd().executarAtualizacao(sql);
    }

    public static void alterar(Empregado e) throws SQLException {
        String sql = "update empregado set nome='" + e.getNome() + "', matricula = '"+  e.getMatricula() + "' where id = " + e.getId().toString();
        new daoBd().executarAtualizacao(sql);
        
    }
    
    public static void excluir(Empregado empregado) throws SQLException {
        String sql = "delete from empregado where id = " + empregado.getId() + ";";
        new daoBd().executarAtualizacao(sql);
        
    }

    public static List<Empregado> getEmpregados() throws Exception {
        String sql = "select id, nome, matricula from empregado";
        daoBd bd = new daoBd();
        ResultSet rs = bd.executaConsulta(sql);
        
        empregados = new ArrayList();
        while (rs.next()) {
            Empregado e = new Empregado();
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setMatricula(rs.getString("matricula"));
            empregados.add(e);
        }
        
        bd.fecharBanco();
        
        return empregados;
    }

    public static Object getEmpregado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
