package ss12_Java_Collection_Framework.bai_tap.Luyen_tap_su_dung_ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(1,"SamSung",11000,1));
        productManager.addProduct(new Product(2,"SamSung",21000,2));
        productManager.addProduct(new Product(3,"Iphone",31000,3));
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n------ QUẢN LÝ SẢN PHẨM ------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng trống
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    int price = scanner.nextInt();
                    System.out.print("Nhập số lượng: ");
                    int quantity = scanner.nextInt();
                    productManager.addProduct(new Product(id, name, price, quantity));
                    System.out.println("✅ Đã thêm sản phẩm!");
                    break;

                case 2:
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    productManager.updateProduct(updateId);
                    break;

                case 3:
                    System.out.print("Nhập ID sản phẩm cần xoá: ");
                    int removeId = scanner.nextInt();
                    productManager.deleteProduct(removeId);
                    break;
                case 4:
                    System.out.println("📌 Danh sách sản phẩm:");
                    productManager.printProductList();
                    break;

                case 5:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    productManager.searchProduct(searchName);
                    break;

                case 6:
                    productManager.sortByPriceAscending();
                    System.out.println("✅ Đã sắp xếp tăng dần theo giá!");
                    break;

                case 7:
                    productManager.sortByPriceDescending();
                    System.out.println("✅ Đã sắp xếp giảm dần theo giá!");
                    break;

                case 0:
                    System.out.println("🔚 Thoát chương trình!");
                    break;

                default:
                    System.out.println("❌ Chức năng không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

