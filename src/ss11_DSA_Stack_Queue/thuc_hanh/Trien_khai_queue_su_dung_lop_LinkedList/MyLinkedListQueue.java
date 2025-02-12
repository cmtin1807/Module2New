package ss11_DSA_Stack_Queue.thuc_hanh.Trien_khai_queue_su_dung_lop_LinkedList;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public class Node {
        Node next;
        int key;
        public Node(int key) {
            this.key = key;
        }
    }
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key) {
        Node newNode = new Node(key);
        if (this.head == null) {
            this.head = this.tail = newNode;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }
    public Node dequeue() {
        if (this.head == null) {
            this.tail = null;
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        return temp;
    }

}
