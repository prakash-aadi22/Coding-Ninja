import java.util.*;

public class Main1 {
    public static void countNumberOfAtoms(String[] arr) {
        for(int i=0;i<arr.length;i++){
            Map<String, Integer> map = new HashMap<>();
            Stack<Integer> stack = new Stack<>();
            int n = arr[i].length();
            int j = 0;
            while (j < n) {
                char c = arr[i].charAt(j);
                j++;
                if (c == '(') {
                    stack.push(1);
                } else if (c == ')') {
                    int val = stack.pop();
                    j++;
                    int k = j;
                    while (j < n && Character.isDigit(arr[i].charAt(j))) j++;
                    val *= Integer.parseInt(arr[i].substring(k, j));
                    stack.push(val);
                } else {
                    int k = j - 1;
                    while (j < n && (Character.isLowerCase(arr[i].charAt(j)) || Character.isDigit(arr[i].charAt(j)))) j++;
                    String element = arr[i].substring(k, j);
                    int val = stack.isEmpty() ? 1 : stack.pop();
                    if (j < n && Character.isDigit(arr[i].charAt(j))) {
                        int l = j;
                        while (j < n && Character.isDigit(arr[i].charAt(j))) j++;
                        val *= Integer.parseInt(arr[i].substring(l, j));
                    }
                    map.put(element, map.getOrDefault(element, 0) + val);
                    stack.push(1);
                }
            }
            StringBuilder sb = new StringBuilder();
            List<String> keys = new ArrayList<>(map.keySet());
            Collections.sort(keys);
            for (String key : keys) {
                sb.append(key);
                int val = map.get(key);
                if (val > 1) sb.append(val);
            }
            System.out.println(sb.toString());
        }
    }
}
