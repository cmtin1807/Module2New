package ss7_Abstract_Class_Interface.bai_tap.trien_khai_interface_Resizeable;


public class ResizeableTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Rectangle(100,200);
        shapes[1] = new Circle(100);
        shapes[2] = new Square(100);
        System.out.println("Before Resize");
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println(rectangle);
            }
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle);
            }

        }
        double percent = Math.random()*100;
        System.out.println("After Resize");
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(percent);
                System.out.println(rectangle);
            }
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.resize(percent);
                System.out.println(circle);
            }

        }

    }
}
