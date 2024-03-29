import java.text.DecimalFormat;
import java.util.Scanner;

public class q_a_3_Geometric_Sum {

    public static double findGeometricSum(int k) {
//        double ans = 0;
//        for (int i = 0; i <= k; i++) {
//            ans += (1 / Math.pow(2, i));
//        }
//        return ans;

        if (k == 0) {
            return 1;
        }
        return (1 / Math.pow(2, k)) + findGeometricSum(k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double ans = findGeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
}
