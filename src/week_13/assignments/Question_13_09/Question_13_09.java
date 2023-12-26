package week_13.assignments.Question_13_09;

import week_13.assignments.Question_13_05.Circle;

public class Question_13_09 {


    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 200, "Red", true);
        Circle circle2 = new Circle(0, 0, 10, "Blue", false);
        Circle circle3 = new Circle(0, 0, 10, "Green", false);

        System.out.println(circle1.compareTo(circle2));
        System.out.println(circle2.compareTo(circle1));
        System.out.println(circle1.compareTo(circle1));

        System.out.println(circle2.equals(circle3));
    }
}

