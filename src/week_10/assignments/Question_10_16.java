package week_10.assignments;

import java.math.BigInteger;
public class Question_10_16 {




        /** Main method */
        public static void main(String[] args) {
            int count = 0;
            BigInteger n = new BigInteger(
                    "10000000000000000000000000000000000000000000000000");
            BigInteger z = new BigInteger("0");

            //System.out.println(n.remainder(new BigInteger("3")));
            while (count < 10) {
                if (z.compareTo(n.remainder(new BigInteger("2"))) == 0 ||
                        z.compareTo(n.remainder(new BigInteger("3"))) == 0) {
                    System.out.println(n);
                    count++;
                }
                n = n.add(new BigInteger("1"));
            }
        }

}
