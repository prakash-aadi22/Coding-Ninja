import java.util.Scanner;

public class q_3_Fahrenheit_to_Celsius_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sf = sc.nextInt();
        int ef = sc.nextInt();
        int ss = sc.nextInt();
        int c;
        while (sf <= ef) {
            c = (int) ((sf - 32) * (5 / 9.0));
            System.out.println(sf + " " + c);
            sf = sf + ss;
        }
    }
}
