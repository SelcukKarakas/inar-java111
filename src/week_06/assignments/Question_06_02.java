package week_06.assignments;

import java.util.Scanner;

public class Question_06_02 {


    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        long number = input.nextLong();


        System.out.println("The sum of the digits in " + number + " is " +
                sumDigits(number));
    }

    /**
     * Compute the sum of the digits in an integer
     */
    public static long sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

}
