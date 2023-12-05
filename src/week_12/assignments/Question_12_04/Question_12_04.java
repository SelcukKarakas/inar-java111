package week_12.assignments.Question_12_04;

public class Question_12_04 {


    public static void main(String[] args) {
        try {
            LoanWithException ln1 = new LoanWithException(-1, 5, 20000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

