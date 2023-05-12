import java.util.Scanner;

public class q_a_6_Rotate_array {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void rotate(int[] arr, int d) {
        if (d <= 0) {
            return;
        }
        if (d > arr.length) {
            d = d - arr.length;
        }
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1 - d);
        reverseArray(arr, arr.length - d, arr.length - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            int num = sc.nextInt();
            rotate(arr, num);
        }
    }
}
