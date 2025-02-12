package ss5_Access_modifier_static.bai_tap;

public class Circle {
    private double radius;
    private String color = "blue";
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString(){
        return String.format("Circle[radius=%.2f,color=%s,area=%.2f]", radius, color, this.getArea());
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
    }

}
