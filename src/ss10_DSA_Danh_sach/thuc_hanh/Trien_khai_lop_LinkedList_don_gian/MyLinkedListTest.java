package ss10_DSA_Danh_sach.thuc_hanh.Trien_khai_lop_LinkedList_don_gian;


public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.addFirst("sa");
        linkedList.addFirst("da");
        linkedList.addFirst("phaa");
        linkedList.addFirst("laa");
        linkedList.printList();
        linkedList.remove(0);
        System.out.println();
        linkedList.printList();
        System.out.println();
        linkedList.printList();


    }
}
