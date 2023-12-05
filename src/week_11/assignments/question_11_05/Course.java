package week_11.assignments.question_11_05;

import java.util.ArrayList;

public class Course {


    private String name;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.numberOfStudents = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public void dropStudents(String student) {
        if (students.contains(student)) {
            students.remove(student);
            numberOfStudents--;
        } else {
            System.out.println("There aren't any student whose name is \"" + student + "\"");
        }
    }
}

