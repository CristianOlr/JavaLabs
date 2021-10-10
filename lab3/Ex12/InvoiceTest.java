import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice item1 = new Invoice();
        item1.setPartNumber("0002452355");
        item1.setPartDescr("HP Notebook");
        item1.setQuantity(7);
        item1.setPrice(999.99);
        System.out.println("Item 1 info:");
        System.out.printf("\tPart Number:  \"%s\"\n", item1.getPartNumber());
        System.out.printf("\tPart Description:  \"%s\"\n", item1.getPartDescr());
        System.out.printf("\tQuantity:  \"%d\"\n", item1.getQuantity());
        System.out.printf("\tPrice:  \"$%.2f\"\n", item1.getPrice());
        System.out.printf("\tInvoice Amount:  \"$%.2f\"\n", item1.getInvoiceAmount());
    }
}
