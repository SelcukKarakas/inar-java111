package week_12.assignments.Question_12_08;

import java.util.Scanner;
public class Question_12_08 {






        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();

            try {
                System.out.println("The decimal value for hex number " + hex + " is " + hex2Dec(hex.toUpperCase()));
            } catch (NumberFormatException ex) {
                System.out.println(ex.toString());
            }
        }

        public static int hex2Dec(String hex) throws HexFormatException {
            int decimalValue = 0;

            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                    throw new HexFormatException("It is not a hex string.!");
                }
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }

            return decimalValue;
        }

        public static int hexCharToDecimal(char ch) {
            if (ch >= 'A' && ch <= 'F') {
                return 10 + ch - 'A';
            } else {
                return ch - '0';
            }
        }
    }

