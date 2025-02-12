package ss3_Mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập độ dài mảng
        System.out.print("Nhập độ dài mảng: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Nhập các phần tử của mảng
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập: " + Arrays.toString(arr));

        // Nhập giá trị cần kiểm tra
        System.out.print("Nhập giá trị cần kiểm tra: ");
        int check = sc.nextInt();


        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == check) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng!");
        } else {

            int[] newArr = new int[size - 1];
            for (int i = 0; i < size - 1; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else {
                    newArr[i] = arr[i + 1];
                }
            }
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(newArr));
        }
        sc.close();
    }
}
