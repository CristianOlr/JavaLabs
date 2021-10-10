import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the information about the person:");
        System.out.print("\t- first name: ");
        String firstName = input.next();
        System.out.print("\t- last name: ");
        String lastName = input.next();
        System.out.print("\t- day of birth: ");
        int day = input.nextInt();
        System.out.print("\t- month of birth: ");
        int month = input.nextInt();
        System.out.print("\t- year of birth: ");
        int year = input.nextInt();
        HeartRates person = new HeartRates(firstName, lastName, day, month, year);
        System.out.println("\nInformation entered about the person: ");
        System.out.printf("First Name:  %s\n", person.getFirstName());
        System.out.printf("Last Name:  %s\n", person.getLastName());
        System.out.printf("Day of birth:  %d\n", person.getDay());
        System.out.printf("Month of birth:  %d\n", person.getMonth());
        System.out.printf("Year of birth:  %d\n", person.getYear());
        person.calculateShow();


    }
}
