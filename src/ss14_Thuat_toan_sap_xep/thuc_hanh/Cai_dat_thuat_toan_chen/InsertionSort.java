package ss14_Thuat_toan_sap_xep.thuc_hanh.Cai_dat_thuat_toan_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=key;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] arr = { 11, 22, 66, 7, 8, 9 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
