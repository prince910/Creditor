/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditor;

import java.sql.*;
/**
 *
 * @author prince.c.b.vergara
 */
public class test {
    public static void main(String[] args) {
        
//System.out.println("Loading driver...");
//
//try {
//    Class.forName("com.mysql.cj.jdbc.Driver");
//    System.out.println("Driver loaded!");
//} catch (ClassNotFoundException e) {
//    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
//}

String url = "jdbc:mysql://127.0.0.1:3306/creditor";
String username = "root";
String password = "";

System.out.println("Connecting database...");

try (Connection connection = DriverManager.getConnection(url, username, password)) {
    System.out.println("Database connected!");
} catch (SQLException e) {
    throw new IllegalStateException("Cannot connect the database!", e);
}
    }
    
}
