// import Recipe.Recipe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Recipe.Recipe;
import User.User;

public class App {
    public static void main(String[] args) throws Exception {

        try{
            getConnection();
        }catch(SQLException e){
            e.printStackTrace();
        }

  
        System.out.println("Hello, welcome to Appetite!");
        System.out.println("Your recipe's management app");
        User user = new User(0, "unknown", 0, "unknown", 0, 0, 0, null, null, null, null, null);

        // user.getUserInfo();

        // Recipe omelette = new Recipe(null, null, null, null, 0);
        // System.out.println("El omelette es: "+ omelette.getName());
    }

    public static void getConnection( ) throws SQLException{
        String url ="jdbc:mysql://localhost:3306/employe_db";
        String user = "root";
        String password = "G3R!SQl@";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("SQL Server succesfully!!!");


        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee_table");

        printTable(resultSet);

    }

    public static void printTable(ResultSet resultSet) throws SQLException{
        while(resultSet.next()){
            System.out.println(
                "ID: " + resultSet.getInt("EmpId") + " Name: " + resultSet.getString("FirstName")
            );
        }
    }
}