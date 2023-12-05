package week_12.assignments.Question_12_04;

public class LoanWithException {




        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private java.util.Date loanDate;

        public LoanWithException() {
            this(2.5, 1, 100);
        }

        public LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount) {
            if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
                throw new IllegalArgumentException("Wrong input! Please greater than 0 (zero)");
            }
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public int getNumberOfYears() {
            return numberOfYears;
        }

        public void setNumberOfYears(int numberOfYears) {
            this.numberOfYears = numberOfYears;
        }

        public double getLoanAmount() {
            return loanAmount;
        }

        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }

        public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                    (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;
        }

        public double getTotalPayment() {
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
        }


        public java.util.Date getLoanDate() {
            return loanDate;
        }
    }

