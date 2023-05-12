import java.util.HashMap;
import java.util.Scanner;

public class q_a_4_Longest_subset_zero_sum {

    public static int lengthOfLongestSubsetWithZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = -1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int currLen = i - prevIndex;
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
    }
}
