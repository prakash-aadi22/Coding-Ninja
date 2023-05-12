import java.util.HashMap;
import java.util.Scanner;

public class q_a_3_Pairs_with_difference_K {

    public static int getPairsWithDifferenceK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairCount = 0;
        for (int item : arr) {
            int p1 = item + k;
            boolean flag = item == p1;  //this case is there for k=0
            if (map.containsKey(p1)) {
                pairCount += map.get(p1);
            }
            int p2 = item - k;
            if (map.containsKey(p2) && !flag) {
                pairCount += map.get(p2);
            }
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(getPairsWithDifferenceK(arr, k));
    }
}
