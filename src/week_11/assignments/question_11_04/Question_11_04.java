package week_11.assignments.question_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter a sequence of numbers ending wih 0: ");
        Integer number = input.nextInt();

        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }

        System.out.println("The largest number in the list is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0 || list == null) {
            return null;
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}



