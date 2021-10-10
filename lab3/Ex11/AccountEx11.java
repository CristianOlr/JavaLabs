public class AccountEx11 {
    private String name;
    private double balance;

    public AccountEx11(String name, double balance) {
        this.name = name;
        if (balance > 0)
            this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.print("\nWithdrawal amount exceeded account balance");
        else {
            balance-=amount;
        }
    }

}
