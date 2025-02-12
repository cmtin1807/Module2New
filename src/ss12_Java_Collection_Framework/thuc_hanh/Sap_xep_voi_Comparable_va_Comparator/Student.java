package ss12_Java_Collection_Framework.thuc_hanh.Sap_xep_voi_Comparable_va_Comparator;

import java.util.Comparator;

public class Student implements  Comparable<Student> {
    private String name;
    private int age;
    private String address;
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return name + " " + age + " " + address ;
    }


    @Override
    public int compareTo(Student o) {
        if(this.age > o.getAge()){
            return 1;
        }
        else if(this.age < o.getAge()){
            return -1;
        }
        return 0;
    }
}
