package ss17_IO_Binary_File_Va_Serialization.thuc_hanh.Doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    public static void writeDataToFile(String path, List<Student> students) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
        fos.close();

    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
