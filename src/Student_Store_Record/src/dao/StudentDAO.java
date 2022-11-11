package dao;

import java.util.List;
import dto.Student;

public interface StudentDAO {
    public static final String URL = "jdbc:mysql://localhost:3306/student_db";
    public static final String USER = "root";
    public static final String PASSWORD = "G3R!SQl@";


    public void insert(Student student);
    public void update(Student student);
    public void delete(int id);
    public Student getStudentById(int id);
    public List<Student> getAll();
    public Student getByEmailAndRollNumber(String email, int StudentRollNumber);
    
}
