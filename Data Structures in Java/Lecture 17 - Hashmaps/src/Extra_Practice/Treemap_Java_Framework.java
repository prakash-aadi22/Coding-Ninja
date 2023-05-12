package Extra_Practice;

import java.util.Set;
import java.util.TreeMap;

public class Treemap_Java_Framework {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        System.out.println(tm);
        System.out.println(tm.isEmpty());
        tm.put(0, 1);
        tm.put(1, 2);
        System.out.println(tm);
        System.out.println(tm.size());
        System.out.println(tm.isEmpty());
        System.out.println("---------------------------");
        Set<Integer> s = tm.keySet();
        for (Integer str : s) {
            System.out.println(str);
        }
        System.out.println("---------------------------");
        System.out.println(tm.keySet());
        System.out.println("---------------------------");
        tm.remove(0);
        System.out.println(tm);
        tm.remove(1);
        System.out.println(tm);
    }
}
