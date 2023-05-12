import java.util.HashMap;
import java.util.Scanner;

public class q_2_Pair_Sum_to_0 {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int PairSum(int[] input, int size) {
        if (size == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : input) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int countPairs = 0;
        for (Integer i : map.keySet()) {
            if (map.containsKey(-i) && i != 0) {
                countPairs = countPairs + (map.get(i) * map.get(-i));
            }
        }
        countPairs = countPairs / 2;
        if (map.containsKey(0)) {
            int val = map.get(0);
            countPairs = countPairs + (val * (val - 1)) / 2;
        }
        return countPairs;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(PairSum(arr, arr.length));
    }
}
