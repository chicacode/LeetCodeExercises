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

        ArrayList<Integer> numberList2Copy = new ArrayList<Integer>(10);
        ;
        System.out.println("----------------------");
        for (int i = 0; i < 10; i++) {
            // • Fill the ArrayList with ten random numbers (1-50)
            int random_numbers = rand.nextInt(1, upperBound);
            // Fill 10 slots with random values
            // • Fill the ArrayList with ten random numbers (1-50)
            numberList2.add(random_numbers);
        }

        // Copy in second array the values of first array
        for (int i = 0; i < numberList2.size(); i++) {
            numberList2Copy.add(numberList2.get(i));
        }
        
        // • Change the last value in the first (original) ArrayList to a -5
        numberList2.set(numberList2.size() - 1, 5);
        // • Display the contents of both ArrayLists
        System.out.println("Number changed in ArrayList Java: " + numberList2);
        System.out.println("Array List Copy Java: " + numberList2Copy);

    }

}
