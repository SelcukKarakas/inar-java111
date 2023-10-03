package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {


    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        int[] numbers = new int[10]; // Create an array of length 10

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Get distinct numbers
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the result
        System.out.print("The distinct numbers are:");
        for (int e : distinctNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }

    /**
     * eleminateDuplicates returns a new array with duplicate values eliminated
     */
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;    // index distinctList
        for (int e : list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }

    /**
     * linearSearch
     */
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }

}
