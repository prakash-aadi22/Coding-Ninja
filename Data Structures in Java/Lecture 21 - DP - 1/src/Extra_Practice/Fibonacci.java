package Extra_Practice;

import java.util.Scanner;

public class Fibonacci {

    public static int fibRecursively(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibRecursively(n - 1) + fibRecursively(n - 2);
    }

    public static int fibMemoization(int n) {
        int[] storage = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            storage[i] = -1;
        }
        return fibMemoization(n, storage);
    }

    public static int fibMemoization(int n, int[] storage) {
        if (n == 0 || n == 1) {
            storage[n] = n;
            return storage[n];
        }
        if (storage[n] != -1) {
            return storage[n];
        }
        storage[n] = fibMemoization(n - 1, storage) + fibMemoization(n - 2, storage);
        return storage[n];
    }

    public static int fibDynamicProgramming(int n) {
        int[] storage = new int[n + 1];
        storage[0] = 0;
        storage[1] = 1;
        for (int i = 2; i <= n; i++) {
            storage[i] = storage[i - 1] + storage[i - 2];
        }
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position of Fibonacci number: ");
        int n = sc.nextInt();
        System.out.println("fibDynamicProgramming(n) --> " + fibDynamicProgramming(n)); // Least Time Taken
        System.out.println("fibMemoization(n) --> " + fibMemoization(n)); // Less Time Taken
        System.out.println("fibRecursively(n) --> " + fibRecursively(n)); // More Time Taken
        System.out.println("fibMemoization(n) --> " + fibMemoization(n)); // Less Time Taken
        System.out.println("fibDynamicProgramming(n) --> " + fibDynamicProgramming(n)); // Least Time Taken
    }
}
