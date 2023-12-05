package week_11.assignments.question_11_08;

import java.util.Date;

public class Transaction {


    public static final char WITHDRAW = 'W';
    public static final char DEPOSIT = 'D';
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction() {
        this('\u0000', 0, 0, null);
    }

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nDate: " + this.date.toString() +
                "\nTransaction type: " + (this.type == 'W' ? "Withdraw" : "Deposit") +
                "\nAmount: " + this.amount +
                "\nBalance: " + this.balance +
                "\nDescription: " + this.description + "\n";

    }
}

