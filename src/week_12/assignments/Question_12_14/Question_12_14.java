package week_12.assignments.Question_12_14;
import java.io.File;
import java.util.Scanner;
public class Question_12_14 {






        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a file's path name: ");
            File file = new File(input.nextLine());

            if (!file.exists()) {
                System.out.println("File " + file + " doesn't exist.");
                System.exit(1);
            }

            int count = 0;
            double sum = 0;
            try (
                    Scanner input2 = new Scanner(file)
            ) {
                while (input2.hasNext()) {
                    sum += input2.nextDouble();
                    count++;
                }
            }
            System.out.printf("Sum of the numbers in the file: %.2f\nNumber of integers: %d", sum, count);
            System.out.printf("\nAverage: %.2f", (sum / count));

        }

    }

