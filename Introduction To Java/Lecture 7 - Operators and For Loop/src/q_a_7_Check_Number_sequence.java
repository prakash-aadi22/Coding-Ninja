import java.util.Scanner;

public class q_a_7_Check_Number_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean seq = true;
        for (int i = 0; i < n - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                seq = false;
                break;
            }
            if ((arr[i] < arr[i + 1]) && (arr[i + 1] > arr[i + 2])) {
                seq = false;
                break;
            }
        }
        System.out.println(seq);
    }
}
