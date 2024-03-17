package com.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    public static String url = "jdbc:mysql://localhost:3306/blog";
    public static String username = "root";
    public static String password = "root";
    public Connection connection;
    private static DBConnection dbConnection;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
