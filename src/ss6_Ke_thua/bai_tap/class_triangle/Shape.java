package ss6_Ke_thua.bai_tap.class_triangle;

public class Shape {
    private String color;
    public Shape() {
        color = "black";
    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Color: " + color;
    }
}
