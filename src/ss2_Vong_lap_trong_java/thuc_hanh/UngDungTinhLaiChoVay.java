package ss2_Vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1. Nhập số tiền muốn gửi: ");
        double soTienBanDau = sc.nextDouble();
        if (soTienBanDau <= 0) {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
            return;
        }

        System.out.print("2. Nhập lãi suất 1 năm của ngân hàng (Đơn vị %): ");
        double laiSuat = sc.nextDouble();
        if (laiSuat <= 0) {
            System.out.println("Lãi suất phải lớn hơn 0.");
            return;
        }

        System.out.print("3. Nhập số tháng cần gửi: ");
        int soThang = sc.nextInt();
        if (soThang <= 0) {
            System.out.println("Số tháng gửi phải lớn hơn 0.");
            return;
        }

        double soTienLai = soTienBanDau * (laiSuat / 100) / 12 * soThang;
        double tongSoTien = soTienBanDau + soTienLai;

        System.out.println("Số tiền lãi bạn nhận được là: " + soTienLai);
        System.out.println("Tổng số tiền sau " + soThang + " tháng là: " + tongSoTien);

        sc.close();
    }
}
