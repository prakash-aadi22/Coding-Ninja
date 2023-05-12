import java.util.Scanner;

public class q_1_Fahrenheit_to_Celsius_Table {
    public static void printFahrenheitTable(int start, int end, int step) {
        for (int i = start; i <= end; i += step) {
            System.out.println(i + " " + (int) ((i - 32) * (5.0 / 9)));
        }
        // or
//        while (start <= end) {
//            int c = (int) ((start - 32) * (5 / 9.0));
//            System.out.println(start + " " + c);
//            start += step;
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();
        printFahrenheitTable(start, end, step);
    }
}
