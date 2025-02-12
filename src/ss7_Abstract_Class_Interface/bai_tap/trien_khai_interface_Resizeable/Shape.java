package ss7_Abstract_Class_Interface.bai_tap.trien_khai_interface_Resizeable;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of "+color+ (filled ? " and filled" : " and not filled");
    }


}
