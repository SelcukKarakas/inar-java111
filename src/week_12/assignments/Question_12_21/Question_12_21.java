package week_12.assignments.Question_12_21;

import java.io.File;
import java.util.Scanner;






    public class Question_12_21 {
        public static void main(String[] args) throws Exception {
            File file = new File("C:\\Users\\LENOVO T480\\Desktop\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_21\\SortedStrings.txt");

            if (!file.exists()) {
                System.out.println("File " + file + " does not exist");
                System.exit(0);
            }

            System.out.println("File " + file);
            boolean isDataSorted = true;
            String s1 = "";
            String s2 = "";

            try (
                    Scanner input = new Scanner(file);
            ) {
                if (input.hasNext()) {
                    s1 = input.next();
                }

                while (input.hasNext() && isDataSorted) {
                    s2 = input.next();
                    if (s1.compareTo(s2) > 0) {
                        System.out.println("The strings " + s1 + " and " + s2 + " are out of order");
                        isDataSorted = false;
                    }
                    s1 = s2;
                }
            }
            if (isDataSorted) {
                System.out.println("The strings in the file are stored in increasing order");
            }
        }
    }

