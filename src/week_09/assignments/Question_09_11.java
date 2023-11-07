package week_09.assignments;

import java.util.Scanner;
public class Question_09_11 {




        /** Main method */
        public static void main(String[] args) {
            // Create a Scanner object
            Scanner input = new Scanner(System.in);


            // Prompt the user to enter a, b, c, d, e, and f
            System.out.print("Enter a, b, c, d, e, f: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double e = input.nextDouble();
            double f = input.nextDouble();

            // Create a LinearEquation object
            LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

            // Display results
            if (linearEquation.isSolvable()) {
                System.out.println("x is " + linearEquation.getX() +
                        " and y is " + linearEquation.getY());
            }
            else
                System.out.println("The equation has no solution.");
        }


}
