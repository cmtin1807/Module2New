package ss6_Ke_thua.bai_tap.class_triangle;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    public Triangle () {
        side1 = side2 = side3 = 1.0;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }


    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter (){
        if (isValidTriangle()) {
            return side1 + side2 + side3;
        }
        else {
            return Double.NaN;
        }
    }
    public double getArea() {
        if (isValidTriangle()) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        }
        else {
            return Double.NaN;
        }
    }
    public boolean isValidTriangle (){
        return (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2);
    }
    public String toString(){
        return (isValidTriangle() ? "A triangle with sides: " + side1 + ", " + side2 + ", " + side3 + ", Area: " + getArea()+ ", Perimeter: " + getPerimeter()
                + "\nTriangle color: " + getColor() : "These sides do not form a valid triangle. ");
    }

}
