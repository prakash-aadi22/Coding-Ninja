import java.util.Scanner;

public class q_4_Quick_Sort_Code {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void quickSort(int[] input) {
        int s = 0;
        int e = input.length - 1;
        quickSort_2(input, s, e);
    }

    public static void quickSort_2(int[] input, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIndex = partition(input, si, ei);
        quickSort_2(input, pivotIndex + 1, ei);
        quickSort_2(input, si, pivotIndex - 1);

    }

    public static int partition(int a[], int si, int ei) {
        int pivotElement = a[si];
        int smallNumCount = 0;
        for (int i = si + 1; i <= ei; i++) {
            if (a[i] < pivotElement) {
                smallNumCount++;
            }
        }
        int temp = a[si + smallNumCount];
        a[si + smallNumCount] = pivotElement;
        a[si] = temp;
        int i = si;
        int j = ei;
        while (i < j) {
            if (a[i] < pivotElement) {
                i++;
            } else if (a[j] >= pivotElement) {
                j--;
            } else {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return si + smallNumCount;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
