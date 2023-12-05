package week_11.assignments.question_11_05;

public class Question_11_05 {




        public static void main(String[] args) {
            Course inar = new Course("Inar Academy SDET Course");

            inar.addStudent("Nisanur Altuntas");
            inar.addStudent("Gurkan SERTESER");
            inar.addStudent("Sinan Cetin");
            inar.addStudent("Mehmet Toprak");
            inar.addStudent("Sefa Atakul");
            inar.addStudent("Musa Denis");
            inar.addStudent("Berkan Eris");

            System.out.println("After adding student to the course..");
            for (String s : inar.getStudents()) {
                System.out.print(s + " - ");
            }

            System.out.println("\nNumber of students: " + inar.getNumberOfStudents());
            System.out.println("------------------");

            inar.dropStudents("Mehmet Toprak");
            inar.dropStudents("Berkan Eris");
            inar.dropStudents("Sinan Cetin");

            System.out.println("After dropping student from the course..");
            for (String s : inar.getStudents()) {
                System.out.print(s + " - ");
            }
            System.out.println("\nNumber of students: " + inar.getNumberOfStudents());
        }

    }

