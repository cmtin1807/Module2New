package ss15_Xu_li_ngoai_le_va_Debug.thuc_hanh.Su_dung_lop_ArrayIndexOutOfBoundsException;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionTest {
    public static Integer[] createArrayRandom(){
        Integer[] array = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void main(String[] args) {
        Integer[] array = createArrayRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số "+index+ " là: "+ array[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
