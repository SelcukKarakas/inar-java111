package week_05.assignments;

import java.util.Scanner;
public class Question_05_46 {

    /*
(Reverse a string) Write a program that prompts the user to enter a string and
displays the string in reverse order.
*/



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String string = input.nextLine();

            // Reverse the string
            String reverse = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                reverse += string.charAt(i);
            }

            // Display the string in reverse order
            System.out.println("The reversed string is " + reverse);
        }
    }
