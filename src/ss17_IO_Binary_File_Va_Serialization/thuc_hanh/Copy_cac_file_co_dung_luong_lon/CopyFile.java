package ss17_IO_Binary_File_Va_Serialization.thuc_hanh.Copy_cac_file_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;


public class CopyFile {
    public static void copyFileUsingJava (File inputFile, File outputFile) throws IOException {
        Files.copy(inputFile.toPath(), outputFile.toPath());
    }
    public static void copyFileUsingStream (File inputFile, File outputFile) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer))>0){
                outputStream.write(buffer, 0, length);
            }
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
    public static void main(String[] args) {
        String input = "src/ss17_IO_Binary_File_Va_Serialization/thuc_hanh/Copy_cac_file_co_dung_luong_lon/input.txt";
        String outout = "src/ss17_IO_Binary_File_Va_Serialization/thuc_hanh/Copy_cac_file_co_dung_luong_lon/output.txt";
        File inputFile = new File(input);
        File outputFile = new File(outout);
        try {
            copyFileUsingStream(inputFile, outputFile);
            copyFileUsingJava(inputFile, outputFile);
        } catch (IOException e) {
            System.out.println("Error while copying file " + inputFile.getAbsolutePath());
        }
    }

}
