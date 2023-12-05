package week_12.assignments.Question_12_11;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Question_12_11 {






        public static void main(String[] args) throws Exception {
            if (args.length != 2) {
                System.out.println("Usage: java Exercise12_11 word filename");
                System.exit(0);
            }
            File file = new File(args[1]);

            String newStr = "";
            String s = "";
            try (
                    Scanner input = new Scanner(file);
                    PrintWriter output = new PrintWriter(file);
            ) {
                while (input.hasNext()) {
                    s = input.nextLine();
                    newStr = s.replaceAll(args[0] + "", "");
                    output.print(newStr);
                }
            }
        }
    }

