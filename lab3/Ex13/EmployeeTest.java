import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setFirstName("Blue");
        employee1.setLastName("John");
        employee1.setSalary(2500);
        employee2.setFirstName("Red");
        employee2.setLastName("Carl");
        employee2.setSalary(3300);
        double totSalary1 = employee1.getSalary() * 12;
        double totSalary2 = employee2.getSalary() * 12;
        System.out.printf("%s %s's annual salary:  $%.2f\n", employee1.getFirstName(),
                employee1.getLastName(), totSalary1);
        System.out.printf("%s %s's annual salary:  $%.2f\n", employee2.getFirstName(),
                employee2.getLastName(), totSalary2);

    }
}
