import java.util.Scanner;

public class q_3_Split_Array {
    static Scanner s = new Scanner(System.in);

    public static boolean splitArray(int[] input) {
        return splitArray(input, 0, 0, 0);
    }

    private static boolean splitArray(int[] input, int si, int lSum, int rSum) {
        if (input.length == si) {
            return lSum == rSum;
        }
        if (input[si] % 3 == 0) {
            lSum += input[si];
        } else if (input[si] % 5 == 0) {
            rSum += input[si];
        } else {
            return splitArray(input, si + 1, lSum + input[si], rSum) || splitArray(input, si + 1, lSum, rSum + input[si]);
        }
        return splitArray(input, si + 1, lSum, rSum);
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(splitArray(input));
    }
}
