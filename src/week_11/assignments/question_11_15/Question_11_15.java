package week_11.assignments.question_11_15;

import java.util.ArrayList;

import java.util.Scanner;
public class Question_11_15 {






        public static void main(String[] args) {
            ArrayList<Double> points =getFromUser();

            System.out.println("The total area is " + getArea(points));


        }
        public static double getArea(ArrayList<Double> points){
            int sum=0;
            for (int i = 0; i <=points.size()-3; i+=2) {
                double x1 = points.get(i);
                double y1 = points.get(i + 1);
                double x2 = points.get(i + 2);
                double y2 = points.get(i + 3);
                sum += ((x1 * y2) - (y1 * x2));
            }
            sum += (points.get(points.size() - 2) * points.get(1)) - (points.get(points.size() - 1) * points.get(0));
            return Math.abs(sum / 2);

        }
        public static ArrayList<Double> getFromUser() {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of the points: ");
            int number = input.nextInt();

            ArrayList<Double> points = new ArrayList<>();
            System.out.print("Enter the coordinates of the points: ");
            for (int i = 0; i < number * 2; i++) {
                points.add(input.nextDouble());
            }
            return points;
        }
    }

