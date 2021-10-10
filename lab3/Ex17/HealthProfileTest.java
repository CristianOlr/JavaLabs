import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the information about the person:");
        System.out.print("\t- first name: ");
        String firstName = input.next();
        System.out.print("\t- last name: ");
        String lastName = input.next();
        System.out.print("\t- gender: ");
        String gender = input.next();
        System.out.print("\t- day of birth: ");
        int day = input.nextInt();
        System.out.print("\t- month of birth: ");
        int month = input.nextInt();
        System.out.print("\t- year of birth: ");
        int year = input.nextInt();
        System.out.print("\t- height: ");
        int height = input.nextInt();
        System.out.print("\t- weight: ");
        int weight = input.nextInt();

        HealthProfile person = new HealthProfile(firstName, lastName, gender, day, month, year, height, weight);

        System.out.println("\nInformation entered about the person: ");
        System.out.printf("First Name:  %s\n", person.getFirstName());
        System.out.printf("Last Name:  %s\n", person.getLastName());
        System.out.printf("Gender:  %s\n", person.getGender());
        System.out.printf("Day of birth:  %d\n", person.getDay());
        System.out.printf("Month of birth:  %d\n", person.getMonth());
        System.out.printf("Year of birth:  %d\n", person.getYear());
        System.out.printf("Height:  %d inches\n", person.getHeight());
        System.out.printf("Weight:  %d pounds\n", person.getWeight());
        person.calculateShow();
    }
}
