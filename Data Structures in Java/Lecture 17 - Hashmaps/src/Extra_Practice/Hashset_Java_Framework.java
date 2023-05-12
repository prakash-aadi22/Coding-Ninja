package Extra_Practice;

import java.util.HashSet;

public class Hashset_Java_Framework {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        hs.add(1);
        hs.add(2);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        hs.remove(0);
        System.out.println(hs);
        hs.remove(1);
        System.out.println(hs);
    }
}
