import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input {
    private int n;
    private int[] weights;
    private int[] values;
    private int maxWeight;

    public Input(int[] weights, int[] values, int n, int maxWeight) {
        this.n = n;
        this.weights = weights;
        this.values = values;
        this.maxWeight = maxWeight;
    }

    public int getSize() {
        return this.n;
    }

    public int[] getWeights() {
        return this.weights;
    }

    public int[] getValues() {
        return this.values;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }
}

public class q_5_0_1_Knapsack {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Input takeInput() throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 0) {
            return (new Input(new int[0], new int[0], 0, 0));
        }
        String[] strWeights = br.readLine().trim().split(" ");
        String[] strValues = br.readLine().trim().split(" ");
        int maxWeight = Integer.parseInt(br.readLine().trim());
        int[] weights = new int[n];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(strWeights[i]);
            values[i] = Integer.parseInt(strValues[i]);
        }
        return (new Input(weights, values, n, maxWeight));
    }

    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        int[][] dp = new int[n + 1][maxWeight + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int w = 0; w <= maxWeight; w++) {
                if (weights[i] <= w) {
                    int ans1 = dp[i + 1][w];
                    int ans2 = dp[i + 1][w - weights[i]] + values[i];
                    dp[i][w] = Math.max(ans1, ans2);
                } else {
                    dp[i][w] = dp[i + 1][w];
                }
            }
        }
        return dp[0][maxWeight];
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Input input = takeInput();
        int n = input.getSize();
        int[] weights = input.getWeights();
        int[] values = input.getValues();
        int maxWeight = input.getMaxWeight();
        System.out.println(knapsack(weights, values, n, maxWeight));
    }
}
