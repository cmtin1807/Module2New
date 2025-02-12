package ss3_Mang.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTu {
    public static void main(String[] args) {
        String str = "Nguyen Duc Thao Nguyen";
        str = str.toLowerCase();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        sc.close();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("\n✅ Số lần xuất hiện của ký tự '" + ch + "' trong chuỗi là: " + count);
    }
}
