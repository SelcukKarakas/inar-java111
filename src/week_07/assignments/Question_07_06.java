package week_07.assignments;

import java.util.Arrays;

public class Question_07_06 {

    public static void main(String[] args) {
        int[] primes = new int[50];
        int count = 0;
        int number = 2;

        while (count < 50) {
            boolean isPrime = true;

            // Check if number is divisible by any prime numbers less than or equal to its square root
            for (int i = 0; i < count && primes[i] * primes[i] <= number; i++) {
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If number is prime, add it to the primes array and increment the count
            if (isPrime) {
                primes[count] = number;
                count++;
            }

            // Move to the next number
            number++;
        }

        // Display the first 50 prime numbers
        System.out.println("The first 50 prime numbers are:");
        for (int i = 0; i < 50; i++) {
            System.out.print(primes[i] + " ");
            System.out.println(Arrays.toString(primes));
        }
    }


}
