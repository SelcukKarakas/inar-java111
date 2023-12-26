package week_13.assignments.Question_13_05;

public class Question_13_05 {




        public static void main(String[] args) {
            Triangle triangle1 = new Triangle(6,6,6,"red",true);
            Triangle triangle2 = new Triangle(15,15,15,"red",true);

            Circle circle1 = new Circle(0,0,5,"cool",true);
            Circle circle2 = new Circle(0,0,50,"cool",true);

            System.out.println(triangle1.compareTo(triangle2));
            System.out.println(triangle2.compareTo(triangle2));
            System.out.println(triangle2.compareTo(triangle1));
            System.out.println(circle1.compareTo(circle2));
            System.out.println(circle2.compareTo(circle2));
            System.out.println(circle2.compareTo(circle1));
        }
    }

