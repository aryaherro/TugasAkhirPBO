/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ajeng
 */
public class connect {
    private static Connection conn;
    private static final String url = "jdbc:mysql://localhost/";
    private static final String timezone = "?usetimezone=true&serverTimezone=UTC";
    private static String namaDB, user, pass;
    
    
    public static Connection getConnection(){
        try{
            namaDB = "tugas_akhir";//sesuaikan dengan nama database di mySQL
            user = "aryaherro";//sesuaikan dengan username di mySQL
            pass = "03042009";//sesuaikan dengan password di mySQL default ("")
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url + namaDB+ timezone, user, pass);
        }
        catch(SQLException e){
            System.out.println("error");
        }
        return null;
    }

    /**
     * @return the con
     */
    public static Connection getCon() {
        return conn;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        conn = aCon;
    }
    
    
}
