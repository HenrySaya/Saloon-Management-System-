/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.SalonDatabase;

import java.sql.*;
public class DatabaseConnection{

private static final String host = "localhost";
    private static final String port = "3306";
    private static final String username = "root";
    private static final String password = "1234";
    private static final String database = "salondatabase";
            
    
     
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?useUnicode=yes&characterEncoding=UTF-8", username, password);
        } catch (SQLException e) {
            // Handle any errors that might occur when establishing a connection to the database.
            e.printStackTrace();
        }
        return con;
    }

       
        
    }
    
    
    
    

