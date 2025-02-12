package ss3_Mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: "+(i+1));
            int x = sc.nextInt();
            arr[i] = x;
        }
        System.out.println("Mảng vừa nhập"+Arrays.toString(arr));
        System.out.println("Mảng đảo ngược"+Arrays.toString(daoNguocMang(arr)));
        daoNguocMang2(arr);
        System.out.println("Mảng đảo ngược"+Arrays.toString(arr));

        sc.close();


    }
    public static int [] daoNguocMang (int [] arr) {
        int size = arr.length;
        int [] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[size - i - 1] = arr[i];
        }
        return newArr;
    }
    public static void daoNguocMang2 (int [] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int number = arr[left];
            arr[left] = arr[right];
            arr[right] = number;
            left++;
            right--;
        }
    }
}
