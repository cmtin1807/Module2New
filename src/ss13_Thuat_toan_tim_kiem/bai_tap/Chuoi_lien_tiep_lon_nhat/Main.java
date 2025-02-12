package ss13_Thuat_toan_tim_kiem.bai_tap.Chuoi_lien_tiep_lon_nhat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        List<Character> max = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            List<Character> list = new ArrayList<>();
            list.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > s.charAt(j-1)) {
                    list.add(s.charAt(j));
                }
                else {
                    break;
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character c : max) {
            System.out.print(c);
        }
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

