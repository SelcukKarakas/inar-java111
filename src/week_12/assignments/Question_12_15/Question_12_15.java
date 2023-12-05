package week_12.assignments.Question_12_15;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Question_12_15 {






        public static void main(String[] args) throws Exception {

            File file = new File("C:\\Users\\tsur\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_15\\Question_12_15.txt");
            if (file.exists()) {
                System.out.println("There is already a file with the same name");
                System.exit(1);
            }

            writeRandomNumbers(file, 100);
            ArrayList<Integer> list = readAndSortData(file);
            displayList(list);

        }

        public static void displayList(ArrayList<Integer> list) {
            int count = 0;
            for (Integer i : list) {
                count++;
                System.out.printf("%3d", list.get(i));
                if (count % 10 == 0)
                    System.out.println();
            }
        }


        public static ArrayList<Integer> readAndSortData(File file) throws Exception {
            ArrayList<Integer> list = new ArrayList<>();
            try (
                    Scanner input = new Scanner(file)
            ) {
                while (input.hasNext()) {
                    list.add(input.nextInt());
                }
            }
            Collections.sort(list);
            return list;
        }

        public static void writeRandomNumbers(File file, int num) throws Exception {
            try (
                    PrintWriter output = new PrintWriter(file)
            ) {
                for (int i = 0; i < num; i++) {
                    int random = (int) (Math.random() * 100);
                    output.printf("%3d", random);
                }
            }
        }
    }

