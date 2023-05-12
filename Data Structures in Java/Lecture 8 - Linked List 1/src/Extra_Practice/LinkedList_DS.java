package Extra_Practice;

import java.util.LinkedList;

public class LinkedList_DS {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        System.out.println(l.size());
        for (int i = 0; i < 11; i++) {
            l.add(i);
        }
        System.out.println(l.size());
        System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
        for (int i : l) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : l) {
            System.out.print(i + " ");
        }
        System.out.println("\n==============================================================================");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l);
        }
        System.out.println();
        for (int ignored : l) {
            System.out.print(l);
        }
        System.out.println();
        for (Integer ignored : l) {
            System.out.print(l);
        }
        System.out.println();
    }
}
