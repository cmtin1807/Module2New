package ss12_Java_Collection_Framework.thuc_hanh.Phan_biet_HashMap_va_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen", 28, "DN");
        Student student2 = new Student("Quyet", 31, "QN");
        Student student3 = new Student("Cong", 22, "Hue");
        HashMap<Integer,Student> map = new HashMap<Integer,Student>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, student3);
        for (Map.Entry<Integer,Student> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println(map);
        HashSet<Student> set = new HashSet<Student>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student3);
        System.out.println(set);
        for (Student student : set) {
            System.out.println(student);
        }

    }
}
