package ss10_DSA_Danh_sach.bai_tap.Trien_khai_cac_phuong_thuc_cua_LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (index == 0) { // Thêm vào đầu danh sách
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

    public void addFirst(E element) {
        add(0, element);
    }

    public void addLast(E element) {
        add(numNodes, element);
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        if (index == 0) { // Xóa phần tử đầu tiên
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node deleteNode = temp.next;
            temp.next = deleteNode.next;
            return (E) deleteNode.data;
        }
        numNodes--;
        return (E) temp.data;
    }

    public boolean remove(Object element) {
        if (head == null) return false;

        if (head.data.equals(element)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(element)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(element)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public boolean add(E element) {
        addLast(element);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(numNodes - 1);
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            result.append(temp.data).append(", ");
            temp = temp.next;
        }
        if (result.length() > 1) result.setLength(result.length() - 2);
        result.append("]");
        return result.toString();
    }
}
