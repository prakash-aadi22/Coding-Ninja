import java.util.Scanner;
import java.util.Stack;

public class q_a_3_Minimum_bracket_Reversal {
    public static int countBracketReversals(String input) {
        if (input.length() % 2 != 0) {
            return -1;
        }
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{') {
                stk.push('{');
            } else if (input.charAt(i) == '}') {
                if (stk.isEmpty() || stk.peek() == '}') {
                    stk.push('}');
                } else if (stk.peek() == '{') {
                    stk.pop();
                }

            }
        }
        int count = 0;
        while (stk.size() != 0) {
            char c1 = stk.pop();
            char c2 = stk.pop();
//            if (c1 == c2) {
//                if (c2 == '{') {
//                    c2 = '}';
//                }
//                if (c1 == '}') {
//                    c1 = '{';
//                }
//                count++;
//            } else {
//                c1 = '{';
//                c2 = '}';
//                count++;
//                count++;
//            }

            // if (c1 == c2) {
            //     if (c2 == '{') {
            //         c2 = '}';
            //     }
            //     if (c1 == '}') {
            //         c1 = '{';
            //     }
            // } else {
            //     c1 = '{';
            //     c2 = '}';
            //     count++;
            // }
            // count++;

            if (c1 == c2) {
            } else {
                count++;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countBracketReversals(sc.next()));
    }
}
