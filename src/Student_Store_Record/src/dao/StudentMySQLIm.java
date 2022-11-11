package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dto.Student;

public class StudentMySQLIm implements StudentDAO{
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    private static final String INSERT = "INSERT INTO student_table (Name, Email, StudentId, StudentRollNumber) VALUES (?,?,?,?)";
    private static final String UPDATE = "UPDATE student_table SET Name = ?, Email = ?, StudentId = ?, StudentRollNumber = ?";
    private static final String DELETE = "DELETE FROM student_table WHERE Id = ?";
    private static final String GET_BY_ID = "SELECT * FROM student_table WHERE Id = ?";
    private static final String GET_ALL = "SELECT * FROM student_table";
    private static final String GET_BY_EMAIL_AND_ROLLNUMBER = "SELECT * FROM student_table WHERE Email = ? AND StudentRollNumber = ?";


    public StudentMySQLIm(){
      try {
            connection = DriverManager.getConnection(StudentDAO.URL, StudentDAO.USER, StudentDAO.PASSWORD)
        } catch (Exception e) {
            // TODO: handle exception

        }
    }
}
