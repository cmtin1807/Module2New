package ss7_Abstract_Class_Interface.bai_tap.trien_khai_interface_Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle( double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= (1+ percent/100);
    }
}
