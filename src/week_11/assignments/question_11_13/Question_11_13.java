package week_11.assignments.question_11_13;

import java.util.ArrayList;

import java.util.Scanner;

public class Question_11_13 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        System.out.println("The distinct integers are " + list.toString());

    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        while (!list.isEmpty()) {
            int n = list.get(0);
            list.remove(0);

            if (!newList.contains(n)) {
                newList.add(n);
            }
        }
        list.addAll(newList);
    }
}

