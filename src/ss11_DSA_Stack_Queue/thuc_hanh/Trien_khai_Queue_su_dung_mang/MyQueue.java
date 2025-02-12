package ss11_DSA_Stack_Queue.thuc_hanh.Trien_khai_Queue_su_dung_mang;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0; // Chỉ số đầu hàng đợi
    private int tail = -1; // Chỉ số cuối hàng đợi
    private int currentSize = 0; // Số phần tử hiện tại

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[capacity];
    }

    public boolean isQueueFull() {
        return (currentSize == capacity);
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public void enQueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        } else {
            // Di chuyển tail lên 1 bước, nếu vượt quá kích thước mảng thì quay về 0 (queue vòng)
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Enqueued: " + item);
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued: " + queueArr[head]);
            // Di chuyển head lên 1 bước, nếu vượt quá kích thước mảng thì quay về 0
            head = (head + 1) % capacity;
            currentSize--;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            int index = head;
            for (int i = 0; i < currentSize; i++) {
                System.out.print(queueArr[index] + " ");
                index = (index + 1) % capacity; // Duyệt qua queue vòng
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.printQueue(); // In hàng đợi

        queue.deQueue();
        queue.deQueue();

        queue.printQueue();

        queue.enQueue(60);
        queue.enQueue(70);

        queue.printQueue();
    }
}
