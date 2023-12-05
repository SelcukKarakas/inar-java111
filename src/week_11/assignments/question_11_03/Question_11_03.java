package week_11.assignments.question_11_03;

public class Question_11_03 {


    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(11, 1500, -500);
        SavingsAccount sa = new SavingsAccount(16, 5000);

        ca.withdraw(50);
        sa.withdraw(180);

        System.out.println(ca.toString());
        System.out.println("---------------------");
        System.out.println(sa.toString());

    }
}

