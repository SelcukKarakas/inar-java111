package week_06.assignments;

public class Question_06_13 {


    /**
     * Main Method
     */
    public static void main(String[] args) {
        // Display table series data between 1.0 t0 20.0
        double seriesStart = 1.0;    // Start range
        double numberOfRows = 20.0;    // End range

        // Display header
        System.out.println("\ni         m(i)     ");
        System.out.println("-------------------");

        // Display Data
        for (double i = seriesStart; i <= numberOfRows; i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", sumSeries(i));
        }
    }

    /*** Method sumSeries: computes the series */
    public static double sumSeries(double n) {
        double sum = 0;    // Sum of the series
        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }

}
