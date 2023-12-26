package week_13.assignments.Question_13_03;

import java.util.ArrayList;

public class Question_13_03 {


    public static void main(String[] args) {
        ArrayList<Integer> excalibur = new ArrayList<>();

        fillArray13_02(excalibur);
        System.out.println(excalibur);

        shakeThatList(excalibur);
        System.out.println(excalibur);

        getInLine(excalibur);
        System.out.println(excalibur);
    }

    private static void fillArray13_02(ArrayList<Integer> excalibur) {
        for (int i = 1; i <= 20; i++) {
            excalibur.add(i);
        }
    }

    private static void shakeThatList(ArrayList<Integer> excalibur) {
        for (int i = 0; i < excalibur.size(); i++) {
            int temp = excalibur.remove((int) (Math.random() * excalibur.size()));
            excalibur.add((int) (Math.random() * excalibur.size()), temp);
        }
    }

    private static void getInLine(ArrayList<Integer> excalibur) {
        int n = excalibur.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (excalibur.get(j) > excalibur.get(j + 1)) {
                    int temp = excalibur.get(j);
                    excalibur.set(j, excalibur.get(j + 1));
                    excalibur.set(j + 1, temp);
                }
            }
        }
    }
}


