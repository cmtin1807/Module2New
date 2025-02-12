package ss10_DSA_Danh_sach.bai_tap.Trien_khai_cac_phuong_thuc_cua_ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        // Thêm phần tử vào danh sách
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(1, 15); // Thêm 15 vào vị trí index 1
        System.out.println("Danh sách sau khi thêm: " + myList);

        // Lấy phần tử tại vị trí index 2
        System.out.println("Phần tử tại index 2: " + myList.get(2));

        // Kiểm tra contains
        System.out.println("Danh sách có chứa 20 không? " + myList.contains(20));

        // Xóa phần tử tại index 1
        System.out.println("Xóa phần tử tại index 1: " + myList.remove(1));
        System.out.println("Danh sách sau khi xóa: " + myList);

        // Sao chép danh sách
        MyList<Integer> clonedList = myList.clone();
        System.out.println("Danh sách sao chép: " + clonedList);

        // Xóa toàn bộ danh sách
        myList.clear();
        System.out.println("Danh sách sau khi clear: " + myList);
    }
}
