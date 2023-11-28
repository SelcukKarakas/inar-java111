package week_10.assignments;

import java.util.Scanner;
public class Question_10_15 {




        /** Main method */
        public static void main(String[] args) {
            // Create a Scanner object
            Scanner input = new Scanner(System.in);

            // Create 5 x 2 matrix
            double[][] points = new double[5][2];

            // Prompt the user to enter five points
            System.out.print("\nEnter five points: ");
            for (int i = 0; i < points.length; i++) {
                for (int j = 0; j < points[i].length; j++) {
                    points[i][j] = input.nextDouble();
                }
            }

            MyRectangle2D r1 = MyRectangle2D.getRectangle(points);

            System.out.println("The bounding rectangle's center (" + r1.getX() + ", " +
                    r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
        }

}
