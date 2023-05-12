import java.util.Scanner;

public class q_a_3_Coin_Tower {

    public static String findWinner(int n, int x, int y) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (dp[i - 1] == 0) {
                dp[i] = 1;
            } else if ((i - x) >= 0 && dp[i - x] == 0) {
                dp[i] = 1;
            } else if ((i - y) >= 0 && dp[i - y] == 0) {
                dp[i] = 1;
            } else {
                dp[i] = 0;
            }
        }
        if (dp[n] == 1) {
            return "Beerus";
        } else {
            return "Whis";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(findWinner(n, x, y));
    }
}
