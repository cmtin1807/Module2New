package ss3_Mang.thuc_hanh;

import java.util.Scanner;

public class GiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhap so luong phan tu toi da 20 : ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("So vua nhap khong hop le");
            }
        }while (size>20);
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap gia tri phan tu thu "+(i+1)+" : ");
            int x = sc.nextInt();
            arr[i] = x;
        }
        sc.close();
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("gia tri lon nhat cua mang la :" + max);

    }
}
