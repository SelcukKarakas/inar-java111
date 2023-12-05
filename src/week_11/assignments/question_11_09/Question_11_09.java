package week_11.assignments.question_11_09;

import java.util.ArrayList;

import java.util.Scanner;

public class Question_11_09 {





        public static void main(String[] args) {
            ArrayList<Integer> rows = new ArrayList<>();
            ArrayList<Integer> columns = new ArrayList<>();

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the array size n: ");
            int n = input.nextInt();

            int[][] matrix = new int[n][n];
            System.out.println("The random array is");
            fill2DArrayWithRandomValues(matrix);

            findRows(rows, matrix);
            findColumns(columns, matrix);

            display(rows, columns);

        }

        public static void fill2DArrayWithRandomValues(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 2);
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void findRows(ArrayList<Integer> rows, int[][] matrix) {
            int maxCount = findTheMaxSumOfRow(matrix);
            int count;
            for (int row = 0; row < matrix.length; row++) {
                count = 0;
                for (int col = 0; col < matrix.length; col++) {
                    if (matrix[row][col] == 1) {
                        count++;
                    }
                }
                if (count == maxCount) {
                    rows.add(row);
                }
            }
        }

        public static void findColumns(ArrayList<Integer> cols, int[][] matrix) {
            int maxCount = findTheMaxSumOfColumn(matrix);
            int count;
            for (int col = 0; col < matrix.length; col++) {
                count = 0;
                for (int row = 0; row < matrix.length; row++) {
                    if (matrix[row][col] == 1) {
                        count++;
                    }
                }
                if (count == maxCount) {
                    cols.add(col);
                }
            }
        }

        public static int findTheMaxSumOfRow(int[][] matrix) {
            int maxSum = Integer.MIN_VALUE;
            int maxSumIndex = -1;

            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                }
            }
            return maxSum;
        }

        public static int findTheMaxSumOfColumn(int[][] matrix) {
            int maxSum = Integer.MIN_VALUE;
            int maxSumIndex = -1;

            for (int i = 0; i < matrix[0].length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix.length; j++) {
                    sum += matrix[j][i];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                }
            }
            return maxSum;
        }

        public static void display(ArrayList<Integer> rows, ArrayList<Integer> cols) {

            System.out.print("The largest row index: ");
            for (int i = 0; i < rows.size(); i++) {
                System.out.print(rows.get(i) + " ");
            }
            System.out.println();

            System.out.print("The largest column index: ");
            for (int i = 0; i < cols.size(); i++) {
                System.out.print(cols.get(i) + " ");
            }
            System.out.println();
        }
    }


