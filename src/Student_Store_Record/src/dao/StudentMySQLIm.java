package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dto.Student;

public class StudentMySQLIm implements StudentDAO {
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
        } catch (SQLException e) {
            System.out.println("Unable to connect! ");
            e.printStackTrace();       
        }    
    }

    @Override
    public void insert(Student student) {
        int rowAffected = 0;
        try {

            preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setString(3, student.getStudentId());
            preparedStatement.setInt(4, student.getStudentRollNumber());

            rowAffected = preparedStatement.executeUpdate();
            System.out.println(rowAffected + " rows affected! ");

        } catch (SQLException e) {
            System.out.println("Unable to insert student! ");
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the statement! ");
                e.printStackTrace();
            }
        }

        if (rowAffected > 0) {
            System.out.println(" Insert was succesful");
        }
    }

    @Override
    public void update(Student student) {
        int rowAffected = 0;
        try {

            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setString(3, student.getStudentId());
            preparedStatement.setInt(4, student.getStudentRollNumber());
            preparedStatement.setInt(5, student.getId());

            rowAffected = preparedStatement.executeUpdate();
            System.out.println(rowAffected + " rows affected! ");

        } catch (SQLException e) {
            System.out.println("Unable to update student data! ");
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the statement! ");
                e.printStackTrace();
            }
        }

        if (rowAffected > 0) {
            System.out.println("Update was succesful");
        }
    }

    @Override
    public void delete(int id) {
        int rowAffected = 0;
        try {
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);

            rowAffected = preparedStatement.executeUpdate();
            System.out.println(rowAffected + " rows affected! ");

        } catch (SQLException e) {
            System.out.println("Unable to delete student data! ");
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the statement! ");
                e.printStackTrace();
            }
        }

        if (rowAffected > 0) {
            System.out.println("Delete was succesful");
        }
    }

    @Override
    public Student getStudentById(int id) {
        Student student = null;

        try {
            preparedStatement = connection.prepareStatement(GET_BY_ID);
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("Id"));
                student.setName(resultSet.getString("Name"));
                student.setEmail(resultSet.getString("Email"));
                student.setStudentId(resultSet.getString("StudentId"));
                student.setStudentRollNumber(resultSet.getInt("StudentRollNumber"));
            }

        } catch (SQLException e) {
            System.out.println("Unable to find student for given id! ");
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the statement! ");
                e.printStackTrace();
            }
        }

        return student;
    }
}
