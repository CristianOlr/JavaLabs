package Lab8.Ex6;

public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    private double monthlyInterest;

    public SavingsAccount(double savingsBalance) {
        setSavingsBalance(savingsBalance);
    }

    public void calculateMonthlyInterest() {
        setMonthlyInterest(getAnnualInterestRate()*getSavingsBalance()/12);
    }

    static void modifyInterestRate(double newValue) {
        setAnnualInterestRate(newValue);
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate>0)
            SavingsAccount.annualInterestRate = annualInterestRate;
        else
            System.out.println("Enter a valid value for annual interest rate");
    }

    public void setSavingsBalance(double savingsBalance) {
        if (savingsBalance>0)
            this.savingsBalance = savingsBalance;
        else
            System.out.println("Enter a positive value for savings balance");
    }

    public void setMonthlyInterest(double monthlyInterest) {
        this.monthlyInterest = monthlyInterest;
    }
}


