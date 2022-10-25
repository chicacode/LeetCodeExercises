package JavaPractice;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice2 {

    public static void main(String args[]) {
     // Q2
        // Create an ArrayList of Integers

        ArrayList<Integer> numberList2 = new ArrayList<Integer>(10);

        ArrayList<Integer> numberList2Copy = new ArrayList<Integer>(10);
        Random rand = new Random();
        int upperBound = 50;
        
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
