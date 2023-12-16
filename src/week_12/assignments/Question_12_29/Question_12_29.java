package week_12.assignments.Question_12_29;

import java.io.File;
import java.util.Scanner;


public class Question_12_29 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file's pathname: ");
        String fileName = input.nextLine();

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File " + file.getName() + " doesnt exist.");
            System.exit(1);
        }

        int[] occurrencesOfChars = countLetters(file);

        displayOccurrencesOfLetters(occurrencesOfChars);

    }

    private static void displayOccurrencesOfLetters(int[] occurrencesOfChars) {
        for (int i = 0; i < 26; i++) {
            System.out.printf("Number of %c's: %d\n", ('A' + i), occurrencesOfChars[i]);
        }
    }

    private static int[] countLetters(File file) throws Exception {
        int[] countLetter = new int[300];
        String word;
        try (
                Scanner input2 = new Scanner(file)
        ) {
            while (input2.hasNext()) {
                word = input2.next().toUpperCase();
                for (int i = 0; i < word.length(); i++) {
                    if (Character.isLetter(word.charAt(i))) {
                        countLetter[word.charAt(i) - 'A']++;
                    }
                }
            }
        }
        return countLetter;
    }
}

