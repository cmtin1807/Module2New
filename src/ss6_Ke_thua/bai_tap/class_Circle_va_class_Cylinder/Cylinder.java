package ss6_Ke_thua.bai_tap.class_Circle_va_class_Cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {}

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height*super.getArea();
    }
    public String toString(){
        return "Cylinder Height: " + height +", Radius"+super.getRadius()+", Color "+super.getColor()+ " Volume: " + getVolume();
    }
}
