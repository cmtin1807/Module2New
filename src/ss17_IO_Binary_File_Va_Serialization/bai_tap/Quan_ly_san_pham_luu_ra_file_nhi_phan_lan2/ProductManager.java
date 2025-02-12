package ss17_IO_Binary_File_Va_Serialization.bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan_lan2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static ss17_IO_Binary_File_Va_Serialization.bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan.Main.scanner;

public class ProductManager {
    private static final long SerialVersionUID=1L;
    private static final String FILE_PATH = "src/ss17_IO_Binary_File_Va_Serialization/bai_tap/Quan_ly_san_pham_luu_ra_file_nhi_phan_lan2/products.dat";

    public static void addProduct(List<Product> productList) {
        System.out.print("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();
        Product product = new Product(id,name,price,manufacturer,description);
        productList.add(product);
        writeProductsToFile(productList);
        System.out.println("✅ Thêm sản phẩm thành công!");
    }
    public static void writeProductsToFile(List<Product> productList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(productList);
            System.out.println("✅ Ghi sản phẩm thành công!");
        } catch (
                FileNotFoundException e) {
            System.out.println("❌ Lỗi đường dẫn không hợp lệ: " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("❌ Lỗi khi ghi file: " + e.getMessage());
        }
    }
    public static void displayProducts(List<Product> productList) {
        readProductsFromFile();
        if (productList.isEmpty()) {
            System.out.println("❌ Không có sản phẩm nào.");
            return;
        }
        System.out.println("\n📌 Danh sách sản phẩm:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    public static List<Product> readProductsFromFile() {
        List<Product> productList = new ArrayList<Product>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return productList;
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            productList = (List<Product>) objectInputStream.readObject();

        }  catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Lỗi khi đọc file: " + e.getMessage());
        }
        return productList;
    }
    public static void searchProduct(){
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = searchProductByID(id);
        if (product != null) {
            System.out.println("✅ Tìm thấy sản phẩm:");
            System.out.println(product);
        } else {
            System.out.println("❌ Không tìm thấy sản phẩm có mã " + id);
        }


    }
    public static Product searchProductByID(int id) {
        List<Product> productList = readProductsFromFile();
        if (productList.isEmpty()) {
            return null;
        }
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
