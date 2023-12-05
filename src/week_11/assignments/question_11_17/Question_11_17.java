package week_11.assignments.question_11_17;

import java.util.ArrayList;

import java.util.Scanner;

public class Question_11_17 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int n = findN(m);

        System.out.println("The smallest number n for m * n to be a perfect square is " + n + " m * n is " + m * n);
    }

    public static int findN(int m) {
        ArrayList<Integer> factors = smallestFactors(m);
        ArrayList<Integer> odd = new ArrayList<>();

        int count;

        for (int i = 0; i < factors.size(); i++) {
            count = 1;
            for (int j = 0; j < factors.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (factors.get(i).equals(factors.get(j))) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                if (!odd.contains(factors.get(i))) {
                    odd.add(factors.get(i));
                }
            }
        }

        int result = 1;
        for (int i = 0; i < odd.size(); i++) {
            result *= odd.get(i);

        }
        return result;
    }

    public static ArrayList<Integer> smallestFactors(int m) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 2;
        while (m != 1) {
            if (m % i == 0) {
                numbers.add(i);
                m /= i;
            } else {
                i++;
            }
        }
        return numbers;
    }
}

