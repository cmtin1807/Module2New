package ss17_IO_Binary_File_Va_Serialization.bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L; // Tránh lỗi khi thay đổi class
    private int id;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(int id, String name, double price, String manufacturer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
