package week_12.assignments.Question_12_17;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Question_12_17 {






        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            char playStarts = 'y';
            ArrayList<String> words = getWordsFromFile();

            while (playStarts == 'y') {
                int random = (int) (Math.random() * words.size());
                String theWord = words.get(random);
                char[] star = new char[theWord.length()];

                for (int i = 0; i < star.length; i++) {
                    star[i] = '*';
                }
                int missTime = 0;

                while (true) {
                    System.out.print("(Guess) Enter a letter in word ");

                    for (int i = 0; i < star.length; i++) {
                        System.out.print(star[i]);
                    }
                    System.out.print(" > ");
                    char guess = input.next().charAt(0);

                    missTime += checkLetter(star, guess, theWord);

                    if (checkAllAnswer(star, theWord)) {
                        break;
                    }
                }
                displayResults(theWord, missTime);

                System.out.print("Do you want to guess another word? Enter y or n > ");
                playStarts = input.next().charAt(0);
            }
        }

        public static ArrayList<String> getWordsFromFile() throws Exception {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter wordlist file pathname for Hangman game : ");
            String path = input.nextLine();

            File file = new File(path);

            if (!file.exists()) {
                System.out.println("There is no file that you've given..");
                System.exit(1);
            }

            ArrayList<String> words = new ArrayList<>();
            try (
                    Scanner input1 = new Scanner(file)
            ) {
                while (input1.hasNext()) {
                    words.add(input1.next());
                }
            }
            return words;
        }

        public static int checkLetter(char[] star, char guess, String theWord) {
            int c = 0;
            if (isAlreadyThere(guess, star)) {
                System.out.println(guess + " is already in the word");
            }
            for (int i = 0; i < star.length; i++) {
                if (theWord.charAt(i) == guess) {
                    star[i] = theWord.charAt(i);
                    c++;
                }
            }
            if (c > 0) {
                return 0;
            }
            System.out.println(guess + " is not in the word");
            return 1;
        }

        public static boolean checkAllAnswer(char[] star, String theWord) {
            for (int i = 0; i < star.length; i++) {
                if (star[i] != theWord.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isAlreadyThere(char guess, char[] star) {
            for (int i = 0; i < star.length; i++) {
                if (star[i] == guess) {
                    return true;
                }
            }
            return false;
        }

        public static void displayResults(String theWord, int missTime) {
            System.out.print("\nThe word is " + "\"" + theWord + "\". ");
            if (missTime == 0) {
                System.out.println("You didn't miss");
            } else if (missTime == 1) {
                System.out.println("You missed " + missTime + " time");
            } else {
                System.out.println("You missed " + missTime + " times");
            }
        }
    }

