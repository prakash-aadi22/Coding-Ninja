import java.util.Scanner;

public class q_3_Staircase {

    public static long staircase(int n) {
        long[] steps = new long[n + 1];
        steps[0] = 1;
        if (n > 0) {
            steps[1] = 1;
        }
        if (n > 1) {
            steps[2] = 2;
        }
        if (n > 2) {
            steps[3] = 4;
        }
        for (int i = 4; i <= n; i++) {
            long count1, count2, count3;
            count1 = steps[i - 1];
            count2 = steps[i - 2];
            count3 = steps[i - 3];
            steps[i] = count1 + count2 + count3;
        }
        return steps[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(staircase(n));
    }
}
