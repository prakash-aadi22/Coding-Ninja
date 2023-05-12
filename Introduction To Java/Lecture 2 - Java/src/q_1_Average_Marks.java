import java.util.Scanner;

public class q_1_Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = s.charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println(ch);
        System.out.println(avg);
    }
}
