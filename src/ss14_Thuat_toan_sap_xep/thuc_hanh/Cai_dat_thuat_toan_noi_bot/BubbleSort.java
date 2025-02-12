package ss14_Thuat_toan_sap_xep.thuc_hanh.Cai_dat_thuat_toan_noi_bot;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] list) {
        boolean swapped;
        for (int i = 0; i < list.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
                System.out.println(Arrays.toString(list));
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] list = { 8,6,34,22,11};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
