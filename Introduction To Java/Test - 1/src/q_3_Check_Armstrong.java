import java.util.Scanner;

public class q_3_Check_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orgNum = n;
        int num = n;
        int len = 0;
        while (num > 0) {
            len++;
            num /= 10;
        }
        int sum = 0;
        while (n > 0) {
            sum += (Math.pow(n % 10, len));
            n /= 10;
        }
        if (orgNum == sum) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
