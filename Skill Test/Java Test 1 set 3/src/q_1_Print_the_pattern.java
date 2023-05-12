import java.util.Scanner;

public class q_1_Print_the_pattern {
    static Scanner sc = new Scanner(System.in);

    public static void printPattern(int n) {
        String[] arr = NumberPattern(n);
        for (String i : arr) {
            System.out.print(i + "\n");
        }
    }

    public static String[] NumberPattern(int N) {
        String[] result = new String[N];
        int index = 0;
        int startValue = 1;
        for (int row = 1; row <= N; row++) {
            StringBuilder ans = new StringBuilder();
            for (int col = startValue; col < startValue + N; col++) {
                ans.append(col).append(" ");
            }
            if (row == (N + 1) / 2) {
                if (N % 2 != 0) {
                    startValue = N * (N - 2) + 1;
                } else {
                    startValue = N * (N - 1) + 1;
                }
            } else if (row > (N + 1) / 2) {
                startValue = startValue - 2 * N;
            } else {
                startValue = startValue + 2 * N;
            }
            result[index++] = ans.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        printPattern(n);
    }
}
