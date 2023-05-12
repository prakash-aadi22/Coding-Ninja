import java.util.Scanner;

public class q_a_2_Count_Zeros {

    public static int countZerosRec(int input) {
        if (input < 10) {
            if (input == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = countZerosRec(input / 10);
        if (input % 10 == 0) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZerosRec(n));
    }
}
