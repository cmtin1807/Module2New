package ss19_String_va_Regex.thuc_hanh.Validate_email;

import java.util.regex.Pattern;

public class ValidateEmail {
    public static boolean checkValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",       // Hợp lệ
                "user.name@example.com",  // Hợp lệ
                "user_name@example.co.uk", // Hợp lệ
                "user@sub.example.com",   // Hợp lệ
                "user@example",           // Không hợp lệ (không có phần mở rộng miền)
                "user@.com",              // Không hợp lệ (không có tên miền)
                "@example.com",           // Không hợp lệ (không có tên email)
                "user@example..com"       // Không hợp lệ (hai dấu `..`)
        };

        for (String email : emails) {
            boolean isValid = checkValidEmail(email);
            System.out.println(email + " -> " + (isValid ? "Hợp lệ" : "Không hợp lệ"));
        }

    }
}
