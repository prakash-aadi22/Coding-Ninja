import java.util.Scanner;

public class q_6_Knapsack_Memoization_and_DP {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput(int size) {
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
        for (int i = 0; i < size; ++i) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] storage = new int[n + 1][maxWeight + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < maxWeight + 1; j++) {
                storage[i][j] = -1;
            }
        }
        return knapsack(weight, value, maxWeight, n + 1, storage, 0);
    }

    public static int knapsack(int[] weight, int[] value, int maxWeight, int n, int[][] storage, int i) {
        if (i == weight.length || maxWeight == 0) {
            storage[i][maxWeight] = 0;
            return storage[i][maxWeight];
        }
        if (storage[i][maxWeight] != -1)
            return storage[i][maxWeight];
        if (weight[i] > maxWeight) {
            storage[i][maxWeight] = knapsack(weight, value, maxWeight, n - 1, storage, i + 1);
        } else {
            int op1 = value[i] + knapsack(weight, value, maxWeight - weight[i], n - 1, storage, i + 1);
            int op2 = knapsack(weight, value, maxWeight, n - 1, storage, i + 1);
            storage[i][maxWeight] = Math.max(op1, op2);
        }
        return storage[i][maxWeight];
    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] wt = takeInput(size);
        int[] val = takeInput(size);
        int w = sc.nextInt();
        System.out.print(knapsack(wt, val, size, w));
    }
}
