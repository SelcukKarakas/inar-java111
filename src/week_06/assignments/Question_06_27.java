package week_06.assignments;

public class Question_06_27 {

    public class Exercise_06_27 {
        /** Main Method */
        public static void main(String[] args) {
            final int NUMBER_OF_EMIRPS = 100; // Displays the first 100 emirps
            final int EMIRPS_PER_LINE = 10; // Display 10 numbers per line

            int count = 0; // Counts the number of emirps
            int n = 2; // Possible emirps

            // Displays the first 100 emirps. Display 10 numbers per line,
            // separated by exactly one space
            while (count < NUMBER_OF_EMIRPS) {
                if (isEmirp(n)) {
                    count++; // Increment count
                    System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
                }
                n++; // Increment n
            }
        }

        /** Method isEmirp returns true is number is an emirp. False otherwise */
        public static boolean isEmirp(int num) {
            return PrimeNumberMethod.isPrime(num) &&
                    !Exercise_06_03.isPalindrome(num) &&
                    PrimeNumberMethod.isPrime(Exercise_06_03.reverse(num));
        }
    }
}
