package ss2_Vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KiemTraSoNguyenTo checker = new KiemTraSoNguyenTo();

        while (true) {
            System.out.println("Nhập lựa chọn:");
            System.out.println("1. Kiểm tra số nguyên tố.");
            System.out.println("2. Thoát.");
            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.println("Chương trình kết thúc.");
                break;
            } else if (choice == 1) {
                System.out.println("Nhập số nguyên:");
                int number = sc.nextInt();
                if (checker.kiemTraSoNguyenTo(number)) {
                    System.out.println(number + " là số nguyên tố.");
                } else {
                    System.out.println(number + " không phải là số nguyên tố.");
                }
            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
        sc.close();
    }

    public boolean kiemTraSoNguyenTo(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
