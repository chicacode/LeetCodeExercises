import java.util.List;
import java.util.Scanner;

import dto.Student;
import service.StudentService;
import service.StudentServiceIm;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Student Record");
        showMenu();

    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceIm();

        String userChoice = "";

        do {
            System.out.println("----------------------");
            System.out.println(" Welcome to CICCC STUDENT RECORD");
            System.out.println("1. - for REGISTER");
            System.out.println("2. - for UPDATE STUDENT");
            System.out.println("3. - for DELETE STUDENT");
            System.out.println("4. - for GET STUDENT BY ROLL NUMBER AND EMAIL");
            System.out.println("5. - Q for QUIT");
            System.out.println("----------------------");

            userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.println("- Enter your name -");
                    String name = scanner.nextLine();
                    System.out.println("- Enter your studentId -");
                    String studentId = scanner.nextLine();
                    System.out.println("- Enter your email -");
                    String email = scanner.nextLine();
                    System.out.println("- Enter your roll number -");
                    int studentRollNumber = scanner.nextInt();

                    Student student = new Student(name, email, studentId, studentRollNumber);
                    studentService.insert(student);

                    break;

                case "2":

                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                    displayStudent(studentService.getAll());
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

                    System.out.println("Enter student ID");
                    int id = scanner.nextInt();

                    Student student1 = studentService.getStudentById(id);

                    if (student1 != null) {
                        System.out.println("- Enter new name -");
                        String newName = scanner.nextLine();
                        System.out.println("- Enter new studentId -");
                        String newStudentId = scanner.nextLine();
                        System.out.println("- Enter new email -");
                        String newEmail = scanner.nextLine();
                        System.out.println("- Enter new roll number -");
                        int newStudentRollNumber = scanner.nextInt();

                        student1.setName(newName);
                        student1.setStudentId(newStudentId);
                        student1.setEmail(newEmail);
                        student1.setStudentRollNumber(newStudentRollNumber);

                        studentService.update(student1);
                    } else {
                        System.out.println("- Student Not Found -");
                    }
                    break;

                case "3":
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                    displayStudent(studentService.getAll());
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

                    System.out.println("Enter student ID");
                    id = scanner.nextInt();

                    studentService.delete(id);
                    break;

                case "4":

                    break;

                case "5":

                    break;

            }

        } while (!userChoice.equals("5"));

        scanner.close();
    }

    public static void displayStudent(List<Student> students) {
        System.out.println("Student data: ID\tName\tEmail\tStudentId\tRollNumber");
        for (Student student : students) {
            System.out.print(student.getName() + " \t");
            System.out.print(student.getEmail() + " \t");
            System.out.print(student.getStudentId() + " \t");
            System.out.print(student.getStudentRollNumber() + " \t");
            System.out.println("\n");
        }
    }
}
