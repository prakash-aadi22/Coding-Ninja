import java.util.Scanner;

public class q_4_Swap_Alternate {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
                int a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
                i++;
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
            swapAlternate(arr);
            printArray(arr);
        }
    }
}
