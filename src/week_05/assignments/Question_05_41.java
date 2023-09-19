package week_05.assignments;

import java.util.Scanner;
public class Question_05_41 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int max = 0;  // Initialize max to 0
            int count = 0;  // Initialize count to 0

            System.out.println("Enter integers (end with 0):");

            int num = input.nextInt();

            // Check if the first number is not 0
            if (num != 0) {
                max = num;
                count = 1;
            }

            while (num != 0) {
                num = input.nextInt();

                if (num == max) {
                    count++;
                } else if (num > max) {
                    max = num;
                    count = 1;
                }
            }

            if (max != 0) {
                System.out.println("The largest number is: " + max);
                System.out.println("The occurrence count for " + max + " is: " + count);
            } else {
                System.out.println("No valid numbers were entered.");
            }

            input.close();
        }


}



