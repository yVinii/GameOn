/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexões;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Macrr
 */
public class MySQL {
    
    //atributos de conexão com o banco
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL
    private ResultSet resultSet;
    
    /*private String servidor = "remotemysql.com";
    private String nomeDoBanco = "G302hXJlCo";
    private String usuario = "G302hXJlCo";
    private String senha = "gd635GMaX9";*/
    
    private String servidor = "localhost:3307";
    private String nomeDoBanco = "GameOn";
    private String usuario = "root";
    private String senha = "usbw";
    
    //Construtor    
    public MySQL(){
    
    }
    
    public MySQL(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
        
    // =========================================
    public void conectaBanco(){
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            String strCon = "jdbc:mysql://" + servidor + "/" + nomeDoBanco+"?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC";
            conn = DriverManager.getConnection(strCon, usuario, senha);
            //conn = DriverManager.getConnection("jdbc:mysql://localhost3306/banco_loja", "root", "root");
            
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    
    public boolean fechaBanco(){
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
    
    public int insertSQL(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());            

            // Definido o Statement, executamos a query no banco de dados
            status = this.getStatement().executeUpdate(SQL);            
            System.out.println(status);
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }
    
    public void executarSQL(String sql) {
        try {
            this.statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);

//            while (this.getResultSet().next()) {
//                System.out.println(this.getResultSet().getInt(1));
//            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
    
    public boolean updateSQL(String pSQL){
        int status = 0;
        try {            
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            status = getStatement().executeUpdate(pSQL);
            System.out.println(status);
            if (status == 0) {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
