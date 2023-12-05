package week_11.assignments.question_11_03;

import week_09.assignments.Question_09_07.Account;


public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount() {
        super();
        this.limit = -500;

    }

    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(int amount) {
        if (getBalance() - amount >= limit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit !!!");
        }
    }

    @Override
    public String toString() {
        return "ID :" + getId() +
                "\nBalance is $" + this.getBalance() +
                "\nLimit is $" + this.limit;
    }
}

