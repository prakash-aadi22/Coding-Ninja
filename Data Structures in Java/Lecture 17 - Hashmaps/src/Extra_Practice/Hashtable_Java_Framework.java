package Extra_Practice;

import java.util.Hashtable;
import java.util.Set;

public class Hashtable_Java_Framework {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        System.out.println(ht);
        System.out.println(ht.isEmpty());
        ht.put(0, 1);
        ht.put(1, 2);
        System.out.println(ht);
        System.out.println(ht.size());
        System.out.println(ht.isEmpty());
        System.out.println("---------------------------");
        Set<Integer> s = ht.keySet();
        for (Integer str : s) {
            System.out.println(str);
        }
        System.out.println("---------------------------");
        System.out.println(ht.keySet());
        System.out.println("---------------------------");
        ht.remove(0);
        System.out.println(ht);
        ht.remove(1);
        System.out.println(ht);
    }
}
