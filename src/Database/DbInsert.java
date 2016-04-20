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
public class DbInsert {
    
    DbConnect db = new DbConnect();
    
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    
    public void NewPatient(String fname, String lname, String BloodGroup, String dob, 
                           String address, String gender, String pnumber, String occupation, 
                           String nok, String knownSickness, String other, String fno, String image) throws SQLException{
        Connection con = db.getConnection();
        String str =  "insert into patient values('PId.nextval', '"+ fname +"' , '"+ lname + "', '"
                      + gender + "', '"+ pnumber + "', '"+ address + "', '"+ BloodGroup + "', '"
                      + occupation + "' , '" + dob + "', '"+ nok + "', '"+ knownSickness + "', '"
                      + other + "', '" + fno + "', '" + image + "')";
        pstmt = con.prepareStatement(str);    
        pstmt.executeUpdate();
        con.close();
    }
    
    public void PresentDoctors(String StaffId, String fname, String lname, String room, String status) throws SQLException{
        Connection con = db.getConnection();
        String str =  "insert into presentdoctors values( '" + StaffId +"', '"+ fname +"', '"+ lname +"', '"+ room +"', '"+ status +"' )";
        pstmt = con.prepareStatement(str);    
        pstmt.executeUpdate();
        con.close();
    }
    
    public void Payment(String pId, String purpose, String doctor, String price, 
                        String refNo, String status, String payment) throws SQLException{
        Connection con = db.getConnection();
        String str =  "insert into payments values( '" + pId +"', '"+ purpose +"', "
                + " '"+ doctor +"', '" + price +"', '"+ refNo +"', '"+ status +"', '"+ payment +"' )";
        pstmt = con.prepareStatement(str);    
        pstmt.executeUpdate();
        con.close();
    }
    
    public void WaitingPatients(String pId, String Doctor, String Payment) throws SQLException{
        Connection con = db.getConnection();
        String str =  "insert into WaitingPatients values( '" + pId + "', '" + Doctor + "', '"+ Payment +"')";
        pstmt = con.prepareStatement(str);    
        pstmt.executeUpdate();
        con.close();
    }
    
    
}
