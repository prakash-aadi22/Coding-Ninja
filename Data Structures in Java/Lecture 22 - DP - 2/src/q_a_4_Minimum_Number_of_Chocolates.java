import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_a_4_Minimum_Number_of_Chocolates {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
        String[] strNums;
        strNums = br.readLine().split("\\s");
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }
        return input;
    }

    public static int getMin(int[] arr, int N) {
        int[] dp = new int[N + 1];
        dp[0] = 1;
        int i = 0;
        int sum = 0;
        for (i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else
                dp[i] = 1;
        }
        for (i = N - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1] && dp[i] <= dp[i + 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        for (i = 0; i < N; i++)
            sum += dp[i];
        return sum;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] arr = takeInput();
        System.out.print(getMin(arr, arr.length));
    }
}
