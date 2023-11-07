package week_10.assignments;

public class Question_10_09 {


        /** Main method */
        public static void main(String[] args) {
            // Create a course
            Course math101 = new Course("math101");

            // Add three students
            math101.addStudent("Mark");
            math101.addStudent("Tom");
            math101.addStudent("Joan");

            // remove one student
            math101.dropStudent("Tom");

            // Displays the students in the course
            System.out.println("\nThe students in the course " +
                    math101.getCourseName() + ":");
            String[] students = math101.getStudents();
            for (int i = 0; i < math101.getNumberOfStudents(); i++) {
                System.out.print(students[i] + " ");
            }
            System.out.println();
        }

}
