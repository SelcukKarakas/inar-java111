package week_11.assignments.question_11_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter a list of integers ending with 0: ");
        Integer number = input.nextInt();

        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }
        System.out.println("Before shuffling..");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        shuffle(list);

        System.out.println("\n\nAfter shuffling..");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}

