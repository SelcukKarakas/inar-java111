package week_09.assignments;

public class Question_09_01 {
    /** Main method */
    public static void main(String[] args) {
        // Create a Rectangle with width 4 and height 40
        Rectangle rectangle1 = new Rectangle(4, 40);

        // Create a Rectangle with width 3.5 and height 35.9
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // Display the width, height, area, and perimeter of rectangle1
        System.out.println("\n Rectangle 1");
        System.out.println("-------------");
        System.out.println("Width:     " + rectangle1.width);
        System.out.println("Height:    " + rectangle1.height);
        System.out.println("Area:      " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Display the width, height, area, and perimeter of rectangle2
        System.out.println("\n Rectangle 2");
        System.out.println("-------------");
        System.out.println("Width:     " + rectangle2.width);
        System.out.println("Height:    " + rectangle2.height);
        System.out.println("Area:      " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}