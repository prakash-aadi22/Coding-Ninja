import java.util.Scanner;

public class q_a_3_Reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String s = Integer.toString(n);
//        StringBuilder sb = new StringBuilder(s);
//        String s2 = String.valueOf(sb.reverse());
//        int r2 = Integer.parseInt(s2);
//        System.out.println(r2);
        int res = 0;
        while (n > 0) {
            int a = n % 10;
            res = res * 10 + a;
//            n = n / 10;
            n /= 10;
        }
        System.out.println(res);
    }
}
