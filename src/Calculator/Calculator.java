package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        // variables
        double num1, num2;
        double result = 0;
        boolean flag = true;

        // input
        Scanner inputNumber = new Scanner(System.in);

        try {

            do {
                System.out.println("----------------------");
                System.out.println(" Welcome to JAVA Calculator");
                System.out.println("1. + for ADDITION");
                System.out.println("2. - for SUBTRACTION");
                System.out.println("3. * for MULTIPLICATION");
                System.out.println("4. / for DIVISION");
                System.out.println("5. % for REMAINDER");
                System.out.println("7. Q for QUIT");
                System.out.println("----------------------");

                // ask user to enter numbers
                System.out.println(" Enter your first number: \n");
                num1 = inputNumber.nextDouble();

                System.out.println(" Enter your second number: \n");
                num2 = inputNumber.nextDouble();

                System.out.println(" Enter an operator for operation (+, -, *, /, %): \n");

                char operator = inputNumber.next().charAt(0);

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;

                    case '-':
                        result = num1 - num2;
                        break;

                    case '*':
                        result = num1 * num2;
                        break;

                    case '/':
                    try{ result =  num1 / num2; }catch(ArithmeticException error ){System.out.println("DIVIDED BY ZERO");}
                        break;

                    case '%':
                        result = num1 % num2;
                        break;

                    case 'Q':
                        System.exit(0);

                    default:
                        System.out.printf("Please enter specific operator only");
                        return;

                }

                // result
                System.out.println(num1 + " " + operator + " " + num2 + " = ");
                System.out.println("Result is: " + result);

                if(operator == 'Q' || num1 == 'Q' || num2 == 'Q'){
                    flag = false;
                }

            } while (flag == true);
        // handling errors
        } catch (Exception error) {
            System.out.println(" GOOD BYE: " );
            System.out.println(" ERROR: " + error);
        }

        // close program
        inputNumber.close();
    }

}
