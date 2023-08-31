package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {


    public static void main(String[] args) {

        final double EARTH_RADIUS = 6371.01; // Earth's average radius in kilometers

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude and longitude of point 1 (in degrees): ");
        double x1 = Math.toRadians(scanner.nextDouble()); // Convert degrees to radians
        double y1 = Math.toRadians(scanner.nextDouble());

        System.out.println("Enter the latitude and longitude of point 2 (in degrees): ");
        double x2 = Math.toRadians(scanner.nextDouble()); // Convert degrees to radians
        double y2 = Math.toRadians(scanner.nextDouble());

        double distance = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The great circle distance between the two points is: " + distance + " km");

    }
}
