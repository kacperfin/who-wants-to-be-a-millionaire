package com.wolvesdevelopment.game.model;
import java.sql.*;
public class Database {
    private String url;
    private String username;
    private String password;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public Database(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch(SQLException e) {
            printSQLException(e);
        }
    }

    public void query(String sql) {
        try {
            resultSet = statement.executeQuery(sql);
        } catch(SQLException e) {
            printSQLException(e);
        }
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void close() {
        try {
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void printSQLException(SQLException e) {
        System.err.println(e.getMessage());
        System.out.println("Try again");
    }
}