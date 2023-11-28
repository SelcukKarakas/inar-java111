package week_10.assignments;

import java.math.BigInteger;
public class Question_10_17 {




        /** Main method */
        public static void main(String[] args) {
            // Find the first ten square numbers
            // that are greater than Long.MAX_VALUE
            BigInteger i = new BigInteger(Long.MAX_VALUE + "");
            BigInteger end = i.add(new BigInteger("10"));

            // Display results
            for (i = new BigInteger(Long.MAX_VALUE + "");
                 i.compareTo(end) <= 0;
                 i = i.add(new BigInteger("1"))) {
                System.out.println(i.multiply(i));
            }
        }

}
