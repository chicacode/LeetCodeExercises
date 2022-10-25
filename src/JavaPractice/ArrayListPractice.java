package JavaPractice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String args[]) {

        // Q1
        // Create array list of Integers
        ArrayList<Integer> numberList = new ArrayList<Integer>(10);
        Random rand = new Random();
        int upperBound = 50;
        int num1;

        System.out.println("number list: " + numberList);

        for (int i = 0; i < 10; i++) {
            System.out.println("----------------------");
            int random_numbers = rand.nextInt(1, upperBound);
            // Fill 10 slots with random values
            numberList.add(random_numbers);

            // Display values
            System.out.println("Random Integer in Java: " + numberList);
        }

        try (Scanner inputNumber = new Scanner(System.in)) {
            // ask user to enter numbers
            System.out.println(" Enter a number: \n");
            num1 = inputNumber.nextInt();
        }

        for (int i : numberList) {

            if (numberList.contains(num1)) {
                System.out.println("The number is: " + num1 + " in the list: ");
            } else {
                System.out.println("The number " + num1 + "  is NOT in the list: ");
            }

        }

        // Q2
        // Create an ArrayList of Integers

        ArrayList<Integer> numberList2 = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            System.out.println("----------------------");
            int random_numbers = rand.nextInt(1, upperBound);
            // Fill 10 slots with random values
            numberList2.add(random_numbers);

            // Display values
            System.out.println("Random Integer in Java: " + numberList);
        }

        // • Fill the ArrayList with ten random numbers (1-50)
        // • Copy each value from the ArrayList Into another ArrayList of the same
        // capacity
        // • Change the last value in the first (original) ArrayList to a -5
        // • Display the contents of both ArrayLists

    }

}
