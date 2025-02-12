package ss7_Abstract_Class_Interface.thuc_hanh.trien_khai_interface_Comparator;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius()>o2.getRadius()){
            return 1;
        }
        else if (o1.getRadius()<o2.getRadius()){
            return -1;
        }
        return 0;
    }
}
