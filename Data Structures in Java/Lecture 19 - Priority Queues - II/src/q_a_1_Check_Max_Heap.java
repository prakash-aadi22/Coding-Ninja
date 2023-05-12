import java.util.Scanner;

public class q_a_1_Check_Max_Heap {
    public static boolean checkMaxHeap(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            if (leftChildIndex < arr.length && arr[leftChildIndex] > arr[index]) {
                return false;
            }
            if (rightChildIndex < arr.length && arr[rightChildIndex] > arr[index]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(checkMaxHeap(input));
    }
}
