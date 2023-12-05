package week_12.assignments.Question_12_16;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Question_12_16 {






        public static void main(String[] args) throws Exception {
            if (args.length != 3) {
                System.out.println("Usage: java Exercise12_16 file oldString newString ");
                System.exit(1);
            }

            File file = new File(args[0]);

            if (!file.exists()) {
                System.out.println("File " + args[0] + " doesn't exist.");
                System.exit(2);
            }

            String s;
            try (
                    Scanner input = new Scanner(file);
                    PrintWriter output = new PrintWriter(file);

            ) {
                while (input.hasNext()) {
                    s = input.nextLine();
                    s = s.replaceAll(args[1], args[2]);
                    output.println(s);
                }
            }
        }
    }


