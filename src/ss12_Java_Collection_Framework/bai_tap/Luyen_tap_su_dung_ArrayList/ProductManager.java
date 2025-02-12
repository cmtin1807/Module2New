package ss12_Java_Collection_Framework.bai_tap.Luyen_tap_su_dung_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> productList = new ArrayList<Product>();
    Scanner scanner = new Scanner(System.in);

    // Thêm sản phẩm vào danh sách
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Kiểm tra xem ID có tồn tại trong danh sách không
    public boolean isIndexOfId(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Cập nhật thông tin sản phẩm theo ID
    public void updateProduct(int id) {
        if (isIndexOfId(id)) {
            for (Product product : productList) {
                if (product.getId() == id) {
                    System.out.println("Nhập tên sản phẩm: ");
                    String productName = scanner.nextLine();
                    product.setName(productName);

                    System.out.println("Nhập giá sản phẩm: ");
                    int productPrice = getValidIntInput("⚠️ Giá không hợp lệ! Vui lòng nhập lại: ");
                    product.setPrice(productPrice);

                    System.out.println("Nhập số lượng sản phẩm: ");
                    int productQuantity = getValidIntInput("⚠️ Số lượng không hợp lệ! Vui lòng nhập lại: ");
                    product.setQuantity(productQuantity);

                    System.out.println("✅ Cập nhật sản phẩm thành công");
                }
            }
        } else {
            System.out.println("❌ Không tìm thấy sản phẩm có ID: " + id);
        }
    }

    // Phương thức nhập số nguyên có kiểm tra lỗi
    private int getValidIntInput(String errorMessage) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print(errorMessage);
            }
        }
    }

    // Xóa sản phẩm theo ID
    public void deleteProduct(int id) {
        if (isIndexOfId(id)) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == id) {
                    productList.remove(i);
                }
            }
            System.out.println("✅ Xóa sản phẩm thành công");
        } else {
            System.out.println("❌ Không tìm thấy sản phẩm có ID: " + id);
        }
    }

    // Hiển thị danh sách sản phẩm
    public void printProductList() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm đang trống");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    // Tìm kiếm sản phẩm theo tên
    public void searchProduct(String productName) {
        List<Product> products = new ArrayList<>();
        boolean flag = false;
        productName = productName.toLowerCase();

        for (Product product : productList) {
            if (product.getName().toLowerCase().equals(productName)) {
                products.add(product);
                flag = true;
            }
        }

        if (flag) {
            System.out.println("✅ Tìm thấy sản phẩm:");
            products.forEach(product -> System.out.println(product));
        } else {
            System.out.println("❌ Không tìm thấy sản phẩm");
        }
    }

    // Sắp xếp danh sách sản phẩm theo giá tăng dần
    public List<Product> sortByPriceAscending() {
        productList.sort((p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()));
        return productList;
    }

    // Sắp xếp danh sách sản phẩm theo giá giảm dần
    public List<Product> sortByPriceDescending() {
        productList.sort((p1, p2) -> Integer.compare(p2.getPrice(), p1.getPrice()));
        return productList;
    }
}
