package week_12.assignments.Question_12_09;

import java.util.Scanner;
public class Question_12_09 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a binary number: ");
            String bin = input.nextLine();

            try {
                System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin.toUpperCase()));
            } catch (BinaryFormatException ex) {
                System.out.println(ex.toString());
            }
        }

        public static int bin2Dec(String bin) throws BinaryFormatException {
            int decimalValue = 0;

            for (int i = 0; i < bin.length(); i++) {
                char c = bin.charAt(i);
                if (!(c == '0' || c == '1')) {
                    throw new BinaryFormatException("It is not a binary string.!");
                }
                char binChar = bin.charAt(i);
                decimalValue = decimalValue * 2 + binCharToDecimal(binChar);
            }

            return decimalValue;
        }

        public static int binCharToDecimal(char ch) {
            return ch - '0';
        }
    }

