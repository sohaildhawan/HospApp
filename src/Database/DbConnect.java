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
//        Properties connectionProps = new Properties();
//        connectionProps.put("user", this.userName);
//        connectionProps.put("password", this.password);
//
//        if (this.dbms.equals("mysql")) {
//            conn = DriverManager.getConnection("jdbc:" + this.dbms + "://" +
//                   this.serverName + ":" + this.portNumber + "/", connectionProps);
//        } else if (this.dbms.equals("derby")) {
//            conn = DriverManager.getConnection("jdbc:" + this.dbms + ":" +
//                       this.dbName + ";create=true",connectionProps);
//        }
//        System.out.println("Connected to database");
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



