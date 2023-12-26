package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_05.Circle;
import week_13.assignments.Question_13_05.GeometricObject;
import java.util.ArrayList;

public class Question_13_07 {








        public static void main(String[] args) {
            Circle circle1 = new Circle(0,0,20,"Red",true);
            Circle circle2 = new Circle(0,0,5,"Red",true);
            Square square1 = new Square(4,"Red",true);
            Square square2 = new Square(40,"Red",true);

            ArrayList<GeometricObject> objects = new ArrayList<>();

            objects.add(circle1);
            objects.add(circle2);
            objects.add(square1);
            objects.add(square2);

            for (int i = 0; i < objects.size(); i++) {
                if(!objects.get(i).isColorable()){
                    System.out.println("Area of Geometric Object in the index " + i + " is : " + ((Circle)objects.get(i)).getArea() );
                }
                else {
                    System.out.println("Area of Geometric Object in the index " + i + " is : " + ((Square)objects.get(i)).getArea());
                    ((Square)objects.get(i)).howToColor();
                }
                System.out.println("---------------------------------------------------");
            }
        }
    }
