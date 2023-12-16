package week_12.assignments.Question_12_23;

import java.io.File;
import java.io.PrintWriter;


public class Question_12_23 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\LENOVO T480\\Desktop\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_23\\Salary.txt");

        if (file.exists()) {
            System.out.println("File " + file.getName() + " already exist.");
            System.exit(1);
        }
        String rank = "";
        double salary;

        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName" + i + " LastName" + i);
                rank = getRank();
                salary = getSalary(rank);
                output.printf(" " + rank + " %.2f\n", salary);

            }
        }
    }

    public static String getRank() {
        String[] ranks = {"assistant", "associate", "full"};
        return ranks[(int) (Math.random() * ranks.length)];
    }

    public static double getSalary(String rank) {
        if (rank.equals("assistant")) {
            return 50000 + (double) (Math.random() * 30000);
        } else if (rank.equals("associate")) {
            return 60000 + (double) (Math.random() * 50000);

        } else {
            return 75000 + (double) (Math.random() * 55000);
        }
    }
}

