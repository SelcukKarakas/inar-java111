package week_13.assignments.Question_13_10;

public class Question_13_10 {


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 3, "red", true);
        Rectangle rectangle2 = new Rectangle(10, 3, "blue", false);
        Rectangle rectangle3 = new Rectangle(12, 4, "greed", true);
        System.out.println("Rectangle1 Area -> " + rectangle1.getArea());
        System.out.println("Rectangle2 Area -> " + rectangle2.getArea());
        System.out.println("Rectangle3 Area -> " + rectangle3.getArea());
        if (rectangle1.equals(rectangle2)) {
            System.out.println("Rectangle1 == Rectangle2");
        } else {
            System.out.println("Rectangle1 != Rectangle2");
        }
        if (rectangle1.equals(rectangle3)) {
            System.out.println("Rectangle1 == Rectangle3");
        } else {
            System.out.println("Rectangle1 != Rectangle3");
        }
    }
}

