package ss16_IO_Text_File.thuc_hanh.Tinh_tong_cac_so_trong_file_text;

import java.io.*;

public class ReadFileExample {
    public static void readFileText(String fileName) {
        File file = new File(fileName);

        // Kiểm tra nếu file không tồn tại thì tạo mới
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("✅ File mới đã được tạo: " + file.getAbsolutePath());
                } else {
                    System.err.println("⚠️ Không thể tạo file.");
                }
            } catch (IOException e) {
                System.err.println("Lỗi khi tạo file: " + e.getMessage());
                return;
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            int sum = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().isEmpty()) continue; // Bỏ qua dòng trống
                try {
                    int number = Integer.parseInt(line.trim());
                    sum += number;
                } catch (NumberFormatException e) {
                    System.err.println("⚠️ Dữ liệu không hợp lệ: '" + line + "' không phải là số.");
                }
            }

            System.out.println("🔢 Tổng = " + sum);

        } catch (FileNotFoundException e) {
            System.err.println("❌ File không tồn tại.");
        } catch (IOException e) {
            System.err.println("❌ Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "src/ss16_IO_Text_File/thuc_hanh/Tinh_tong_cac_so_trong_file_text/TongCacSo.txt";
        readFileText(fileName);
    }
}
