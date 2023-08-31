package week_04.assignments;

import java.util.Scanner;

public class Question_04_04 {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of a hexagon
        System.out.print("Enter the side of a hexagon: ");
        double side = input.nextDouble();

        // Compute the area of the hexagon using the formula
        // Area = (3 * sqrt(3) / 2) * s^2
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

        // Display the result
        System.out.println("The area of the hexagon is " + area);
    }

}
