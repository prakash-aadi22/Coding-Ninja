import java.util.Scanner;

public class q_3_Merge_Sort_Code {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] input) {
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(input[i] + " ");
//        }
        for (int j : input) {
            System.out.print(j + " ");
        }
    }

    public static void mergeSort(int[] input) {
        if (input.length <= 1) {
            return;
        }
        int[] b = new int[input.length / 2];
        int[] c = new int[input.length - b.length];

//        for (int i = 0; i < input.length / 2; i++) {
//            b[i] = input[i];
//        }
//        for (int i = input.length / 2; i < input.length; i++) {
//            c[i - input.length / 2] = input[i];
//        }
        System.arraycopy(input, 0, b, 0, input.length / 2);
        if (input.length - input.length / 2 >= 0) {
            System.arraycopy(input, input.length / 2, c, 0, input.length - input.length / 2);
        }
        mergeSort(b);
        mergeSort(c);
        merge(b, c, input);
    }

    public static void merge(int[] s1, int[] s2, int[] d) {
        int i = 0, j = 0, k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] <= s2[j]) {
                d[k] = s1[i];
                i++;
            } else {
                d[k] = s2[j];
                j++;
            }
            k++;
        }
        if (i < s1.length) {
            while (i < s1.length) {
                d[k] = s1[i];
                i++;
                k++;
            }
        }
        if (j < s2.length) {
            while (j < s2.length) {
                d[k] = s2[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        mergeSort(input);
        printArray(input);
    }
}
