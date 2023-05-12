package Extra_Practice;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_Java_Framework {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        System.out.println(hm);
        System.out.println(hm.isEmpty());
        hm.put(0, 1);
        hm.put(1, 2);
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println("---------------------------");
        Set<Integer> s = hm.keySet();
        for (Integer str : s) {
            System.out.println(str);
        }
        System.out.println("---------------------------");
        System.out.println(hm.keySet());
        System.out.println("---------------------------");
        hm.remove(0);
        System.out.println(hm);
        hm.remove(1);
        System.out.println(hm);
    }
}
