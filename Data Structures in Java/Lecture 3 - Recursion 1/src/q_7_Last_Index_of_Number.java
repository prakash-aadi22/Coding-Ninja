import java.util.Scanner;

public class q_7_Last_Index_of_Number {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    private static int sol(int[] input, int lastIndex, int check) {
        if (lastIndex < 0) {
            return -1;
        }
        if (input[lastIndex] == check) {
            return lastIndex;
        }
//        int indexNumber = sol(input, startIndex - 1, check);
//        return indexNumber;
        return sol(input, lastIndex - 1, check);
    }

    public static int lastIndex(int[] input, int x) {
        return sol(input, input.length - 1, x);
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = sc.nextInt();
        System.out.println(lastIndex(input, x));
    }
}
