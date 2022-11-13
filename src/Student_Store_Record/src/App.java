import java.util.Scanner;

import service.StudentService;
import service.StudentServiceIm;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Student Record");

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

        } while (userChoice.equals("8"));
    }
}
