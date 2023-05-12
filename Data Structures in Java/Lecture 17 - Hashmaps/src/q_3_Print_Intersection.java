import java.util.HashMap;
import java.util.Scanner;

public class q_3_Print_Intersection {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        if (arr1.length == 0 || arr2.length == 0) {
            return;
        }
        HashMap<Integer, Integer> hmArr = new HashMap<>();
//        for (int i = 0; i < arr1.length; i++) {
//            if (hmArr.containsKey(arr1[i])) {
//                hmArr.put(arr1[i], hmArr.get(arr1[i]) + 1);
//            } else {
//                hmArr.put(arr1[i], 1);
//            }
//        }
        for (int j : arr1) {
            if (hmArr.containsKey(j)) {
                hmArr.put(j, hmArr.get(j) + 1);
            } else {
                hmArr.put(j, 1);
            }
        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (hmArr.containsKey(arr2[i])) {
//                if (hmArr.get(arr2[i]) != 0) {
//                    System.out.println(arr2[i]);
//                    hmArr.put(arr2[i], hmArr.get(arr2[i]) - 1);
//                }
//            } else {
//                continue;
//            }
//        }
        for (int j : arr2) {
            if (hmArr.containsKey(j)) {
                if (hmArr.get(j) != 0) {
                    System.out.println(j);
                    hmArr.put(j, hmArr.get(j) - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = takeInput();
        int[] arr2 = takeInput();
        printIntersection(arr1, arr2);
    }
}
