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
            System.out.println("2. - for LOGIN");
            System.out.println("3. - for GET ALL STUDENTS");
            System.out.println("4. - for GET STUDENT BY ID");
            System.out.println("5. - for UPDATE STUDENT");
            System.out.println("6. - for DELETE STUDENT");
            System.out.println("7. - for GET STUDENT BY ROLL NUMBER AND EMAIL");
            System.out.println("8. - Q for QUIT");
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
                    int StudentRollNumber = scanner.nextInt();

                    Student student = new Student(name, email, studentId, StudentRollNumber);
                    studentService.insert(student);

                    break;

                case "2":

                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

                case "7":

                    break;

                case "8":

                    break;
            }

        } while (!userChoice.equals("8"));

        scanner.close();
    }
}
