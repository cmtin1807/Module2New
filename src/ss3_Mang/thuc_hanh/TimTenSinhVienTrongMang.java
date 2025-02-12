package ss3_Mang.thuc_hanh;

import java.util.Scanner;

public class TimTenSinhVienTrongMang {
    public static void main(String[] args) {
        String [] students = {"Nguyen","Duc","Trung","Quyet","Hieu"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien can tim");
        String studentName = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
                System.out.println("Ten "+studentName+" nam o vi tri " +i);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Khong tim thay "+studentName);
        }
        sc.close();
    }
}
