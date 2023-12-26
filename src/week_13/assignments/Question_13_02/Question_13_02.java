package week_13.assignments.Question_13_02;

import java.util.ArrayList;
public class Question_13_02 {






        public static void main(String[] args) {
            ArrayList<Integer> excalibur = new ArrayList<>();
            fillArray13_02(excalibur);
            System.out.println(excalibur);
            shakeThatList(excalibur);
            System.out.println(excalibur);
        }

        private static void shakeThatList(ArrayList<Integer> excalibur) {
            for (int i = 0; i < excalibur.size(); i++) {
                int temp= excalibur.remove((int)(Math.random()* excalibur.size()));
                excalibur.add((int)(Math.random()* excalibur.size()),temp);
            }
        }

        private static void fillArray13_02(ArrayList<Integer> excalibur) {
            for (int i = 1; i <= 20; i++) {
                excalibur.add(i);
            }
        }

    }

