package ss8_Clean_Code_Refactoring.thuc_hanh.Refactoring_tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        return Math.PI * radius * radius * height;
    }
    public double getArea(int radius){
        return Math.PI * radius * radius;
    }

}