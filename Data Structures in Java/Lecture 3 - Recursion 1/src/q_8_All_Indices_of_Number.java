import java.util.Scanner;

public class q_8_All_Indices_of_Number {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    private static int[] sol(int[] input, int startIndex, int check) {
        if (startIndex == input.length) {
            return new int[0];
        }
        int[] indexNumber = sol(input, startIndex + 1, check);
        if (input[startIndex] == check) {
            int[] output = new int[indexNumber.length + 1];
            output[0] = startIndex;
            for (int i = 0; i < indexNumber.length; i++) {
                output[i + 1] = indexNumber[i];
            }
            return output;
        }
        return indexNumber;
    }

    public static int[] allIndexes(int[] input, int x) {
        return sol(input, 0, x);
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = sc.nextInt();
        int[] output = allIndexes(input, x);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
