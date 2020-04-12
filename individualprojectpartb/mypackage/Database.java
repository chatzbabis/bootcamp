/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chatz
 */
public class Database {
     private static final String DB_URL = "localhost:3306";
    private static final String FULL_DB_URL = "jdbc:mysql://" + DB_URL + "/individualprojectpartb?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWD = "root";
    private static Connection connection=null;
    private static Statement statement=null;
    private static ResultSet resultSet = null;
    private static PreparedStatement preparedStatement=null;

   

    public Database() {
        getConnection();
    }

    
    
    
    
    public static ResultSet getResultSet(String query) {
         try {
             setStatement();
             resultSet = statement.executeQuery(query);
             return resultSet;
         } catch (SQLException ex) {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }

    public static void setResultSet(ResultSet resultSet) {
        Database.resultSet = resultSet;
    }

    public static Statement getStatement() {
         
             
             return statement;
        
    }

    public static void setStatement() {
         try {
             statement = connection.createStatement();
         } catch (SQLException ex) {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
     public  void setStatementNonStatic() {
         try {
             statement = connection.createStatement();
         } catch (SQLException ex) {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

//    public static Connection getConnection2() throws SQLException {
//     connection = DriverManager.getConnection(FULL_DB_URL, DB_USER, DB_PASSWD);
//     return connection;
//    }
    
    public static Connection getConnection() {
         try {
             connection = DriverManager.getConnection(FULL_DB_URL, DB_USER, DB_PASSWD);
             return connection;
         } catch (SQLException ex) {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
         
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
    public static ResultSet getOneResult(String tableName,int id){
        try {
             setStatement();
             String query="Select * from `"+tableName+"` where `id`="+id;
             resultSet = statement.executeQuery(query);
             return resultSet;
         } catch (SQLException ex) {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
        
    }
    public static ResultSet getOneResultByField(String tableName,String fieldName,String fieldValue ){
        try {
             setStatement();
             String query="Select * from `"+tableName+"` where `"+fieldName+"`="+fieldValue;
             resultSet = statement.executeQuery(query);
             return resultSet;
         } catch (SQLException ex) {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    
    }
    
     public static PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public static void setPreparedStatement(String sql) {
         try {
             preparedStatement = connection.prepareStatement(sql);
         } catch (SQLException ex) {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
}
