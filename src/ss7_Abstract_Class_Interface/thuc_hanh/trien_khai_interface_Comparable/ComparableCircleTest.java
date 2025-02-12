package ss7_Abstract_Class_Interface.thuc_hanh.trien_khai_interface_Comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(5);
        comparableCircles[1] = new ComparableCircle(20,"blue", false);
        comparableCircles[2] = new ComparableCircle(15);
        System.out.println("Before sorting:");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("After sorting:");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle);
        }

    }
}
