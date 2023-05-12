import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class q_1_Keep_Score_of_Brackets {

//    public static int scoreOfParentheses(String s) {
//        Deque<Integer> stack = new ArrayDeque<>();
//        for (char ch : s.toCharArray()) {
//            if (ch == '(')
//                stack.push(-1);
//            else {
//                if (!stack.isEmpty() && stack.peek() == -1) {
//                    stack.pop();
//                    stack.push(1);
//                } else {
//                    int sum = 0;
//                    while (!stack.isEmpty() && stack.peek() != -1) {
//                        sum += stack.pop();
//                    }
//                    stack.pop();
//                    stack.push(3 * sum);
//                }
//            }
//        }
//        int sum = 0;
//        while (!stack.isEmpty()) {
//            sum += stack.pop();
//        }
//        return (sum * 3);
//    }

    public static int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    stack.push('1');
                } else {
                    int sum = 0;
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        sum += stack.pop() - '0';
                    }
                    stack.pop();
                    stack.push((char) (3 * sum + '0'));
                }
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += (stack.pop() - '0');
        }
        return (sum * 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        System.out.println(scoreOfParentheses(expression));
    }
}
