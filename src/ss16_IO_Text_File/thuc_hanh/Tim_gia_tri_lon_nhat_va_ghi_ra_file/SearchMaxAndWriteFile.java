package ss16_IO_Text_File.thuc_hanh.Tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;

public class SearchMaxAndWriteFile {
    public static void searchMaxAndWriteFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("❌ File không tồn tại.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int max = Integer.MIN_VALUE;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                try {
                    int current = Integer.parseInt(line.trim());
                    if (current > max) {
                        max = current;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("⚠️ Dữ liệu không hợp lệ: '" + line + "' không phải là số.");
                }
            }
            writeFile(max);
        } catch (IOException e) {
            System.err.println("❌ Lỗi đọc file: " + e.getMessage());
        }
    }

    private static void writeFile(int max) {
        String filePath = "src/ss16_IO_Text_File/thuc_hanh/Tim_gia_tri_lon_nhat_va_ghi_ra_file/result.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write("Giá trị lớn nhất là: " + max);
            bw.newLine(); // Xuống dòng
        } catch (IOException e) {
            System.err.println("❌ Lỗi ghi file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String path = "src/ss16_IO_Text_File/thuc_hanh/Tim_gia_tri_lon_nhat_va_ghi_ra_file/number.txt";
        searchMaxAndWriteFile(path);
    }
}
