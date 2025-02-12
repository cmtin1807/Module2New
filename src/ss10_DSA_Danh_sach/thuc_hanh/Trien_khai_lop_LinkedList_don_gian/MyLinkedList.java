package ss10_DSA_Danh_sach.thuc_hanh.Trien_khai_lop_LinkedList_don_gian;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }
    // Phương thức thêm phần tử vào danh sách
    public void add(int index, Object data) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        numNodes++;
    }
    public void addFirst(Object data) {
        add(0, data);
    }
    public void addLast(Object data) {
        add(numNodes - 1, data);
    }
    public Node get(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public int size() {
        return numNodes;
    }
    public Node remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        Node removedNode;
        if (index == 0) {
            // Xóa phần tử đầu danh sách
            removedNode = head;
            head = head.next;
        } else {
            // Xóa phần tử ở giữa hoặc cuối
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removedNode = temp.next;
            temp.next = temp.next.next;
        }
        numNodes--;
        return removedNode;
    }

}

