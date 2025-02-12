package ss11_DSA_Stack_Queue.thuc_hanh.Trien_khai_Stack_su_dung_mang;

public class MyStack {
    private int [] arr;
    private int size;
    private int index = 0;
    public MyStack(int size) {
        arr = new int[size];
    }
    public void push(int x) {
        if (isFull()){
            throw new RuntimeException("Stack is full");
        }
        arr[index++] = x;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
    public boolean isFull(){
        return index == arr.length;
    }
    public boolean isEmpty(){
        return index == 0;
    }
    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
