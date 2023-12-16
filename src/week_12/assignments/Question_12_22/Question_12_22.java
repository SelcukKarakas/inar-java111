package week_12.assignments.Question_12_22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Question_12_22 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java Question_12_22 dir oldString newString");
            System.exit(1);
        }

        File dir = new File(args[0]);
        if (!dir.exists()) {
            System.out.println("There isn't any directory");
            System.exit(2);
        }

        ArrayList<File> directories = new ArrayList<>();
        directories.add(dir);

        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();

                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    } else
                        replaceString(files[i], args);
                }
            }
        }
    }

    public static void replaceString(File file, String[] args) throws IOException {
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                s = input.nextLine();
                list.add(s.replaceAll(args[1], args[2]));
            }
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}

