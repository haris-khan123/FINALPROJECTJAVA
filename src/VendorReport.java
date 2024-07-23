public class VendorReport {
    private String vendorName;
    private String item;
    private int quantity;
    private String month;
    private int year;
    private double totalAmount;

    public double computeTotal() {
        return quantity * totalAmount;
    }

    public void printDetails() {
        System.out.println("Vendor Report Details:");
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Total Amount: " + totalAmount);
    }

    // Getters and Setters
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
