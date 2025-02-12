package ss12_Java_Collection_Framework.thuc_hanh.Sap_xep_voi_Comparable_va_Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() == o2.getAge()) {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
            else {
                return o1.getName().compareTo(o2.getName());
            }
        }
        return -1;

    }
}
