import java.util.Scanner;

public class q_6_First_Index_of_Number {

    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    private static int sol(int[] input, int startIndex, int check) {
//        if (startIndex > input.length - 1) {
        if (startIndex == input.length) {
            return -1;
        }
        if (input[startIndex] == check) {
            return startIndex;
        }
//        int indexNumber = sol(input, startIndex + 1, check);
//        return indexNumber;
        return sol(input, startIndex + 1, check);
    }

    public static int firstIndex(int[] input, int x) {
        return sol(input, 0, x);
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = sc.nextInt();
        System.out.println(firstIndex(input, x));
    }
}
