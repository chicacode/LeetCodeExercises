package service;

import java.util.List;
import dto.Student;
import dao.StudentDAO;
import dao.StudentMySQLIm;

public class StudentServiceIm implements StudentService {

    private StudentDAO studentDAO = new StudentMySQLIm();

    @Override
    public void insert(Student student) {
        studentDAO.insert(student);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }

    @Override
    public void delete(int id) {
        studentDAO.delete(id);
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }

    @Override
    public Student getByEmailAndRollNumber(String email, int StudentRollNumber) {
        return studentDAO.getByEmailAndRollNumber(email, 0);
    }
}
