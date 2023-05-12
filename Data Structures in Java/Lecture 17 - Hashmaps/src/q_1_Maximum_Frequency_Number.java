import java.util.HashMap;
import java.util.Scanner;

public class q_1_Maximum_Frequency_Number {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (hm.containsKey(arr[i])) {
//                hm.put(arr[i], hm.get(arr[i]) + 1);
//            } else {
//                hm.put(arr[i], 1);
//            }
//        }
        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        int max = 0;
        int maxKey = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (hm.get(arr[i]) > max) {
//                max = hm.get(arr[i]);
//                maxKey = arr[i];
//            }
//        }
        for (int i : arr) {
            if (hm.get(i) > max) {
                max = hm.get(i);
                maxKey = i;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(maxFrequencyNumber(arr));
    }
}
