package ss11_DSA_Stack_Queue.thuc_hanh.Trien_khai_stack_su_dung_lop_LinkedList;

public class MyGenericStackTest {
    public static void main(String[] args) {
        MyGenericStack<String> stack = new MyGenericStack();

        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
}
