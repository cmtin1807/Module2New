package ss11_DSA_Stack_Queue.bai_tap.Kiem_tra_chuoi_Palindrome;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        System.out.println(isPalindrome(string));
    }
}
