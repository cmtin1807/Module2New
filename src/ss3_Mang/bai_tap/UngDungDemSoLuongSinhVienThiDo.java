package ss3_Mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size ;
        do {
            System.out.println("Nhap so luong sinh vien toi da 30 nguoi");
            size = sc.nextInt();
            if (size <= 0||size > 30) {
                System.out.println("So luong sinh vien chi toi da 30 nguoi");
            }
        }
        while (size <= 0||size > 30);
        int [] arr = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            int diemSo;
            do {
                System.out.println("Nhap diem sinh vien thu "+ (i+1)+" trong thang diem 10");
                diemSo = sc.nextInt();
                if (diemSo > 10||diemSo<0) {
                    System.out.println("Điểm số vừa nhập không hợp lệ vui lòng nhập lại: ");
                }
            }
            while (diemSo > 10||diemSo<0);
            arr[i] = diemSo;
            if (diemSo>=5){
                count++;
            }
        }
        System.out.println("Mang diem vua nhap la " + Arrays.toString(arr));

        System.out.println("So luong sinh vien do la: "+count+" nguoi");
    }
}
