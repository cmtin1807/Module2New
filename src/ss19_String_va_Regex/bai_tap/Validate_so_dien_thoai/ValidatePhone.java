package ss19_String_va_Regex.bai_tap.Validate_so_dien_thoai;

public class ValidatePhone {
    public static boolean isValidPhone(String phone) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phone.matches(regex);
    }
    public static void main(String[] args) {
        String [] numberPhones = {"(84)-(0978489648)","a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        for (String phone : numberPhones) {
            System.out.println("Số điện thoại: "+ phone+ (isValidPhone(phone)?" Hợp lệ": " Không hợp lệ"));
        }
    }
}
