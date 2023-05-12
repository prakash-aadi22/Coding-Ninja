import java.util.Scanner;

public class q_p_3_Second_Largest_in_array {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int secondLargestElement(int[] arr) {
//        int len = arr.length;
//        int first;
//        int second;
//        first = second = Integer.MIN_VALUE;
//        for (int i = 0; i < len; i++) {
//            if (first < arr[i]) {
//                first = arr[i];
//            }
//        }
//        for (int j = 0; j < len; j++) {
//            if (arr[j] != first) {
//                second = Math.max(second, arr[j]);
//            }
//        }
//        return second;

        int first;
        int second;
        first = second = Integer.MIN_VALUE;
        for (int k : arr) {
            if (first < k) {
                first = k;
            }
        }
        for (int i : arr) {
            if (i != first) {
                second = Math.max(second, i);
            }
        }
        return second;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            System.out.println(secondLargestElement(arr));
        }
    }
}
