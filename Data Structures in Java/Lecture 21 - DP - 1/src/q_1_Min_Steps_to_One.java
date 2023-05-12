import java.util.Scanner;

public class q_1_Min_Steps_to_One {

    public static int countMinStepsToOne(int n) {
        int[] storage = new int[n + 1];
        storage[1] = 0;
        for (int i = 2; i <= n; i++) {
            int min = storage[i - 1];
            if (i % 3 == 0) {
                if (min > storage[i / 3]) {
                    min = storage[i / 3];
                }
            }
            if (i % 2 == 0) {
                if (min > storage[i / 2]) {
                    min = storage[i / 2];
                }
            }
            storage[i] = 1 + min;
        }
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countMinStepsToOne(n));
    }
}
