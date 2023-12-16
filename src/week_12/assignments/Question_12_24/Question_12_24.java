package week_12.assignments.Question_12_24;

import java.io.File;
import java.util.Scanner;


public class Question_12_24 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\LENOVO T480\\Desktop\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_23\\Salary.txt");

        if (!file.exists()) {
            System.out.println("File " + file.getName() + " doesn't exist..");
            System.exit(1);
        }
        double totalForAssistant = 0;
        double totalForAssociate = 0;
        double totalForFull = 0;
        double totalForAll = 0;

        int countForAssistant = 0;
        int countForAssociate = 0;
        int countForFull = 0;
        int countForAll = 0;

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                String rank = input.next();
                double salary = input.nextDouble();

                totalForAll += salary;
                countForAll++;

                if (rank.equals("assistant")) {
                    totalForAssistant += salary;
                    countForAssistant++;
                } else if (rank.equals("associate")) {
                    totalForAssociate += salary;
                    countForAssociate++;
                } else {
                    totalForFull += salary;
                    countForFull++;
                }
            }
        }
        System.out.printf("Total salary for assistant professors: %.2f\n", totalForAssistant);
        System.out.printf("Total salary for associate professors: %.2f\n", totalForAssociate);
        System.out.printf("Total salary for full professors     : %.2f\n", totalForFull);
        System.out.printf("Total salary for all faculty         : %.2f\n", totalForAll);
        System.out.print("---------------------------------------\n");

        System.out.printf("Average salary for assistant professors: %.2f\n", (totalForAssistant / countForAssistant));
        System.out.printf("Average salary for associate professors: %.2f\n", (totalForAssociate / countForAssociate));
        System.out.printf("Average salary for full professors     : %.2f\n", (totalForFull / countForFull));
        System.out.printf("Average salary for all faculty         : %.2f\n", (totalForAll / countForAll));

    }
}

