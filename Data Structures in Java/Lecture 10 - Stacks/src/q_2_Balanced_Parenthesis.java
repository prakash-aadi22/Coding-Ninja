import java.util.Scanner;
import java.util.Stack;

public class q_2_Balanced_Parenthesis {
    public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        for (int j = 0; j < expression.length(); j++) {
            char i = expression.charAt(j);
            if (i == '[' || i == '{' || i == '(') {
                s.push(i);
            } else if (i == ']' || i == '}' || i == ')') {
                if (s.isEmpty()) {
                    return false;
                } else {
                    if (i == ']') {
                        if (s.peek() != '[') {
                            return false;
                        } else {
                            s.pop();
                        }
                    } else if (i == '}') {
                        if (s.peek() != '{') {
                            return false;
                        } else {
                            s.pop();
                        }
                    } else if (i == ')') {
                        if (s.peek() != '(') {
                            return false;
                        } else {
                            s.pop();
                        }
                    }
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        System.out.println(isBalanced(expression));
    }
}
