import java.util.*;

public class Main {
    public static int minCharDeletion(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for (int i : freq.values()) {
            if (!set.add(i)) {
                res += i;
            }
        }
        return res;
    }
}
