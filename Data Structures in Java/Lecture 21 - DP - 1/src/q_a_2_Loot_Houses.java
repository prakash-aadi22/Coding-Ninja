import java.util.Scanner;

public class q_a_2_Loot_Houses {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return new int[0];
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int maxMoneyLooted(int[] houses) {
        if (houses.length == 0) {
            return 0;
        }
        if (houses.length == 1) {
            return houses[0];
        }
        if (houses.length == 2) {
            return Math.max(houses[0], houses[1]);
        }
        int n = houses.length;
        int[] dp = new int[n];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);
        for (int i = 2; i < n; i++) {
            int maxVal1 = dp[i - 2] + houses[i];
            int maxVal2 = dp[i - 1];
            dp[i] = Math.max(maxVal1, maxVal2);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(maxMoneyLooted(arr));
    }
}
