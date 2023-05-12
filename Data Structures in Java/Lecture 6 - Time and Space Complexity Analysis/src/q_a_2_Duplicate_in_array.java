import java.util.Scanner;

public class q_a_2_Duplicate_in_array {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findDuplicate(int[] arr) {
        // TEST CASE 4 IS WRONG TIME LIMIT EXCEEDS
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]){
//                    return arr[j];
//                }
//            }
//        }
//        return arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }
//        System.out.println("The repeating elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
                return i;
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            System.out.println(findDuplicate(arr));
        }
    }
}
