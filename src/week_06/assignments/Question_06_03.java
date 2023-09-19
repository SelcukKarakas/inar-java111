package week_06.assignments;

import java.util.Scanner;

public class Question_06_03 {


    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int number = input.nextInt();


        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
                "a palindrome.");
    }

    /**
     * Method isPalindrome returns true if number is a palindrome
     */
    public static boolean isPalindrome(int number) {

        return number == reverse(number) ? true : false;
    }

    /**
     * Method reverse returns the reversal of an integer
     */
    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";
        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }

}
