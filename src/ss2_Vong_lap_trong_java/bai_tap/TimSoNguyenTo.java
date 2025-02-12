package ss2_Vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int soLuong = sc.nextInt();
        soNguyenTo(soLuong);
        sc.close();
    }

    public static void soNguyenTo(int soLuong) {
        int count = 0;
        int number = 2;
        while (count < soLuong) {
            if (isPrime(number)){
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
