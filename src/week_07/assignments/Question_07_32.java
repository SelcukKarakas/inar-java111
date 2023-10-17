package week_07.assignments;

import java.util.Scanner;
public class Question_07_32 {




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Create a Scanner

            // Create array of Chinese Zodiac animal names
            String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
                    "rabbit", "dragon", "snake", "horse", "sheep"};

            // Prompt the user to enter a year
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            // Display Chinese Zodiac sign for the given year
            System.out.println(zodiacs[year % 12]);
        }

}
