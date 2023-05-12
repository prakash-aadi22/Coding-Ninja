package Extra_Practice;

import java.util.Collections;
import java.util.LinkedList;

public class sort_LinkedList {
    public static void sort(LinkedList<Integer> l) {
        Collections.sort(l);
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 10; i > 0; i--) {
            l.add(i);
        }
        System.out.println(l);
        sort(l);
        System.out.println(l);
    }
}
