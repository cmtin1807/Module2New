package ss15_Xu_li_ngoai_le_va_Debug.bai_tap.Su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

import static ss15_Xu_li_ngoai_le_va_Debug.bai_tap.Su_dung_lop_IllegalTriangleException.Triangle.checkTriangle;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập cạnh a: ");
        double a = getValidDoubleInput(sc, "⚠️ Nhập không hợp lệ! Vui lòng nhập lại: ");
        System.out.println("Hãy nhập cạnh b: ");
        double b = getValidDoubleInput(sc, "⚠️ Nhập không hợp lệ! Vui lòng nhập lại: ");
        System.out.println("Hãy nhập cạnh c: ");
        double c = getValidDoubleInput(sc, "⚠️ Nhập không hợp lệ! Vui lòng nhập lại: ");
        try {
            checkTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }

    }
    public static double getValidDoubleInput (Scanner sc, String error) {
        while (true){
            try {
                String input = sc.nextLine().trim();
                return Double.parseDouble(input);
            }
            catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }
}
