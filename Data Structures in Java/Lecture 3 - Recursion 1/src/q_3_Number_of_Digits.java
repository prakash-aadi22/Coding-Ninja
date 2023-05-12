import java.util.Scanner;

public class q_3_Number_of_Digits {
    static int digits = 0;

    public static int count(int n) {
        if (n == 0) {
            return 1;
        }
        digits++;
        count(n /= 10);
        return digits;

//        if (n / 10 == 0) {
//            return 1;
//        }
//        int smallAns = count(n / 10);
//        return smallAns + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
