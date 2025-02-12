package ss15_Xu_li_ngoai_le_va_Debug.thuc_hanh.Su_dung_lop_NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    private static void calculation(int x, int y) {
        int a = x + y;
        int b = x - y;
        int c = x * y;
        System.out.println("Tổng của x + y = " + a);
        System.out.println("Hiệu của x - y = " + b);
        System.out.println("Tích của x * y = " + c);

        try {
            int d =  x / y;
            System.out.println("Thương của x / y = " + d);
        } catch (ArithmeticException e){
            System.err.println("Không thể chia cho 0!" );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập x: ");
        int x = getValidIntInput(sc, "⚠️ Nhập số không hợp lệ! Vui lòng nhập lại: ");
        System.out.print("Hãy nhập y: ");
        int y = getValidIntInput(sc, "⚠️ Nhập số không hợp lệ! Vui lòng nhập lại: ");
        calculation(x, y);
        sc.close();
    }

    public static int getValidIntInput(Scanner sc, String error) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println(error);
            }
        }
    }
}
