package week_06.assignments;

import java.util.Scanner;

public class Question_06_04 {


    /**
     * Main Method
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer: ");

        int number = input.nextInt();


        reverse(number);
    }

    /**
     * Reverse Method displays an integer in reverse order
     */
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println(number);
    }

}
