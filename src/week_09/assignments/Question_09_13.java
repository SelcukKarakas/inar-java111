package week_09.assignments;

import java.util.Scanner;
public class Question_09_13 {




        /** Main method */
        public static void main(String[] args) {
            // Create a Scanner object
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter a two-dimensional array
            System.out.print("Enter the number of rows and columns in the array: ");
            int rows = input.nextInt();
            int columns = input.nextInt();

            // Create a matrix
            double[][] array = new double[rows][columns];
            System.out.println("Enter the array: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = input.nextDouble();
                }
            }

            // Get and instance of Loacation
            Location max = locateLargest(array);

            // Display the location of the largest element in the array
            System.out.println("The location of the largest element is " +
                    max.maxValue + " at (" + max.row + ", " + max.column + ")");
        }

        /** locateLargest returns an instance of Location */
        public static Location locateLargest(double[][] a) {
            return new Location(a);
        }

}
