package org.example.learnjdbc;

import org.example.learnjdbc.dao.Employee;
import org.example.learnjdbc.dao.EmployeeDao;
import org.example.learnjdbc.dao.EmployeeDaoImplementation;

import java.sql.Date;

public class App {

    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoImplementation();

        Employee employee = new Employee(
                new Date(System.currentTimeMillis()),
                true,
                0,
                "Ahmed",
                15000.1
        );

        employeeDao.save(employee);
    }
}