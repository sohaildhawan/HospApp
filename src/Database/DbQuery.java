/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mujistapha
 */
public class DbQuery {
    DbConnect db = new DbConnect();
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Connection con;
    
    public int PatientSearch(String id) throws SQLException{
        con = db.getConnection();
        String str = "select * from patients where pid like '"+ id +"'";
        pstmt=con.prepareStatement(str);
        int count = pstmt.executeUpdate();
        return count;
    }
    
    public String PatientInfo(String id) throws SQLException{
        String name = null;
        String o = null;
        String d = null;
        String g = null;
        con = db.getConnection();
        int count = 0;
        String str = "select CONCAT(fname, ' ', lname) as name, occupation, dob, gender from patients where pid like '"+ id +"'";
        pstmt=con.prepareStatement(str);
        rs = pstmt.executeQuery();
        while(rs.next()){
               name = rs.getString("name");
               o = rs.getString("occupation");
               d = rs.getString("dob");
               g = rs.getNString("gender");
            }
        return name + "@" + o + "@" + d + "@" + g;
    }
    
    public String price(int id) throws SQLException{
        String price = null;
        con = db.getConnection();
        String str = "select price from priceTable where itemId like '"+ id +"'";
        pstmt=con.prepareStatement(str);
        rs = pstmt.executeQuery();
        while(rs.next()){
               price = rs.getString("price");
            }
        return price;
    }
    
}
