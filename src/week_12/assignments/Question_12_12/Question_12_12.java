package week_12.assignments.Question_12_12;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Question_12_12 {






        public static void main(String[] args) throws Exception {
            if (args.length != 1) {
                System.out.println("Usage: java Exercise12_12 filename");
                System.exit(1);
            }
            File file = new File(args[0]);

            if (!file.exists()) {
                System.out.println("File " + args[0] + " not found");
                System.exit(2);
            }
            String s = "";

            try (
                    Scanner input = new Scanner(file)
            ) {
                while (input.hasNext()) {
                    s += input.nextLine() + " \n";
                }
                s = s.replaceAll("\n\\s*\\{", " {");
            }
            try (
                    PrintWriter output = new PrintWriter(file)
            ) {
                output.print(s);
            }
        }
    }

