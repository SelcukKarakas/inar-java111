package week_05.assignments;

public class Question_05_18 {

    /*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
*/

    public static void main(String[] args) {
        // Pattern A
        System.out.println("Pattern A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

}
