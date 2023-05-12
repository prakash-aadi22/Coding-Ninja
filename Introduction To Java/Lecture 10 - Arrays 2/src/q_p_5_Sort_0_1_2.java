import java.util.Arrays;
import java.util.Scanner;

public class q_p_5_Sort_0_1_2 {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void sort012(int[] arr) {
//        Arrays.sort(arr);

//        int count0 = 0, count1 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                count0++;
//            } else if (arr[i] == 1) {
//                count1++;
//            }
//        }
//        for (int i = 0; i < count0; i++) {
//            arr[i] = 0;
//        }
//        for (int i = count0; i < count0 + count1; i++) {
//            arr[i] = 1;
//        }
//        for (int i = count0 + count1; i < arr.length; i++) {
//            arr[i] = 2;
//        }


        int count0 = 0, count1 = 0;
        for (int j : arr) {
            if (j == 0) {
                count0++;
            } else if (j == 1) {
                count1++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
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
            int[] arr = input();
            sort012(arr);
            printArray(arr);
        }
    }
}
