package ss11_DSA_Stack_Queue.bai_tap.Dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_Stack;

import java.util.Stack;

public class SwapElement {
    public static Stack<Integer> swapElementsUsingStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        return newStack;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);
        stack = swapElementsUsingStack(stack);
        System.out.println(stack);
    }
}
