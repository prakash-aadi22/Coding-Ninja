import java.util.Scanner;

public class q_a_1_Multiplication_Recursive {

    public static int multiplyTwoIntegers(int m, int n) {
        if (n == 0) {
            return 0;
        }
        return (m + multiplyTwoIntegers(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
    }
}
