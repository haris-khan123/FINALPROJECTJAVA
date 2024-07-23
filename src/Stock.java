import java.util.ArrayList;

public class Stock implements Supermarket {
    private ArrayList<Products> items = new ArrayList<>();

    public void addNew(Products product) {
        items.add(product);
    }

    public void remove(Products product) {
        items.remove(product);
    }

    public boolean outOfStock(Products product) {
        return product.getQuantity() == 0;
    }

    @Override
    public void printDetails() {
        System.out.println("Stock Details:");
        for (Products item : items) {
            item.printDetails();
        }
    }

    // Getters and Setters
    public ArrayList<Products> getItems() {
        return items;
    }

    public void setItems(ArrayList<Products> items) {
        this.items = items;
    }
}
