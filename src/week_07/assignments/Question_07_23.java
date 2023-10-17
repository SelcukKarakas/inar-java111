package week_07.assignments;

public class Question_07_23 {


        /** Main method */
        public static void main(String[] args) {
            String[] lockers = new String[100];

            // Close all the lockers
            closeAllLockers(lockers);

            // Invoke the stuentLockerChanges method
            studentLockerChanges(lockers);

            // Display all open lock numbers
            print(lockers);
        }

        /** isOpen returns true if l is the string "OPEN". False otherwise*/
        public static boolean isOpen(String l) {
            return l == "OPEN";
        }

        /** closeAllLockers fills the array with the string "CLOSED" */
        public static void closeAllLockers(String[] lockers) {
            for (int i = 0; i < lockers.length; i++) {
                lockers[i] = "CLOSED";
            }
        }

        /** studentLockerChanges changes the string in each
         *   element from "CLOSED" to "OPEN" or Vice versa */
        public static void studentLockerChanges(String[] lockers) {
            int start = 0; // Locker student begins with

            for (int s = 1; s <= lockers.length; s++) {
                for (int l = 0; l < lockers.length; l += s) {
                    if (isOpen(lockers[l]))
                        lockers[l] = "CLOSED";
                    else
                        lockers[l] = "OPEN";
                }
                start++;
            }
        }

        /** print displays all open locker numbers separated by exactly one space */
        public static void print(String[] lockers) {
            for (int i = 0; i < lockers.length; i++) {
                if (isOpen(lockers[i])) {
                    System.out.print("L" + (i + 1) + " ");
                }
            }
            System.out.println();
        }

}
