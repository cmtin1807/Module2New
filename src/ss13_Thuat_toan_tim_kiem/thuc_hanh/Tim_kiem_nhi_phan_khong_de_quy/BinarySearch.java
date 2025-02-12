package ss13_Thuat_toan_tim_kiem.thuc_hanh.Tim_kiem_nhi_phan_khong_de_quy;

import java.util.List;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static void binarySearch(int[] list, int target) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == target) {
                System.out.println(mid);
                return;
            }
            if (list[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Khong co so can tim");
    }

    public static void main(String[] args) {
        binarySearch(list, 2);  /* 0 */
        binarySearch(list, 11); /* 4 */
        binarySearch(list, 79); /*12 */
        binarySearch(list, 1);  /*-1 */
        binarySearch(list, 5);  /*-1 */
        binarySearch(list, 80); /*-1 */
    }
}
