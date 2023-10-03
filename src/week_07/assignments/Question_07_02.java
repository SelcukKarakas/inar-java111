package week_07.assignments;

import java.util.Scanner;

public class Question_07_02 {


    public static void main(String[] args) {
        int[] array = new int[10];

        // Prompt the user to enter ten integers
        System.out.print("Enter ten integers: ");

        // fill the array
        fill(array);

        // Display integers in reverse order
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    /**
     * Method fill
     */
    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
    }
}
