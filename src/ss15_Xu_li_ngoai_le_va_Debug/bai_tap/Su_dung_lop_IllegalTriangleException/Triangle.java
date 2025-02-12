package ss15_Xu_li_ngoai_le_va_Debug.bai_tap.Su_dung_lop_IllegalTriangleException;

public class Triangle {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0) {
            throw new IllegalTriangleException("⚠️ Cạnh tam giác phải là số dương!");
        }
        if (a+b<=c || b+c<=a || c+a<=b) {
            throw new IllegalTriangleException("⚠️ Tổng hai cạnh không lớn hơn cạnh còn lại!");
        }
        System.out.println("✅ Đây là một tam giác hợp lệ.");
    }
}
