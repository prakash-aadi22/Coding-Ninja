import java.util.Scanner;

public class q_a_4_Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String s = String.valueOf(n);
//        System.out.println(Integer.parseInt(s, 2));
        int count = 0, ans = 0;
        while (n != 0) {
            int x = n % 10;
            n /= 10;
            ans += (int) (x * Math.pow(2, count));
            count++;
        }
        System.out.println(ans);
    }
}
