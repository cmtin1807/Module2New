package ss6_Ke_thua.bai_tap.class_Circle_va_class_Cylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(){}
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI*radius * radius;
    }
    public String toString(){
        return "A Circle with Radius " + radius + " and Color " + color+ "area " + getArea();
    }
}
