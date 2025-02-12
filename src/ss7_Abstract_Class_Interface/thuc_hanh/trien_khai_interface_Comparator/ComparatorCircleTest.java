package ss7_Abstract_Class_Interface.thuc_hanh.trien_khai_interface_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(10);
        circles[1] = new Circle(20);
        circles[2] = new Circle(5);
        System.out.println("before sorting circles: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator<Circle> circleComparator = new ComparatorCircle();
        Arrays.sort(circles, circleComparator);
        System.out.println("after sorting circles: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
