/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Parametros;
/**
 *
 * @author Alzemand
 */
public class daoBd {

    private Statement statement;
    
    private Connection conectarBanco() throws SQLException {
        Parametros parametros;
        parametros = dao.daoParametros.getParametros();
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://" + parametros.getLOCALBANCO() + "/"
        + parametros.getNOMEBANCO() + "?autoReconnect=true&useSSL=false", parametros.getUSUARIO(), parametros.getSENHA());
        return con;
    }

    public void executarAtualizacao(String sql) throws SQLException {
        try (Statement st = conectarBanco().createStatement()) {
            st.executeUpdate(sql);
        }

    }

    public ResultSet executaConsulta(String sql) throws SQLException {
        statement = conectarBanco().createStatement();
        ResultSet r = statement.executeQuery(sql);
        return r;
    }
    
    
    public void fecharBanco() {
        try {
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(daoBd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
