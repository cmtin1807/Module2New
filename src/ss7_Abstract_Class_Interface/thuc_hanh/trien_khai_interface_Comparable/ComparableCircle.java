package ss7_Abstract_Class_Interface.thuc_hanh.trien_khai_interface_Comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    public ComparableCircle(){}


    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getRadius()>o.getRadius()){
            return 1;
        }
        else if (this.getRadius()<o.getRadius()){
            return -1;
        }
        return 0;
    }
}
