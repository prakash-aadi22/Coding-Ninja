import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1_Minimum_Cost_Path {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int mRows = Integer.parseInt(strRowsCols[0]);
        int nCols = Integer.parseInt(strRowsCols[1]);
        if (mRows == 0) {
            return new int[0][0];
        }
        int[][] mat = new int[mRows][nCols];
        for (int row = 0; row < mRows; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");
            for (int col = 0; col < nCols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }
        return mat;
    }

    public static int minCostPath(int[][] input) {
        int m = input.length;
        int n = input[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    dp[i][j] = input[i][j];
                    continue;
                }
                int ans1 = dp[i + 1][j];
                int ans2 = dp[i][j + 1];
                int ans3 = dp[i + 1][j + 1];

                dp[i][j] = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[][] mat = take2DInput();
        System.out.println(minCostPath(mat));
    }
}
