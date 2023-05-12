import java.util.Scanner;

public class q_2_Min_Steps_to_One_using_DP {

    public static int countMinStepsToOne(int n) {
        int[] steps = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int count1, count2 = Integer.MAX_VALUE, count3 = Integer.MAX_VALUE;
            count1 = steps[i - 1];
            if (i % 2 == 0) {
                count2 = steps[i / 2];
            }
            if (i % 3 == 0) {
                count3 = steps[i / 3];
            }
            steps[i] = 1 + Math.min(count1, Math.min(count2, count3));
        }
        return steps[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countMinStepsToOne(n));
    }
}
