import java.util.Scanner;

public class q_p_4_Check_Array_Rotation {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int arrayRotateCheck(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                continue;
            } else
                ans += i + 1;
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            System.out.println(arrayRotateCheck(arr));
        }
    }
}
