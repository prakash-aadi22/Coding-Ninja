import java.util.Scanner;

public class q_5_Number_of_Balanced_BTs_Using_DP {

    public static int balancedBTs(int height) {
        if (height == 0) {
            return 1;
        }
        int[] storage = new int[height + 1];
        storage[0] = storage[1] = 1;
        int mod = (int) Math.pow(10, 9) + 7;
        for (int i = 2; i <= height; i++) {

            long temp1 = (long) (storage[i - 1]) * storage[i - 1];
            temp1 = temp1 % mod;

            long temp2 = 2 * (long) (storage[i - 1]) * storage[i - 2];
            temp2 = temp2 % mod;
            storage[i] = (int) (temp1 + temp2) % mod;
        }
        return storage[height];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(balancedBTs(n));
    }
}
