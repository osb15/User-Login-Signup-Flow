package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL JDBC driver (optional step with newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/userdb_new", // JDBC URL (replace "localhost" with your MySQL server IP if needed)
                "root",                               // Database username
                "57210322S7"                            // Database password
            );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Database driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error while connecting to database.", e);
        }
    }
}
