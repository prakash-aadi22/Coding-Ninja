import java.util.Scanner;

public class q_4_Sum_of_Array {
    static Scanner sc = new Scanner(System.in);

    static int sumOfArr = 0, i;

    public static int sum(int[] input) {
        if (input.length <= 1) {
//            return input[input.length - 1]; // Both are correct
            return input[0];
        }
        int[] arr = new int[input.length - 1];
//        for (int i = 1; i < input.length; i++) {
//            arr[i - 1] = input[i];
//        }
        System.arraycopy(input, 1, arr, 0, input.length - 1);
        sumOfArr += arr[i];
        sum(arr);
        return sumOfArr + input[0];

//        if (input.length == 1) {
////            return input[input.length - 1];  // Both are correct
//            return input[0];
//        }
//        int[] small = new int[input.length - 1];
//        for (int i = 1; i < input.length; i++) {
//            small[i - 1] = input[i];
//        }
//        int t = sum(small);
//        return t + input[0];
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(sum(input));
    }
}
