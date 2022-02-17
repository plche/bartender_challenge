/**
 * Item
 */
public class Item {

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for price
    public double getPrice() {
        return price;
    }

    // setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}