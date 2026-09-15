package org.example.learnjdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImplementation implements EmployeeDao {

    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {
        Connection con = DBConnection.getConnection();
        if(con == null){
            return;
        }

        if(employee.getId() > 0) {
            // Update
        }else{
            // create
            String query = "INSERT INTO employee (name, gender, birth_date, salary) VALUES (?, ? , ?, ?)";
            try ( PreparedStatement preparedStatement = con.prepareStatement(query)){

                preparedStatement.setString(1, employee.getName());
                preparedStatement.setBoolean(2, employee.isGender());
                preparedStatement.setDate(3, (Date) employee.getBirthDate());
                preparedStatement.setDouble(4, employee.getSalary());

                preparedStatement.executeUpdate();


            }catch (SecurityException | SQLException se){
                se.printStackTrace();
            }finally {
                try{
                    con.close();
                }catch (SQLException se){
                    se.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteById(int id) {

    }
}
