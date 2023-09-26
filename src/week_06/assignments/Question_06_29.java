package week_06.assignments;

public class Question_06_29 {


        /** Main Method */
        public static void main(String[] args) {
            // Find  and display all twin primes less than 1,000
            System.out.println();
            for (int p = 2; p < 1000; p++) {
                if (isTwinprime(p))
                    System.out.println("(" + p + ", " + (p + 2) + ")");
            }
        }

        /** Method isTwinprime returns true if num and num + 2 are primes */
        public static boolean isTwinprime(int num) {
            return PrimeNumberMethod.isPrime(num) && PrimeNumberMethod.isPrime(num + 2);
        }
}
