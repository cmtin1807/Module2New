package ss6_Ke_thua.bai_tap.class_Circle_va_class_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"black");
        circle.getArea();
        System.out.println(circle.getArea());
        System.out.println(circle);
        Circle cylinder = new Cylinder(2,"blue",10);
        cylinder.getArea();
        System.out.println(cylinder.getArea());
        System.out.println(cylinder);


    }
}
