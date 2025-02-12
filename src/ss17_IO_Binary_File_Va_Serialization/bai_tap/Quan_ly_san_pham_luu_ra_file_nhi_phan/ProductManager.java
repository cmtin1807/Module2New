package ss17_IO_Binary_File_Va_Serialization.bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static ss17_IO_Binary_File_Va_Serialization.bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan.Main.scanner;

public class ProductManager {
    private static final String FILE_PATH = "src/ss17_IO_Binary_File_Va_Serialization/bai_tap/Quan_ly_san_pham_luu_ra_file_nhi_phan/products.dat";

    // 1️⃣ Ghi danh sách sản phẩm vào file nhị phân
    public static void writeProductsToFile(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(products);
            System.out.println("✅ Ghi sản phẩm thành công!");
        } catch (IOException e) {
            System.out.println("❌ Lỗi khi ghi file: " + e.getMessage());
        }
    }

    // 2️⃣ Đọc danh sách sản phẩm từ file nhị phân
    public static List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return products; // Trả về danh sách rỗng nếu file chưa tồn tại
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            products = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Lỗi khi đọc file: " + e.getMessage());
        }
        return products;
    }

    // 3️⃣ Tìm kiếm sản phẩm theo mã ID
    public static Product searchProductById(int id) {
        List<Product> products = readProductsFromFile();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    // 1️⃣ Thêm sản phẩm
    public static void addProduct(List<Product> products) {
        System.out.print("Nhập mã sản phẩm: ");
        int id = getValidIntInput("Mã sản phẩm vừa nhập không phải dạng số nguyên. Vui lòng nhập lại ");
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = getValidDoubleInput("Giá nhập không phải dạng số thập phân. Vui lòng nhập lại ");
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();

        Product newProduct = new Product(id, name, price, manufacturer, description);
        products.add(newProduct);
        ProductManager.writeProductsToFile(products);
        System.out.println("✅ Thêm sản phẩm thành công!");
    }

    // 2️⃣ Hiển thị danh sách sản phẩm
    public static void displayProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("❌ Không có sản phẩm nào.");
            return;
        }
        System.out.println("\n📌 Danh sách sản phẩm:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // 3️⃣ Tìm kiếm sản phẩm theo ID
    public static void searchProduct() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product product = ProductManager.searchProductById(id);
        if (product != null) {
            System.out.println("✅ Tìm thấy sản phẩm:");
            System.out.println(product);
        } else {
            System.out.println("❌ Không tìm thấy sản phẩm có mã " + id);
        }
    }
    public static int getValidIntInput(String error) {
        while (true) {
            try{
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.err.println(error);
            }
        }
    }
    public static Double getValidDoubleInput(String error) {
        while (true) {
            try{
                String input = scanner.nextLine().trim();
                return Double.parseDouble(input);
            }
            catch (NumberFormatException e) {
                System.err.println(error);
            }
        }
    }
}
