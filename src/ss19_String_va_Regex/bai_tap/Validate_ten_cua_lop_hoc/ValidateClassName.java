package ss19_String_va_Regex.bai_tap.Validate_ten_cua_lop_hoc;

public class ValidateClassName {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[G-K]";
        return className.matches(regex);
    }
    public static void main(String[] args) {
        String [] className = {"C0223G", "A0323K", "M0318G", "P0323A"};
        for (int i = 0; i < className.length; i++) {
            System.out.println("Tên lớp học: " + className[i]+ (isValidClassName(className[i])?" Hợp lệ":" Không hợp lệ"));
        }
    }
}
