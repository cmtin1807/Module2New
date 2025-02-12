package ss7_Abstract_Class_Interface.bai_tap.trien_khai_interface_Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
    public String toString(){
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setWidth(width*(1+percent/100));
        this.setLength(length*(1+percent/100));
    }
}
