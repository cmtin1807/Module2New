package ss12_Java_Collection_Framework.thuc_hanh.Sap_xep_voi_Comparable_va_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen", 28, "DN");
        Student student2 = new Student("Quyet", 28, "DN");
        Student student3 = new Student("Cong", 28, "DN");
        Student student4 = new Student("Quyet", 30, "QN");
        Student student5 = new Student("Quyet", 30, "DN");

        Student student6 = new Student("Cong", 22, "Hue");
        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        Collections.sort(students);
        System.out.println(students);
        List<Student> students1 = new ArrayList<Student>();
        AgeComparator ageComparator = new AgeComparator();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);
        students1.add(student6);
        Collections.sort(students1, ageComparator );
        System.out.println(students1);


    }
}
