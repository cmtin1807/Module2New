package ss13_Thuat_toan_tim_kiem.bai_tap.Chuoi_tang_dan_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > temp.getLast()) {
                    temp.add(string.charAt(j));
                }
                if (temp.size() > max.size()) {
                    max.clear();
                    max.addAll(temp);
                }
            }
            temp.clear();
        }
        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }
    }



/*********************************************************************************
 * 	Tính toán độ phức tạp của bài toán:                                           *
 * 	1 vòng lặp bên ngoài = n;                                                     *
 * 	1 vòng lặp bên trong = n - 1;                                                 *
 *  1 câu lệnh = 1                                                                *
 * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
 *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
 *  T(n) = O(n^2) + O(n);                                                         *
 * 	T(n) = O(n^2);                                                                *
 * 	=> Độ phức tạp bài toán này là O(n^2)                                         *
 *********************************************************************************/
}