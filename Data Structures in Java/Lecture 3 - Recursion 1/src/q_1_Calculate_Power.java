import java.util.Scanner;

public class q_1_Calculate_Power {
    static Scanner sc = new Scanner(System.in);
    public static int power(int x, int n) {
//        return (int) Math.pow(x, n);
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}
