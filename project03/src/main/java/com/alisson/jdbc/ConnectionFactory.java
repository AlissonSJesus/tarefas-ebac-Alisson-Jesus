package com.alisson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static Connection connection;

    private ConnectionFactory() {
        
    }

    public static Connection getInstance() {
        if(connection == null) {
            connection = initConnection();
        }
        return connection;
    }

    public static Connection initConnection() {
        try {
           return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebac", "postgres", "admin");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
