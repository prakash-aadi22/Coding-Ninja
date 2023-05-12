import java.util.Scanner;

public class q_a_1_Total_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        String s = sc.next();
        char grade = s.charAt(0);
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;
        double allow;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double ts = (basic + hra + da + allow) - pf;
        System.out.println(Math.round(ts));
    }
}
