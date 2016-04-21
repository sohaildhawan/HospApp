package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mujistapha
 */
public class DbConnect {
    
    public Connection getConnection() throws SQLException{
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ehr", "root", "mastech2016");
        return conn;
    }

    public String LoginInterface(String username) {
        return username;
    }

    public String LoginIdentity(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int Login(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}



