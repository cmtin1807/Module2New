package ss10_DSA_Danh_sach.bai_tap.Trien_khai_cac_phuong_thuc_cua_LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        // Thêm phần tử vào danh sách
        myList.addFirst(10);
        myList.addLast(20);
        myList.add(1, 15); // Thêm 15 vào vị trí index 1
        System.out.println("Danh sách sau khi thêm: " + myList);

        // Lấy phần tử tại index 2
        System.out.println("Phần tử tại index 2: " + myList.get(2));

        // Kiểm tra contains
        System.out.println("Danh sách có chứa 20 không? " + myList.contains(20));

        // Xóa phần tử tại index 1
        System.out.println("Xóa phần tử tại index 1: " + myList.remove(1));
        System.out.println("Danh sách sau khi xóa: " + myList);

        // Xóa phần tử có giá trị 10
        System.out.println("Xóa phần tử 10: " + myList.remove((Integer) 10));
        System.out.println("Danh sách sau khi xóa 10: " + myList);

        // Xóa toàn bộ danh sách
        myList.clear();
        System.out.println("Danh sách sau khi clear: " + myList);
    }
}
