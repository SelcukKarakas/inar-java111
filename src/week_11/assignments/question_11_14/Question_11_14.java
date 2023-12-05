package week_11.assignments.question_11_14;

import java.util.ArrayList;

import java.util.Scanner;
public class Question_11_14 {






        public static void main(String[] args) {
            System.out.print("Enter five integers for list1: ");
            ArrayList<Integer> list1 = getFromUser(5);

            System.out.print("Enter five integers for list2: ");
            ArrayList<Integer> list2 = getFromUser(5);

            System.out.println("The combined list is " + union(list1, list2));

        }

        public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            for (int i = 0; i < list2.size(); i++) {
                list1.add(list2.get(i));
            }
            return list1;
        }

        public static ArrayList<Integer> getFromUser(int n) {
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(input.nextInt());
            }
            return list;
        }
    }

