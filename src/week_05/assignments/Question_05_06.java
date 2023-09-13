package week_05.assignments;

public class Question_05_06 {




    /*
(Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:

Kilograms Pounds    |    Pounds Kilograms
1            2.2    |    20          9.09
3            6.6    |    25         11.36
...
197        433.4    |    510       231.82
199        437.8    |    515       234.09
*/


        public static void main(String[] args) {
            // Create constant value for number of pounds per kilogram
            final double KILOMETERS_PER_MILES = 1.609;

            // Display table header
            System.out.println(
                    "Miles    Kilometers     |     Kilometers      Kilog");
            for (int k = 1, p = 20; k <= 10 && p <= 65; k += 1, p += 5) {
                System.out.printf(
                        "%-12d%7.3f", k, (k * KILOMETERS_PER_MILES));
                System.out.print("     |     ");
                System.out.printf(
                        "%-9d%12.3f\n",
                        p, (p / KILOMETERS_PER_MILES));
            }
        }

}


