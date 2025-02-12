package ss19_String_va_Regex.thuc_hanh.Validate_account;

import java.util.regex.Pattern;

public class ValidateAccount {
    public static boolean checkValidAccount(String account) {
        String regex = "^[a-z0-9_-]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(account).matches()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String [] accounts = {"123abc_", "_abc123", "______", "123456", "abcdefgh",".@", "12345", "1234_", "abcde"};
        for (String account : accounts) {
            System.out.println("Account: " + account+ (checkValidAccount(account)?"  -->  Hợp lệ": "  --> Không hợp lệ"));
        }
    }
}
