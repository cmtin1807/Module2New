package ss6_Ke_thua.bai_tap.class_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 3 cạnh của tam giác
        System.out.print("Nhập cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhập cạnh thứ hai: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhập cạnh thứ ba: ");
        double side3 = scanner.nextDouble();

        // Nhập vào màu sắc của tam giác
        System.out.print("Nhập màu sắc của tam giác: ");
        scanner.nextLine(); // Tiêu thụ ký tự xuống dòng còn sót lại
        String color = scanner.nextLine();

        // Tạo đối tượng Triangle
        Triangle triangle = new Triangle(color, side1, side2, side3);

        // Hiển thị thông tin về tam giác
        System.out.println("\nThông tin tam giác:");
        System.out.println(triangle);

        scanner.close();
    }
}
