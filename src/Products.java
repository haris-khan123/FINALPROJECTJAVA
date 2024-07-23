public class Products {
    private String item;
    private String id;
    private double price;
    private int quantity;
    private String stock;

    public void printDetails() {
        System.out.println("Product Details:");
        System.out.println("Item: " + item);
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Stock: " + stock);
    }

    // Getters and Setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
