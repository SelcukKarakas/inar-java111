package week_13.assignments.Question_13_06;

import week_13.assignments.Question_13_05.Circle;
public class Question_13_06 {






        public static void main(String[] args) {
            Circle circle1 = new Circle(0,0,16.5,"I See Red",true);
            Circle circle2 = new Circle(15,15,20.3,"I See Red",true);
            System.out.println(circle1);
            System.out.println();
            System.out.println(circle2);

            int result = circle1.compareTo(circle2);
            if(result==1){
                System.out.println("Circle1 is larger");
            }
            if(result==0){
                System.out.println("Two circles are equal");
            }
            else {
                System.out.println("Circle2 is larger");
            }
        }
    }

