package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {


        public static void main(String[] args) {
            // Create a Scanner
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter two integers
            System.out.print("Enter first integer: ");
            int n1 = input.nextInt();
            System.out.print("Enter second integer: ");
            int n2 = input.nextInt();

            // Make gcd to be the minimum of n1 and n2
            int gcd = n1 < n2 ? n1 : n2;

            // Find the greatest common divisor
            while (n1 % gcd != 0 || n2 % gcd != 0) {
                gcd--;
            }

            // Display result
            System.out.println("The greatest common divisor for " + n1 +
                    " and " + n2 + " is " + gcd);
        }

}
