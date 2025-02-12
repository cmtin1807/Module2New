package ss11_DSA_Stack_Queue.bai_tap.Kiem_tra_dau_ngoac;

import java.util.Stack;

public class BracketChecker {
    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char sym : expression.toCharArray()) {
            if (sym == '(' || sym == '{' || sym == '[') {
                stack.push(sym); // Đưa dấu ngoặc trái vào stack
            } else if (sym == ')' || sym == '}' || sym == ']') {
                if (stack.isEmpty()) {
                    return false; // Nếu stack rỗng mà gặp dấu ngoặc phải, sai
                }
                char left = stack.pop(); // Lấy dấu ngoặc trái gần nhất
                if (!isMatchingPair(left, sym)) {
                    return false; // Nếu không khớp, sai
                }
            }
        }
        return stack.isEmpty(); // Nếu stack còn phần tử, nghĩa là còn dấu ngoặc chưa đóng
    }

    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }

    public static void main(String[] args) {
        String[] expressions = {
                "s * (s – a) * (s – b) * (s – c)",  // Well
                "(– b + (b2 – 4*a*c)^0.5) / 2*a",  // Well
                "s * (s – a) * (s – b * (s – c)",  // ???
                "s * (s – a) * s – b) * (s – c)",  // ???
                "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))" // ???
        };

        for (String expression : expressions) {
            System.out.println(expression + " → " + (isValidExpression(expression) ? "Well" : "???"));
        }
    }
}
