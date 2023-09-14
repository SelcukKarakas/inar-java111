package week_05.assignments;

public class Question_05_23 {


    public static void main(String[] args) {
        // Compute series from left to right
        double sumLeftToRight = 0.0;
        for (double i = 1.0; i <= 50000.0; i++) {
            sumLeftToRight += 1 / i;
        }

        // Display result of series sum from left to right
        System.out.println("Summation of series left to right: " + sumLeftToRight);

        // Compute series from right to left
        double sumRightToLeft = 0.0;
        for (double i = 50000.0; i >= 1.0; i--) {
            sumRightToLeft += 1 / i;
        }

        // Display result of series sum from right to left
        System.out.println("Summation of series right to left: " + sumRightToLeft);

        // Compare the results
        System.out.println("Summation of the series right to left - "
                + "Summation of the series left to right: "
                + (sumRightToLeft - sumLeftToRight));
    }

}
