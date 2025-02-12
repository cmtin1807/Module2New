package ss7_Abstract_Class_Interface.bai_tap.trien_khai_interface_Colorable;


public class ColorableTest {
    public static void main(String[] args) {
        Shape[]shapes = new Shape[4];
        shapes[0] = new Rectangle(4,5);
        shapes[1] = new Circle(4);
        shapes[2] = new Square(4);
        shapes[3] = new Square(5);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }

            }
        }
    }
