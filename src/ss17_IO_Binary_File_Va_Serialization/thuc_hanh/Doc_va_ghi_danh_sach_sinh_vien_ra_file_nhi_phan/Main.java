package ss17_IO_Binary_File_Va_Serialization.thuc_hanh.Doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import static ss17_IO_Binary_File_Va_Serialization.thuc_hanh.Doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan.StudentManager.readDataFromFile;
import static ss17_IO_Binary_File_Va_Serialization.thuc_hanh.Doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan.StudentManager.writeDataToFile;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        try {
            writeDataToFile("src/ss17_IO_Binary_File_Va_Serialization/thuc_hanh/Doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan/output.txt",students);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> studentDataFromFile = readDataFromFile("src/ss17_IO_Binary_File_Va_Serialization/thuc_hanh/Doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan/output.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }

    }

}
