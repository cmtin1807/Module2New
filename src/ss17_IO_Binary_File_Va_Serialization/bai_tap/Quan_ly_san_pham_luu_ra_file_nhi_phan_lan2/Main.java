package ss17_IO_Binary_File_Va_Serialization.bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan_lan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ss17_IO_Binary_File_Va_Serialization.bai_tap.Quan_ly_san_pham_luu_ra_file_nhi_phan_lan2.ProductManager.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Product> productList = readProductsFromFile();
        while (true) {
            System.out.println("\n====== QUẢN LÝ SẢN PHẨM ======");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo ID");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addProduct(productList);
                    break;
                case 2:
                    displayProducts(productList);
                    break;
                case 3:
                    searchProduct();
                    break;

                case 4:
                    System.out.println("✅ Thoát chương trình.");
                    return;
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

        }

    }
}