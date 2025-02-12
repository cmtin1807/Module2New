package ss9_Automated_Testing_TDD.bai_tap.phan_loai_tam_giac;

public class Triangle {
    public static boolean isTriangle(int a, int b, int c) {
        return (a+b>c && a+c>b && b+c>a);
    }
    public static String checkTypeTriangle(int a, int b, int c) {
        if (isTriangle(a, b, c)) {
            if (a==b && b==c) {
                return "tam giác đều";
            }
            else if (a==b || b==c || a==c) {
                return "tam giác cân";
            }
            else {
                return "tam giác thường";
            }
        }
        else {
            return "không phải là tam giác";
        }

    }
}
