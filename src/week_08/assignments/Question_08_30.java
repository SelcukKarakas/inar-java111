package week_08.assignments;

import java.util.Scanner;
public class Question_08_30 {




        /** Main method */
        public static void main(String[] args) {
            // Create a Scanner
            Scanner input = new Scanner(System.in);

            // Create a 2 x 2 matrix
            double[][] a = new double[2][2];

            // Create an array of length 2
            double[] b = new double[2];

            // Prompt the user to enter a00, a01, a10, a11, b0, and b1
            System.out.println("Enter a00, a01, a10, a11, b0, and b1:");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = input.nextDouble();
                }
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = input.nextDouble();
            }

            // Display the result of the linear equation
            double[] result = linearEquation(a, b);
            if (result == null)
                System.out.println("The equation has no solution.");
            else {
                System.out.println("x is " + result[0] + " and y is " + result[1]);
            }
        }

        /** linearEquation solves a 2 x 2 system of linear equations */
        public static double[] linearEquation(double[][] a, double[] b) {
            if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
                return null;

            double[] r = new double[2]; // Results x and y
            r[0] = (b[0] * a[1][1] - b[1] * a[0][1]) /
                    (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

            r[1] = (b[1] * a[0][0] - b[0] * a[1][0]) /
                    (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

            return r;
        }

}
