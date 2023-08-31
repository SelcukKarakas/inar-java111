package week_04.assignments;

import java.util.Random;

public class Question_04_25 {

        public static void main(String[] args) {
            String plateNumber = generatePlateNumber();
            System.out.println("Generated Plate Number: " + plateNumber);
        }

        public static String generatePlateNumber() {
            Random random = new Random();

            StringBuilder plateNumber = new StringBuilder();

            // Generate three uppercase letters
            for (int i = 0; i < 3; i++) {
                char letter = (char) (random.nextInt(26) + 'A');
                plateNumber.append(letter);
            }

            // Generate four digits
            for (int i = 0; i < 4; i++) {
                int digit = random.nextInt(10);
                plateNumber.append(digit);
            }

            return plateNumber.toString();
        }


}

