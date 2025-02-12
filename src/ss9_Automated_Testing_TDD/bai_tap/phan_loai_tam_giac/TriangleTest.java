package ss9_Automated_Testing_TDD.bai_tap.phan_loai_tam_giac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ss9_Automated_Testing_TDD.bai_tap.phan_loai_tam_giac.Triangle.checkTypeTriangle;

public class TriangleTest {
    @Test
    @DisplayName("tam giác đều")
    public void tamGiacDeu(){
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
        String result = checkTypeTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("tam giác cân")
    public void tamGiacCan(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String result = checkTypeTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("tam giác thường")
    public void tamGiacThuong(){
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String result = checkTypeTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("không phải là tam giác")
    public void khongPhaiTamGiacThuong(){
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải là tam giác";
        String result = checkTypeTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("không phải là tam giác cạnh âm")
    public void khongPhaiTamGiacThuongCanhAm(){
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = checkTypeTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("không phải là tam giác cạnh không")
    public void khongPhaiTamGiacThuongCanhKhong(){
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = checkTypeTriangle(a,b,c);
        assertEquals(expected,result);
    }
}
