/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.java.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/demodb";
            String user = "root";
            String pass = "root@123";
            Connection con = DriverManager.getConnection(connStr, user, pass);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
