import java.util.Scanner;

public class q_a_4_Return_subset_of_an_array {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[][] subsets(int[] input) {
        return subsets(input, 0);
    }

    public static int[][] subsets(int[] input, int si) {
        if (si >= input.length) {
            return new int[1][0];
        }
        int[][] smallAns = subsets(input, si + 1);
        int[][] ans = new int[smallAns.length * 2][];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = new int[smallAns[i].length];
//            for (int j = 0; j < smallAns[i].length; j++) {
//                ans[i][j] = smallAns[i][j];
//            }
            System.arraycopy(smallAns[i], 0, ans[i], 0, smallAns[i].length);
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[k + i] = new int[smallAns[i].length + 1];
            ans[k + i][0] = input[si];
//            for (int j = 1; j <= smallAns[i].length; j++) {
//                ans[i + k][j] = smallAns[i][j - 1];
//            }
            System.arraycopy(smallAns[i], 0, ans[i + k], 1, smallAns[i].length);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int[][] output = subsets(input);
//        for (int i = 0; i < output.length; i++) {
        for (int[] ints : output) {
//            for (int j = 0; j < ints.length; j++) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
