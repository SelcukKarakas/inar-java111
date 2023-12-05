package week_11.assignments.question_11_03;

import week_09.assignments.Question_09_07.Account;






    public class SavingsAccount extends Account {
        public SavingsAccount() {
            super();
        }

        public SavingsAccount(int id, double balance) {
            super(id, balance);
        }

        @Override
        public void withdraw(int amount) {
            if (getBalance() >= amount) {
                setBalance(getBalance() - amount);
            } else {
                System.out.println("You cannot withdraw money !!");
            }
        }

        @Override
        public String toString() {
            return "ID :" + getId() +
                    "\nBalance is $" + this.getBalance();
        }

    }

