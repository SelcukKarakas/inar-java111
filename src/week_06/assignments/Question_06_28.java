package week_06.assignments;

public class Question_06_28 {


        /** Main Method */
        public static void main(String[] args) {
            // Display table header
            System.out.println("\np           2^p-1");
            System.out.println("--------------------");

            // Display all Mersenne primes with p <= 31
            for (int p = 2; p <= 31; p++) {

                    System.out.printf("%-13d", p);
                    System.out.println(mersennePrime(p));
                }
            }


        /** Method mersennePrime finds ans returns the mersenne prime of num*/
        public static int mersennePrime(int num) {
            return (int)Math.pow(2, num) - 1;
        }

}
