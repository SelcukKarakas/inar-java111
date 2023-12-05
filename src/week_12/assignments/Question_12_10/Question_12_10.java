package week_12.assignments.Question_12_10;

public class Question_12_10 {




        public static void main(String[] args) {
            try {
                int[] array = new int[100000 * 100000];
            } catch (OutOfMemoryError ex) {
                System.out.println("OutOfMemoryException occurs! :" + ex.getMessage());
            }
        }
    }

