import java.util.ArrayList;

public class SalesReport {
    private String month;
    private int year;
    private int totalQtyPerItems;
    private int totalItem;

    public void updateSalesRep(Stock stock) {
        // Implementation to update sales report
    }

    public void printDetails() {
        System.out.println("Sales Report Details:");
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        // Add more details here
    }

    // Getters and Setters
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

    public int getTotalQtyPerItems() {
        return totalQtyPerItems;
    }

    public void setTotalQtyPerItems(int totalQtyPerItems) {
        this.totalQtyPerItems = totalQtyPerItems;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }
}
