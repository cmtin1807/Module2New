package ss9_Automated_Testing_TDD.bai_tap.chuong_trinh_tinh_ket_qua_fizzbuzz;

public class FizzBuzz {
    public static boolean isFizz(int num) {
        return num % 3 == 0;
    }
    public static boolean isBuzz(int num) {
        return num % 5 == 0;
    }
    public static String fizzBuzz(int num) {
        if (isFizz(num)&&isBuzz(num)) {
            return "FizzBuzz";
        }
        if (isFizz(num)) {
            return "Fizz";
        }
        if (isBuzz(num)) {
            return "Buzz";
        }
        return numberToString(num);

    }
    public static String numberToString(int num) {
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String [] stringNumber = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
        if (num<10){
            return stringNumber[num];
        }
        else {
            int chuc = num/10;
            int donVi = num%10;
            return stringNumber[chuc]+" "+stringNumber[donVi];
        }
    }
}
