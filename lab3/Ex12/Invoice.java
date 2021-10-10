public class Invoice {

    private String partNumber;
    private String partDescr;
    private int quantity;
    private double price;

    public Invoice() {
        partNumber = null;
        partDescr = null;
        quantity = 0;
        price = 0;
    }

    public void setPartNumber(String number) {
        partNumber = number;
    }

    public void setPartDescr(String partDescr) {
        this.partDescr = partDescr;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            quantity = 0;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0)
            price = 0;
        this.price = price;
    }

    public String getPartNumber() { return partNumber; }

    public String getPartDescr() {
        return partDescr;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        double total = quantity * price;
        return total;
    }
}
