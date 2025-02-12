package ss19_String_va_Regex.example;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text1 = "2/12/2025";
        String text2 = "2/12/202a";
        String text3 = "2-12-2025";
        Pattern pattern = Pattern.compile("\\d{1,2}[/-]{1}\\d{1,2}[/-]\\d{1,4}");
        System.out.println("\nChuỗi " + text1 + " có định dạng ngày tháng: "

                + pattern.matcher(text1).matches());
        System.out.println("Chuỗi " + text2 + " có định dạng ngày tháng: "+ pattern.matcher(text2).matches());
        System.out.println("Chuỗi " + text3 + " Có định dạng ngày tháng: " + pattern.matcher(text3).matches());
        String a = "Welcome";
        String b = "Welcome";
        String c = new String("Welcome");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a.equals(b));
        String a1 = "Welcome";
        Character[] a2 = {'W', 'e', 'l','c','o','m','e'};

        char [] a3 = {'W','e','l','c','o','m','e'};

        String a4 = new String("Welcome");

        String a5 = new String(Arrays.toString(a2).replaceAll("[\\[\\], ]",""));
        String a6 = new String(a3);
        Character[] a7 = {'W', 'e', 'l','c','o','m','e'};
        String a8 = new String(Arrays.stream(a7).map(String::valueOf).collect(Collectors.joining("")));

        String a9 = "Wel";
        String a10 = "come";
        String a11 = a9+a10;
        String a12 = a9.concat(a10);

        System.out.println(a1.hashCode());
        System.out.println(a4.hashCode());
        System.out.println(a5.hashCode());
        System.out.println(a6.hashCode());
        System.out.println(a1.equals(a4));
        System.out.println(a5);
        System.out.println(a1.equals(a6));
        System.out.println(a8.hashCode());
        System.out.println(a11.hashCode());
        System.out.println(a12.hashCode());


    }
}
