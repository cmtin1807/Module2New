package ss2_Vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class MenuUngDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isChoice = true;
        while (isChoice) {
            System.out.println("1. Vẽ hình tam giác. ");
            System.out.println("2. Vẽ hình vuông: ");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("0. Thoát");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ cao: ");
                    int cao = sc.nextInt();
                    veTamGiac(cao);
                    break;
                case 2:
                    System.out.println("Nhập cạnh: ");
                    int canh = sc.nextInt();
                    veHinhVuong(canh);
                    break;
                case 3:
                    System.out.println("Nhập chiều ngang");
                    int ngang = sc.nextInt();
                    System.out.println("Nhập chiều dọc");
                    int doc = sc.nextInt();
                    veHinhChuNhat(ngang,doc);
                    break;
                case 0:
                    isChoice = false;
                default:
                    System.out.println("Số vừa nhập không hợp lệ: ");

            }
        }
        sc.close();
    }
    public static void veTamGiac (int cao){
        for (int i=1; i<=cao; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void veHinhVuong (int canh){
        for (int i=0; i<canh; i++){
            for (int j=0; j<canh; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void veHinhChuNhat(int ngang, int doc){
        for (int i=0; i<doc; i++){
            for (int j=0; j<ngang; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
