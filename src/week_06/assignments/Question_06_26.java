package week_06.assignments;

public class Question_06_26 {


        /** Main Method */
        public static void main(String[] args) {
            // Number of palindromic prime numbers to display
            final int NUMBER_OF_PALINDROMIC_PRIMES = 100;
            final int NUMBERS_PER_LINE = 10; // Display 10 numbers per line

            int count = 0; // Counts the number of palindromic prime numbers
            int n = 2;	// Possible palindromic prime numbers

            // Display 10 numbers per line, separated by exactly one space
            while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
                if (isPalindromicPrime(n)) {
                    count++; // Increment count
                    System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
                }
                n++; // Increment index
            }
        }

        /** Method isPalindromicPrime returns true if number is a Prime and
         Palindrome. False otherwise */
        public static boolean isPalindromicPrime(int num) {
            return PrimeNumberMethod.isPrime(num) &&
                    Exercise_06_03.isPalindrome(num);
        }
}
