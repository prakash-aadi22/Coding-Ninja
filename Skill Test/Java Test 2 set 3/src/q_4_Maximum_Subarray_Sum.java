import java.util.Scanner;

public class q_4_Maximum_Subarray_Sum {
    public static long crossSum(int[] arr, int low, int high, int mid) {
        if (low == high) {
            return arr[low];
        }
        long leftSubSum = 0;
        long currSum = 0;
        for (int i = mid; i > low - 1; --i) {
            currSum += arr[i];
            leftSubSum = Math.max(leftSubSum, currSum);
        }
        long rightSubSum = 0;
        currSum = 0;
        for (int i = mid + 1; i < high + 1; ++i) {
            currSum += arr[i];
            rightSubSum = Math.max(rightSubSum, currSum);
        }
        return leftSubSum + rightSubSum;
    }

    public static long maxSubarraySumHelper(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        }
        int mid = (low + high) / 2;
        long leftSum = maxSubarraySumHelper(arr, low, mid);
        long rightSum = maxSubarraySumHelper(arr, mid + 1, high);
        long crossS = crossSum(arr, low, high, mid);
        return Math.max(Math.max(leftSum, rightSum), crossS);
    }

    public static long maxSubarraySum(int[] arr, int n) {
        return maxSubarraySumHelper(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = maxSubarraySum(arr, n);
        System.out.println(ans);

    }
}
