package week_05.assignments;

public class Question_05_13 {

        public static void main(String[] args) {
            int n = 1;
            int target = 12000;

            while (Math.pow(n, 3) < target) {
                n++;
            }

            // Since we want the largest n such that n^3 < 12,000, we need to decrement n by 1.
            n--;

            System.out.println("The largest integer n such that n^3 < 12,000 is: " + n);
        }
}
