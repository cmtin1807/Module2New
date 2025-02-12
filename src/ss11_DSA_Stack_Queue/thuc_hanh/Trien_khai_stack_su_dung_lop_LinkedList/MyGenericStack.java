package ss11_DSA_Stack_Queue.thuc_hanh.Trien_khai_stack_su_dung_lop_LinkedList;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(T t) {
        stack.addFirst(t);
    }
    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
