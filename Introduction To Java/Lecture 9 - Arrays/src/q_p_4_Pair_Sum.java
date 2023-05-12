import java.util.Scanner;

public class q_p_4_Pair_Sum {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int pairSum(int[] arr, int x) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (i == j) {
//                    continue;
//                } else if (arr[i] + arr[j] == x) {
//                    count++;
//                }
//            }
//        }
//        return count / 2;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            int sum = sc.nextInt();
            System.out.println(pairSum(arr, sum));
        }
    }
}
