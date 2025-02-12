package ss3_Mang.bai_tap;

import java.util.Scanner;

public class TongGiaTriDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước của ma trận: ");
        int size = sc.nextInt();
        int [][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị hàng " + (i + 1) + " cột " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("\n🔹 Ma trận vừa nhập:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];
        }
        System.out.println("\n✅ Tổng giá trị của đường chéo chính là: " + sum);

    }
}
