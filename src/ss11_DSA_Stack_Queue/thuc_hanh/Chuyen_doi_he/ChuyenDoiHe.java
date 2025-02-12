package ss11_DSA_Stack_Queue.thuc_hanh.Chuyen_doi_he;

import java.util.Stack;

public class ChuyenDoiHe {
    public static String thapPhanSangNhiPhan(int number) {
        if (number == 0) return "0"; // Trường hợp đặc biệt

        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2); // Lấy phần dư
            number /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop()); // Lấy ra từ Stack
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int number = 30;
        System.out.println("Số nhị phân của " + number + " là: " + thapPhanSangNhiPhan(number));
    }
}
