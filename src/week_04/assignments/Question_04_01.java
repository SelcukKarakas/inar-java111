package week_04.assignments;

import java.util.Scanner;

public class Question_04_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5); // Calculate the length of a side

        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5)); // Calculate the area

        // Round up to two decimal places
        area = Math.round(area * 100.0) / 100.0;

        System.out.println("The area of the pentagon is: " + area);

    }
}

