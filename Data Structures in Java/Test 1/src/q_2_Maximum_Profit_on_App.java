import java.util.Arrays;
import java.util.Scanner;

public class q_2_Maximum_Profit_on_App {
    public static int maximumProfit(int[] budget) {
        Arrays.sort(budget);
        int ans = Integer.MIN_VALUE;
        int n = budget.length;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, budget[i] * (n - i));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(maximumProfit(input));
    }
}
