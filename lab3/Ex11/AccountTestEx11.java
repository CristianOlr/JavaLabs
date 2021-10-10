import java.util.Scanner;

public class AccountTestEx11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountEx11 account1 = new AccountEx11("John", 500);
        System.out.printf("%s's initial balance:  $%.2f", account1.getName(), account1.getBalance());
        System.out.print("\nEnter the withdraw amount:  ");
        double withdraw = input.nextDouble();
        account1.withdraw(withdraw);
        System.out.printf("\n%s's balance after try to withdraw:  $%.2f\n", account1.getName(), account1.getBalance());
    }
}
