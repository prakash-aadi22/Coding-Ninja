import java.util.Scanner;

public class q_3_Arrange_Numbers_in_Array {
    public static void arrange(int[] arr, int n) {
        /*
//        Not Working == for (e.g. -- [] --> 1, n --> 6 gives 5,5,5,2,2,2.
//        if (n % 2 == 0) {
//            for (int i = 1; i <= n; i++) {
//                if (i % 2 != 0) {
//                    for (int j = 0; j < n / 2; j++) {
//                        arr[j] = i;
//                    }
//                }
//            }
//            for (int i = n; i > 0; i--) {
//                if (i % 2 == 0) {
//                    for (int j = n / 2; j < n; j++) {
//                        arr[j] = i;
//                    }
//                }
//            }
//        }
//        if (n % 2 != 0) {
//            for (int i = 1; i <= n; i++) {
//                if (i % 2 != 0) {
//                    for (int j = 0; j <= (n - 1) / 2; j++) {
//                        arr[j] = i;
//                    }
//                }
//            }
//            for (int i = n; i > 0; i--) {
//                if (i % 2 == 0) {
//                    for (int j = (n + 1) / 2; j < n; j++) {
//                        arr[j] = i;
//                    }
//                }
//            }
//        }
         */
        int start = 0, end = n - 1, val = 1;
        for (int i = 0; i < n; i++) {
            if (val % 2 != 0) {
                arr[start] = val;
                start++;
            }
            if (val % 2 == 0) {
                arr[end] = val;
                end--;
            }
            val++;
        }

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int sizeOfArray = sc.nextInt();
            int[] arr = new int[sizeOfArray];
            arrange(arr, sizeOfArray);
            printArray(arr);
        }
    }
}
