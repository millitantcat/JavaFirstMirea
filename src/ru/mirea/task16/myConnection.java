package ru.mirea.task16;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class myConnection {
    public static Connection getConnection(){
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javacontactsapp", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(myConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

        return con;
    }
}