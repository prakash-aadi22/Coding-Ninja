import java.util.Scanner;

public class q_3_Edit_Distance {

    public static int editDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = n; i >= 0; i--) {
            dp[m][i] = n - i;
        }
        for (int i = m; i >= 0; i--) {
            dp[i][n] = m - i;
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    int ans1 = 1 + dp[i + 1][j + 1];
                    int ans2 = 1 + dp[i][j + 1];
                    int ans3 = 1 + dp[i + 1][j];

                    dp[i][j] = Math.min(ans1, Math.min(ans2, ans3));
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(editDistance(str1, str2));
    }
}
