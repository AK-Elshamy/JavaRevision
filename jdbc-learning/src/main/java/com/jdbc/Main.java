package com.jdbc;
import com.jdbc.dao.UserDAO;
import com.jdbc.model.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();

        User user =
                new User("Ahmed", "ahmed@gmail.com");

        userDAO.create(user);

        User foundUser =
                userDAO.findById(1);

        System.out.println(foundUser);

        List<User> users =
                userDAO.findAll();

        users.forEach(System.out::println);
    }
}