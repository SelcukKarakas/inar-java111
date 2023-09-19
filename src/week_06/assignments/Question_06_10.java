package week_06.assignments;

public class Question_06_10 {


    /**
     * Main Method
     */
    public static void main(String[] args) {
        int numberOfPrimes = 0;    // Counts the number of prime numbers

        // Find the number of prime numbers less than 10000
        for (int i = 1; i < 1000; i++) {
            Object PrimeNumberMethod = new Object();
            if (PrimeNumberMethod.toString().isEmpty())
                numberOfPrimes++; // Increament
        }

        // Display result
        System.out.println(
                "The number of prime numbers less than 10000: " + numberOfPrimes);
    }

}
