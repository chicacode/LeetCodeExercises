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

    private static final String INSERT = "";
    private static final String UPDATE = "";
    private static final String DELETE = "";
    private static final String GET_BY_ID = "";
    private static final String GET_ALL = "";
    private static final String GET_BY_EMAIL_AND_PASSWORD = "";
}
