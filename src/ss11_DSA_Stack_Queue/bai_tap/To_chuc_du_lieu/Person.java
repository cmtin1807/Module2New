package ss11_DSA_Stack_Queue.bai_tap.To_chuc_du_lieu;

import java.util.LinkedList;
import java.util.Queue;

class Person {
    String name;
    String gender;
    String dob; // Ngày sinh: dd/MM/yyyy

    public Person(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return name + " - " + gender + " - " + dob;
    }

    public static void main(String[] args) {
        Queue<Person> femaleQueue = new LinkedList<>();
        Queue<Person> maleQueue = new LinkedList<>();

        // Danh sách nhân sự đã sắp xếp theo ngày sinh
        Person[] people = {
                new Person("Nguyễn Thị A", "Nữ", "10/02/1990"),
                new Person("Trần Văn B", "Nam", "15/03/1991"),
                new Person("Lê Thị C", "Nữ", "22/07/1992"),
                new Person("Phạm Văn D", "Nam", "05/10/1993"),
                new Person("Hoàng Thị E", "Nữ", "30/12/1994"),
                new Person("Đỗ Văn F", "Nam", "08/06/1995")
        };

        // Phân loại vào queue theo giới tính
        for (Person p : people) {
            if (p.gender.equals("Nữ")) {
                femaleQueue.add(p);
            } else {
                maleQueue.add(p);
            }
        }

        // Xuất kết quả theo thứ tự yêu cầu (nữ trước, nam sau)
        System.out.println("Danh sách nhân sự sau khi sắp xếp:");
        while (!femaleQueue.isEmpty()) {
            System.out.println(femaleQueue.poll());
        }
        while (!maleQueue.isEmpty()) {
            System.out.println(maleQueue.poll());
        }
    }
}

