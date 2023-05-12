import java.util.Scanner;

public class q_1_Implace_Heap_sort {
    public static void inplaceHeapSort(int[] arr) {
        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            downHeapify(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downHeapify(arr, 0, i);
        }
    }

    private static void downHeapify(int[] arr, int i, int n) {
        int parentIndex = i;
        int leftChildIndex = 2 * parentIndex + 1, rightChildIndex = 2 * parentIndex + 2;
        while (leftChildIndex < n) {
            int minIndex = parentIndex;
            if (arr[minIndex] > arr[leftChildIndex]) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < n && arr[minIndex] > arr[rightChildIndex]) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                return;
            }
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;
            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        inplaceHeapSort(input);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}
