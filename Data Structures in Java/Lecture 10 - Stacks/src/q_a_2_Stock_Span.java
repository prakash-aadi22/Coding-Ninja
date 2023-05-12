import java.util.Scanner;
import java.util.Stack;

public class q_a_2_Stock_Span {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int size = sc.nextInt();
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] stockSpan(int[] price) {
        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);
        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] < price[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int[] output = stockSpan(input);
        printArray(output);
    }
}
