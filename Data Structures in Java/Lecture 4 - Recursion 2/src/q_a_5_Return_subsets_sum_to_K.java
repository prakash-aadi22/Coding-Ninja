import java.util.Scanner;

public class q_a_5_Return_subsets_sum_to_K {

    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[][] subsetsSumK(int[] input, int k) {
        return helper(input, k, 0);
    }

    public static int[][] helper(int[] input, int k, int si) {
        if (si == input.length) {
            if (k == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }
        int[][] op1 = helper(input, k - input[si], si + 1);
        int[][] op2 = helper(input, k, si + 1);
        int[][] output = new int[op1.length + op2.length][];
        int l = 0;
        for (int i = 0; i < op2.length; i++) {
            output[i] = new int[op2[i].length];
//            for (int j = 0; j < op2[i].length; j++) {
//                output[l][j] = op2[i][j];
//            }
            System.arraycopy(op2[i], 0, output[l], 0, op2[i].length);
            l++;
        }
        for (int i = 0; i < op1.length; i++) {
            output[i + l] = new int[op1[i].length + 1];
            output[i + l][0] = input[si];
//            for (int j = 1; j <= op1[i].length; j++) {
//                output[i + l][j] = op1[i][j - 1];
//            }
            System.arraycopy(op1[i], 0, output[i + l], 1, op1[i].length);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int k = sc.nextInt();
        int[][] output = subsetsSumK(input, k);
//        for(int i = 0; i < output.length; i++) {
//            for(int j = 0; j < output[i].length; j++) {
        for (int[] ints : output) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
