package ss16_IO_Text_File.bai_tap.Copy_File_Text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> readFile(String fileName) {
        File file = new File(fileName);
        List<String> list = new ArrayList<String>();
        if (!file.exists()) {
            System.err.println("Đường dẫn File: " + fileName+ " không tồn tại");
            return null;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("❌ Lỗi khi đọc file: " + e.getMessage());
        }
        return list;
    }
    public static void writeFile(String fileName, List<String> list) {
        File file = new File(fileName);
        if (file.exists()) {
            System.err.println("Đường dẫn File: " + fileName+ " đã tồn tại");
            return;
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
//            for (int i = 0; i < list.size(); i++){
//                bufferedWriter.write(list.get(i));
//                if (i < list.size() - 1) { // Không thêm dòng trống sau dòng cuối cùng
//                    bufferedWriter.newLine();
//                }
//            }
            bufferedWriter.write(String.join("\n", list));
        } catch (IOException e) {
            System.err.println("❌ Lỗi khi đọc file: " + e.getMessage());
        }
    }
    public static void main (String[] args){
        String path = "src/ss16_IO_Text_File/bai_tap/Copy_File_Text/number.txt";
        List<String> stringList = readFile(path);
        String fileName = "src/ss16_IO_Text_File/bai_tap/Copy_File_Text/copy.txt";
        writeFile(fileName, stringList);
    }
}
