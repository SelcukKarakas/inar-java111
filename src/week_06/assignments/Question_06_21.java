package week_06.assignments;

import java.util.Scanner;
public class Question_06_21 {




        /** Main Method */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Create a Scanner

            // Prompt the user to enter a phone number as a string
            System.out.print("Enter a string: ");
            String string = input.nextLine();

            // Translate a letter to a digit and leaves all other character intact
            for (int i = 0; i < string.length(); i++) {
                if (Character.isLetter(string.charAt(i)))
                    System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
                else
                    System.out.print(string.charAt(i));
            }
            System.out.println();
        }

        /** Method getNumber returns a number, given an uppercase letter */
        public static int getNumber(char uppercaseLetter) {
            // Return the character's number reference in the international
            // standard letter/number mapping for telephones
            if (uppercaseLetter >= 'W')
                return 9;
            else if (uppercaseLetter >= 'T')
                return 8;
            else if (uppercaseLetter >= 'P')
                return 7;
            else if (uppercaseLetter >= 'M')
                return 6;
            else if (uppercaseLetter >= 'J')
                return 5;
            else if (uppercaseLetter >= 'G')
                return 4;
            else if (uppercaseLetter >= 'D')
                return 3;
            else
                return 2;
        }

}
