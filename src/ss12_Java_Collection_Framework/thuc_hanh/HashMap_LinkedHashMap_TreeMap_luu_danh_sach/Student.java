package ss12_Java_Collection_Framework.thuc_hanh.HashMap_LinkedHashMap_TreeMap_luu_danh_sach;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Student {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Nguyen", 23);
        map.put("Quyet", 24);
        map.put("Cong", 25);
        map.put("Hieu", 26);
        map.put("Man", 28);
        System.out.println("Danh sach HashMap: " + map);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        linkedHashMap.put("Nguyen", 23);
        linkedHashMap.put("Quyet", 24);
        linkedHashMap.put("Cong", 25);
        linkedHashMap.put("Hieu", 26);
        linkedHashMap.put("Man", 28);
        System.out.println("Danh sach LinkedHashMap: " + linkedHashMap);
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("Nguyen", 23);
        treeMap.put("Quyet", 24);
        treeMap.put("Cong", 25);
        treeMap.put("Hieu", 26);
        treeMap.put("Man", 28);
        System.out.println("Danh sach TreeMap: " + treeMap);
        TreeMap<String, Integer> treeMap1 = new TreeMap<>(linkedHashMap);
        System.out.println("Danh sach TreeMap: " + treeMap1);
    }
}
