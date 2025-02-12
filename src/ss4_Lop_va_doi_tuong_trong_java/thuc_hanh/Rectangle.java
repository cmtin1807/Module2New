package ss4_Lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    private double height;
    private double width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public String display (){
        return "Height: " + height + " Width: " + width + " Area: " + getArea();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle: ");
        double height = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        Rectangle r = new Rectangle(height, width);
        System.out.println(r.display());
        System.out.println("Perimeter of the rectangle: " + r.getPerimeter());
        System.out.println("Area of the rectangle: " + r.getArea());
    }
}
