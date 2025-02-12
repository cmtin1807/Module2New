package ss3_Mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap gia tri phan tu thu "+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap " + Arrays.toString(array));

        System.out.println("Nhap vi tri can chen");
        int viTri = sc.nextInt();
        if (viTri < 0 || viTri > size ) {
            System.out.println("Vi tri chen khong hop le");
        }
        else {
            System.out.println("Nhap gia tri can chen");
            int giaTriChen = sc.nextInt();
            sc.nextLine();
            int [] newArray = new int[size+1];
            for (int i = 0; i < size+1; i++) {
                if (i < viTri) {
                    newArray[i] = array[i];
                } else if (i == viTri) {
                    newArray[i] = giaTriChen;
                }
                else {
                    newArray[i] = array[i-1];
                }
            }

            System.out.println("Mang sau khi chen " + Arrays.toString(newArray));
        }
    }
}
