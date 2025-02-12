package ss6_Ke_thua.bai_tap.class_Point_va_class_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(2, 3, 1, 1);
        System.out.println("Trước khi di chuyển: " + point);

        point.move();
        System.out.println("Sau khi di chuyển lần 1: " + point);

        point.move();
        System.out.println("Sau khi di chuyển lần 2: " + point);
    }
}
