import java.util.Scanner;
import java.util.Stack;

public class q_a_1_Check_redundant_brackets {
    public static boolean checkRedundantBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    count = count + 1;
                    stack.pop();

                }
                if (count == 0 || count == 1) {
                    return true;
                }
                stack.pop();
                count = 0;
            } else {
                stack.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        System.out.println(checkRedundantBrackets(expression));
    }
}
