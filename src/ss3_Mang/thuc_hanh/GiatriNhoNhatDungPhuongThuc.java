package ss3_Mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class GiatriNhoNhatDungPhuongThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap do dai cua mang toi 20: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Do dai cua mang khong phu hop: ");
            }
        } while (size > 20);
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Mang vua nhap la: " + Arrays.toString(array));
        System.out.println("Gia tri nho nhat cua mang la: " + minValue(array));

    }
    public static int minValue(int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
