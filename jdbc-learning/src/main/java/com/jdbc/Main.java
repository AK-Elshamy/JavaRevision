package com.jdbc;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        findUserById(1);
    }
    public static void findUserById(int id) {

        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String username = "root";
        String password = "";

        String sql = "SELECT * FROM users WHERE id = ?";

        try (
                Connection connection =
                        DriverManager.getConnection(url, username, password);

                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {

                    String user = resultSet.getString("username");
                    String email = resultSet.getString("email");

                    System.out.println("User found");
                    System.out.println("Name: " + user);
                    System.out.println("Email: " + email);

                } else {

                    System.out.println("User not found");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}