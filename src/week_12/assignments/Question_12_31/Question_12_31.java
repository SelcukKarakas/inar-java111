package week_12.assignments.Question_12_31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Question_12_31 {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
                "Year", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5",
                "Rank1", "Rank2", "Rank3", "Rank4", "Rank5");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s", 2010 - i + "");
            File file = getTheFile(2010 - i);

            if (!file.exists()) {
                System.out.println("No such a file " + file.getName());
                continue;
            }

            displayNames(file);
        }
    }

    private static void displayNames(File file) throws FileNotFoundException {
        ArrayList<String> femaleNames = new ArrayList<>();
        ArrayList<String> maleNames = new ArrayList<>();
        int countNames = 0;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (countNames < 5) {
                int rank = input.nextInt();
                maleNames.add(input.next());
                double maleBirthRate = input.nextDouble();
                femaleNames.add(input.next());
                double femaleBirthRate = input.nextDouble();
                countNames++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s", femaleNames.remove(0));
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s", maleNames.remove(0));
        }
        System.out.println();
    }

    public static File getTheFile(int year) {
        File file = new File("C:\\Users\\ASUS\\babynameranking" + year + ".txt");
        return file;
    }
}

