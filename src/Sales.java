import java.util.Date;

public class Sales {
    private Date date;
    private String cashier;
    private String item;
    private int quantity;
    private double price;
    private double total;

    public double computeBill() {
        return quantity * price;
    }

    public void printDetails() {
        System.out.println("Sales Details:");
        System.out.println("Date: " + date);
        System.out.println("Cashier: " + cashier);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }

    // Getters and Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
