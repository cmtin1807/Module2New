package ss4_Lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    // Constructor không tham số
    public QuadraticEquation() {}

    // Constructor có tham số
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter và Setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Tính biệt số Δ = b^2 - 4ac
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Tính nghiệm thứ nhất x1
    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return Double.NaN; // Không có nghiệm thực
        }
    }

    // Tính nghiệm thứ hai x2
    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return Double.NaN; // Không có nghiệm thực
        }
    }

    // Kiểm tra và in kết quả nghiệm phương trình
    public void displayRoots() {
        double delta = getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tạo đối tượng QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Hiển thị kết quả nghiệm phương trình
        equation.displayRoots();
        equation.getRoot1();
        equation.getRoot2();

        scanner.close();
    }
}
