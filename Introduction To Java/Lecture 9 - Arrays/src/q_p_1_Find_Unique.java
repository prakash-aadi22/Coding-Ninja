import java.util.Scanner;

public class q_p_1_Find_Unique {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findUnique(int[] arr) {
        int j;
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            int j = findUnique(arr);
            System.out.println(j);
        }
    }
}
