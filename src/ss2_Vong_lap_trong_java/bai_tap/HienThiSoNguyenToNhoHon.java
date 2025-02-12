package ss2_Vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách số nguyên tố nhỏ hơn: ");
        int number = sc.nextInt();
        danhSachSoNguyenTo(number);
        sc.close();

    }
    public static void danhSachSoNguyenTo(int number){

        if (number <=2){
            System.out.println("Không có số nguyên tố nhỏ hơn " + number);

        }
        for (int num = 2; num < number; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

    }
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}
