package ss3_Mang.bai_tap;

import java.util.Scanner;

public class TinhTongGiaTriCotCuaMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập kích thước ma trận
        System.out.print("Nhập kích thước của ma trận: ");
        int size = sc.nextInt();

        int[][] arr = new int[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị hàng " + (i + 1) + " cột " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("\n🔹 Ma trận vừa nhập:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


        int cot;
        do {
            System.out.print("\nNhập cột cần tính tổng (1 - " + size + "): ");
            cot = sc.nextInt();
            if (cot <= 0 || cot > size) {
                System.out.println("⚠ Dữ liệu nhập không hợp lệ! Vui lòng nhập lại.");
            }
        } while (cot <= 0 || cot > size);


        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][cot - 1];
        }


        System.out.println("\n✅ Tổng giá trị của cột " + cot + " là: " + sum);

        sc.close();
    }
}
