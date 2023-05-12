import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arraylist_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(98);
        al.add(1);
        al.add(769);
        al.add(53);
        System.out.println(al.size());
        System.out.println("System.out.println(al) --> ");
        System.out.println(al);
        System.out.println("Using for loop --> ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("Using enhanced for loop (with Integer) --> ");
        for (Integer i : al) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Using enhanced for loop (with int) --> ");
        for (int i : al) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("===========================================================");
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(5);
        al1.add(98);
        al1.add(1);
        al1.add(769);
        al1.add(53);
        System.out.println("al1 --> " + al1);
        al1.sort(Comparator.naturalOrder());
        System.out.print("al1.sort(Comparator.naturalOrder()) --> ");
        System.out.println(al1);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(5);
        al2.add(98);
        al2.add(1);
        al2.add(769);
        al2.add(53);
        System.out.println("al2 --> " + al2);
        al2.sort(Comparator.reverseOrder());
        System.out.print("al2.sort(Comparator.reverseOrder()) --> ");
        System.out.println(al2);
        ArrayList<Integer> al3 = new ArrayList<>();
        al3.add(5);
        al3.add(98);
        al3.add(1);
        al3.add(769);
        al3.add(53);
        System.out.println("al3 --> " + al3);
        Collections.sort(al3);
        System.out.print("Collections.sort(al3) --> ");
        System.out.println(al3);
        ArrayList<Integer> al4 = new ArrayList<>();
        al4.add(5);
        al4.add(98);
        al4.add(1);
        al4.add(769);
        al4.add(53);
        System.out.println("al4 --> " + al4);
        Collections.sort(al4, Collections.reverseOrder());
        System.out.print("Collections.sort(al4, Collections.reverseOrder()) --> ");
        System.out.println(al4);
        ArrayList<Integer> al5 = new ArrayList<>();
        al5.add(5);
        al5.add(98);
        al5.add(1);
        al5.add(769);
        al5.add(53);
        System.out.println("al5 --> " + al5);
//        Collections.sort(al5, Collections.reverseOrder());
        al5.sort(Collections.reverseOrder());
        System.out.print("al5.sort(Collections.reverseOrder()) --> ");
        System.out.println(al5);
    }
}
