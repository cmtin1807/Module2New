package ss16_IO_Text_File.bai_tap.Doc_File_csv;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "src/ss16_IO_Text_File/bai_tap/Doc_File_csv/country.csv";
        List<Country> countries = CountryManager.getCountries(path);

        if (countries.isEmpty()) {
            System.out.println("⚠️ Không có dữ liệu để hiển thị.");
        } else {
            for (Country country : countries) {
                System.out.println(country);
            }
        }
    }
}
