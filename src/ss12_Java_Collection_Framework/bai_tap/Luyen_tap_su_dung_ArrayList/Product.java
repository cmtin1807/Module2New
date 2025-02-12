package ss12_Java_Collection_Framework.bai_tap.Luyen_tap_su_dung_ArrayList;

public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(){}

    public Product(int id, String name, double price, String manufacturer, String description) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString(){
        return id + " " + name + " " + price + " " + quantity;
    }
}
