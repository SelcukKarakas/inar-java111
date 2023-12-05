package week_11.assignments.question_11_06;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {


    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new String("InarAcademy"));
        list.add(new Circle());

        for (Object o : list) {
            System.out.println(o);
            System.out.println("-----------------------");
        }
    }
}

