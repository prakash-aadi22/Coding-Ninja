import java.util.*;

public class q_p_6_Sort_0_1 {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void sortZeroesAndOne(int[] arr) {
        Arrays.sort(arr);

//        int k = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 1) {
//                k++;
//                int temp = arr[k];
//                arr[k] = arr[i];
//                arr[i] = temp;
//            }
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
            int[] arr = input();
            sortZeroesAndOne(arr);
            printArray(arr);
        }
    }
}
