import java.util.Scanner;

public class q_5_Check_Number_in_Array {
    static Scanner sc = new Scanner(System.in);

    public static boolean checkNumber(int[] input, int x) {
        if (input.length <= 1){
            return false;
        }
        if (input[0] == x) {
            return true;
        }
        int[] arr = new int[input.length - 1];
//        for (int i = 1; i < input.length; i++) {
//            arr[i - 1] = input[i];
//        }
        System.arraycopy(input, 1, arr, 0, input.length - 1);
        /*
//        boolean ans = checkNumber(arr, x); // Inline in return
//        if (ans == true){
//        return true;
//        } else {
//        return false;
//        }
        */
        return checkNumber(arr, x);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(checkNumber(input, x));
    }
}
