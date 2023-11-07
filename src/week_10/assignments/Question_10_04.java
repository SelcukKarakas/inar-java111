package week_10.assignments;

public class Question_10_04 {


        /** Main method */
        public static void main(String[] args) {
            // Create two points
            MyPoint point1 = new MyPoint();
            MyPoint point2 = new MyPoint(10, 30.5);

            // Display the distance between point1 and point2
            System.out.println("The distance between ("
                    + point1.getX() + ", " + point1.getY() + ") and ("
                    + point2.getX() + ", " + point2.getY() + ") is: " +
                    point1.distance(point2));
        }

}
