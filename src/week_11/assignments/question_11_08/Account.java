package week_11.assignments.question_11_08;

import java.util.ArrayList;

import java.util.Date;

public class Account {





        private String name;
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;

        private ArrayList<Transaction> transactions;

        public Account() {
            this(0, 0);
        }

        public Account(int id, double balance) {
            this("default", id, balance);
            dateCreated = new Date();
        }

        public Account(String name, int id, double balance) {
            this.name = name;
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
            transactions = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }

        public ArrayList<Transaction> getTransactions() {
            return transactions;
        }

        public void setTransactions(ArrayList<Transaction> transactions) {
            this.transactions = transactions;
        }

        public double getMonthlyInterestRate() {
            return (getAnnualInterestRate() / 100) / 12;
        }

        public double getMonthlyInterest() {
            return getBalance() * getMonthlyInterestRate();
        }

        public void withdraw(double amount) {
            if (balance < amount) {
                System.out.println("Your balance is $" + this.balance + ",so you cannot withdraw!!");
            }
            this.balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdraw from ATM"));
        }

        public void deposit(double amount) {
            if (amount < 0) {
                System.out.println("You cannot deposit negative(-) amount !!");
            }
            this.balance += amount;
            transactions.add(new Transaction('D', amount, this.balance, "Deposit to Bank"));
        }

        public String toString() {
            return "\nName: " + this.name +
                    "\nID: " + this.id +
                    "\nBalance: " + this.balance;
        }
    }

