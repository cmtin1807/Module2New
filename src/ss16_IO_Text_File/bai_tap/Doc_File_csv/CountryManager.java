package ss16_IO_Text_File.bai_tap.Doc_File_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryManager {
    public static List<Country> getCountries(String path) {
        List<Country> countryList = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            System.err.println("❌ File không tồn tại: " + path);
            return countryList; // Trả về danh sách rỗng thay vì null
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                if (split.length < 3) { // Kiểm tra dữ liệu hợp lệ
                    System.err.println("⚠️ Dữ liệu không hợp lệ: " + line);
                    continue;
                }
                try {
                    int id = Integer.parseInt(split[0].trim()); // Loại bỏ khoảng trắng thừa
                    String code = split[1].trim();
                    String name = split[2].trim();
                    countryList.add(new Country(id, code, name));
                } catch (NumberFormatException e) {
                    System.err.println("⚠️ Lỗi chuyển đổi số: " + split[0] + " → " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("❌ Lỗi đọc file: " + e.getMessage());
        }
        return countryList;
    }
}
